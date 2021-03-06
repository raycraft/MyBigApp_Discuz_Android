package com.kit.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonSPUtils extends SharedPreferencesUtils {


    public JsonSPUtils(Context context, String fileName, int mode){
        super(context,fileName,mode);
    }


    /**
     * 使用SharedPreferences保存对象类型的数据 先将对象类型转化为二进制数据，然后用特定的字符集编码成字符串进行保存
     *
     * @param object     要保存的对象
     * @param context
     * @param shaPreName 保存的文件名
     * @param saveLength 保持有多少个object
     */
    public static void saveObject(Context context, String shaPreName, String saveTag, Object object,
                                  int saveLength) {

        if (saveLength <= 0)
            saveLength = Integer.MAX_VALUE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                shaPreName, Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        List<Object> list = getObject(context, shaPreName, saveTag);

        if (null == list) {

            list = new ArrayList<Object>();

        }

        list.add(object);

        Collections.reverse(list);

        List<Object> listLimited = new ArrayList<Object>();

        for (int i = 0; i < list.size() && i < saveLength; i++) {

            listLimited.add(list.get(i));

        }

        Collections.reverse(listLimited);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {

            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(listLimited);
            String strList = new String(Base64.encode(baos.toByteArray(),
                    Base64.DEFAULT));
            editor.putString(saveTag, strList);
            editor.commit();
            oos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
                baos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    /**
     * 根据文件名取得存储的数据对象 先将取得的数据转化成二进制数组，然后转化成对象
     *
     * @param context
     * @param shaPreName 读取数据的文件名
     * @return
     */
    public static List<Object> getObject(Context context,
                                         String shaPreName, String saveTag) {

        List<Object> list;

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                shaPreName, Activity.MODE_PRIVATE);

        String message = sharedPreferences.getString(saveTag, "");

        byte[] buffer = Base64.decode(message.getBytes(), Base64.DEFAULT);

        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);

        try {

            ObjectInputStream ois = new ObjectInputStream(bais);
            list = (List<Object>) ois.readObject();
            ois.close();

            return list;

        } catch (StreamCorruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {

            try {
                bais.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        return null;
    }
}
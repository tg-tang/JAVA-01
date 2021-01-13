package com.tg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class MyClassLoader extends ClassLoader{

    public static void main(String[] args) {
        try {
            Object obj = new MyClassLoader().findClass("Hello.xlass").newInstance();
            Method helloMethod = obj.getClass().getMethod("hello");
            helloMethod.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name){
        // 加载文件
        String path = MyClassLoader.class.getClassLoader().getResource(name).getFile();
        File file = new File(path);
        byte[] bytes = null;
        try {
            // 读取字节数据
            FileInputStream fileInputStream = new FileInputStream(file);
            long filelength = file.length();
            bytes = new byte[(int)filelength];

            fileInputStream.read(bytes);
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 字节数据转换
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (255-bytes[i]);
        }
        // 返回解码的类
        return defineClass("Hello", bytes, 0, bytes.length);
    }

}

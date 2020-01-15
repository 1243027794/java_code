package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/10 13:35
 */
public class ConvertIO {
    public static void main(String[] args) throws IOException {
        String str = "firelist";
        byte[] bytes = str.getBytes();
        //将字节数组转换为字符数组
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8);
        char[] chars = new char[10];
        int read = inputStreamReader.read(chars, 0, str.length());
        System.out.println(read + ":" + String.copyValueOf(chars));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write(str, 0, str.length());
        outputStreamWriter.flush();
        System.out.println(byteArrayOutputStream.toString());

    }
}

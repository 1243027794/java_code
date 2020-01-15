package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 简述：
 * <p>
 * Reader
 * StringReader  CharArrayReader   PipedReader  BufferedReader  InputStreamReader
 * FileReader
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/10 13:54
 */
public class FileIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream("C:\\Users\\MSTY-004\\Desktop\\新建位图图像.bmp");
        char[] buf = new char[1000];
//        int read = fileReader.read(buf, 0, 10);
//        System.out.println(read + ":" + String.copyValueOf(buf));

        FileOutputStream fileWriter = new FileOutputStream("C:\\Users\\MSTY-004\\Desktop\\复制的.bmp");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileWriter);


        InputStreamReader fileInputStream = new InputStreamReader(fileReader, StandardCharsets.ISO_8859_1);
        int size = 0;
        byte[] bytes = new byte[1000];
        //用字符流读写非文本文件会扩大三倍左右
        while ((size = fileReader.read(bytes)) != -1) {
            fileWriter.write(bytes, 0, size);
        }

//        fileWriter.write("新内容");
//        Writer append = fileWriter.append("charSequence");
        fileWriter.close();
        fileReader.close();
    }
}

package io;

import java.io.*;

/**
 * 简述：
 * 缓冲流每次读写一个字符太慢，就一次性读取8k到缓存区，读取数据时从缓存区读取
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/10 10:21
 */
public class BufferIO {
    public static void main(String[] args) throws IOException, InterruptedException {
        //从字符串或者文件或者远程端读取内容到字符读流中
        String source = "fireList";
        StringReader stringReader = new StringReader(source);
        //再将内容读取到缓冲区中
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        //从缓冲区中读取，再处理

        //字符串写流
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);

        //写到缓存区
        bufferedWriter.write(bufferedReader.readLine()+"\n");
        bufferedWriter.write("third\n");
        //刷新缓存区，将不满的缓存区数据发送出去，一次性写到文件中
        bufferedWriter.flush();
        //再从缓存区读取
        System.out.println(stringWriter.getBuffer().toString());

    }
}

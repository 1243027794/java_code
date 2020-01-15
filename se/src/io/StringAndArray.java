package io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 简述：
 *  字符串流
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/10 10:09
 */
public class StringAndArray {
    public static void main(String[] args) throws IOException {
        String str = "fireList";
        StringReader stringReader = new StringReader(str);
        int read = 0;
        while ((read = stringReader.read()) != -1) {
            System.out.println(read);
        }

        //读写流
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("camera_radar");

        StringReader stringReader1 = new StringReader(stringWriter.getBuffer().toString());

        int read1 = 0;
        while ((read1 = stringReader1.read()) != -1) {
            System.out.println(read1 + "");
        }

    }
}

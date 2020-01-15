package io;

import java.io.*;

/**
 * 简述：
 * 管道流，线程间可以通讯
 * 管道写流用管道读流创建对象，向里边写数据就能收到
 * 只有1k的空间
 * 读端阻塞等待数据，有数据就读取
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/10 9:21
 */
public class Pipe {
    public static void main(String[] args) throws InterruptedException, IOException {
        PipedReader pipedReader = new PipedReader();
        int times = 0;
        new Thread(() -> {
            int number = 0;
            try {
                PipedWriter pipedWriter = new PipedWriter(pipedReader);

                while (true) {
                    Thread.sleep(1000);
                    pipedWriter.write('x');
                    System.out.println("send:" + ++number);
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(500);
        while (pipedReader.read() != -1) {
            System.out.println("receive:" + ++times);

        }
        System.out.println("线程退出");
    }
}

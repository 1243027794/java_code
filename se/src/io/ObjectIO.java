package io;


import java.io.*;

/**
 * 简述：
 *
 *      IO设备分类
 *          字符设备：以字符为单位发送和接收数据，数据通讯的虚度比较慢
 *              键盘/显示器/打印机/扫描仪
 *          块设备
 *              外部存储器，以块为单位进行传输的，磁盘/磁带  块的尺寸为512到32768字节之间
 *          网络通讯设备：网卡  调制解调器
 *              远程设备通讯，比字符快，比块设备慢
 *
 *       DMA
 *
 *
 *
 * 同步和异步
 *  同步：发送请求后一直等响应结果
 *  异步：发送后，可以回调/可以轮询
 *
 *  阻塞：返回结果之前，当前线程会被挂起，得到结果后才会返回
 *  非阻塞：不能得到结果立即返回
 *
 *
 *
 * BIO
 *  同步阻塞：服务器实现一个连接一个线程
 *  NIO
 *  同步非阻塞，多个请求一个线程，请求会注册到多路复用器上，多路复用器轮询到连接有IO请求时才启动一个线程处理
 *
 *  AIO
 *  异步非阻塞：多个有效请求一个线程，
 *
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/10 14:46
 */
public class ObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //序列化和反序列化需要用到ObjectInputStream和ObjectOutputStream
        User user = new User();
        user.setName("wlp");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\MSTY-004\\Desktop\\object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        outputStream.close();

        FileInputStream inputStream = new FileInputStream("C:\\Users\\MSTY-004\\Desktop\\object.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        User object = (User) objectInputStream.readObject();
        System.out.println(object.getName());

    }
}

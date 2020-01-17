package thread;

import java.time.Instant;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/16 17:57
 */
public class synchronizedTest implements Runnable {
    //共享资源
    static int i = 0;
    static int j = 0;

    /**
     * synchronized 修饰实例方法
     */
    synchronized void increase() {
        i++;
    }

    synchronized void increasej() {
        j++;
    }
    @Override
    public void run() {
        for (int j = 0; j < 100000000; j++) {
            increase();
            increasej();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long l = Instant.now().toEpochMilli();

        synchronizedTest test = new synchronizedTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long l1 = Instant.now().toEpochMilli();
        System.out.println(l1 - l);
        System.out.println(i);
        System.out.println(j);
    }
}

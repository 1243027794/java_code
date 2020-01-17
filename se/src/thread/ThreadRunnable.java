package thread;

/**
 * 简述：
 *      thread.join();主线程阻塞等待子线程结束
 *          子线程中有耗时操作，主线程要用子线程中结果，主线程就要阻塞等待子线程结束
 *
 *      thread.yield();暂停正在执行的线程，并执行其它线程
 *
 *      wait();
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/16 17:06
 */
public class ThreadRunnable implements Runnable {
    String name;
    int i = 0;

    public ThreadRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

//        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(name + ":" + ++i);
            } catch (InterruptedException e) {

            }
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new ThreadRunnable("thread1"));
        Thread thread2 = new Thread(new ThreadRunnable("thread2"));
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        System.out.println("waiting");
        thread1.join();
        thread2.join();
        System.out.println("stop");
    }
}

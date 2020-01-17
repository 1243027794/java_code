package thread;

import java.util.Scanner;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/16 15:41
 */
public class ThreadDemo1 extends Thread {

    String name;

    private ThreadDemo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("new thread");
    }

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1("new");
        threadDemo1.start();
        System.out.println(threadDemo1.getName());
    }
}

/**
 * 状态
 *    NEW：创建了还未启动的状态
 *    RUNNABLE：正在执行的状态
 *    TERMINATED：退出的线程的状态
 *
 */
class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        //通过匿名内部类创建，lambda表达式，实现了Runnable接口中的run抽象方法
        Thread thread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            scanner.nextDouble();
//            while (true);
//            try {
//                Thread.sleep(100000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        });
        thread.start();
        thread.wait();
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
//        System.out.println(thread.getStackTrace()[0]);
        Thread.sleep(1000);
        System.out.println(thread.getState());

    }
}
package thread;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/16 16:31
 */
public class ThreadInterrupt implements Runnable {
    public static volatile boolean on = false;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadInterrupt());
        thread.start();
        Thread.sleep(1100);
//        ThreadInterrupt.on = true;
        thread.interrupt();
        System.out.println();
    }

    @Override
    public void run() {
        while (!on){
            try {
                Thread.sleep(1000);
            System.out.println(Thread.currentThread().isInterrupted());
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("线程终止");
                    return;
                }
                System.out.println("running");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

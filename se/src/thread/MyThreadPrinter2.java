package thread;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/16 17:40
 */

public class MyThreadPrinter2 implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    private MyThreadPrinter2(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 4;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notify();
                }

                try {
                    //让线程阻塞，并且释放对象锁
                    prev.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 线程1先启动，c被上锁，a被上锁
     * 线程2启动，a被上锁，b被上锁
     * 线程3启动，b被上锁，c被上锁
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        MyThreadPrinter2 pa = new MyThreadPrinter2("A", c, a);
        MyThreadPrinter2 pb = new MyThreadPrinter2("B", a, b);
        MyThreadPrinter2 pc = new MyThreadPrinter2("C", b, c);

        new Thread(pa).start();
        Thread.sleep(1);  //确保按顺序A、B、C执行

        new Thread(pc).start();
        Thread.sleep(1);


        new Thread(pb).start();
        Thread.sleep(1);

    }
}

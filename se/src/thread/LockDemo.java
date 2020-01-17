package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/17 14:07
 */
public class LockDemo implements Runnable {
    private  final ReentrantLock lock = new ReentrantLock();
    private  final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @Override
    public void run() {
//        lock.lock();
        Condition condition = lock.newCondition();
        condition.signal();
        readWriteLock.readLock().lock();
        System.out.println("waiting");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        lock.unlock();
        readWriteLock.readLock().unlock();
    }

    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo();
        new Thread(lockDemo).start();
        new Thread(lockDemo).start();
        new Thread(lockDemo).start();

    }
}

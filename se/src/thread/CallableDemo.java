package thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/17 13:38
 */
public class CallableDemo implements Callable<String> {
    private final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future submit = executorService.submit(new CallableDemo());
        System.out.println(submit.get());
    }


    @Override
    public String call() throws Exception {
        lock.lock();
        System.out.println("waiting");
        Thread.sleep(5000);

        return "str";
    }
}

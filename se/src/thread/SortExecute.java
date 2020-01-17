package thread;

import javax.jws.Oneway;

/**
 * 简述：
 *  让线程顺序打印
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/17 11:15
 */
public class SortExecute implements Runnable {
    private String  name;
    private Object pre;
    private Object self;

    public SortExecute(String name, Object pre, Object self) {
        this.name = name;
        this.pre = pre;
        this.self = self;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name);

        }
    }

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        new Thread(new SortExecute("A",a,c)).start();
    }






}

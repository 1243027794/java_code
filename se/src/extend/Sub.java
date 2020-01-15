package extend;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/9 16:00
 */
class Base {
    public Base() {
        System.out.println("父类构造器");
        this.test();
    }

    public void test()           // ①号test()方法
    {
        System.out.println("将被子类重写的方法");
    }
}

public class Sub extends Base {
    private String name = "aa";

    public Sub() {
        super();
        System.out.println("子类构造器");
    }

    public void test()         // ②号test()方法
    {
        System.out.println("子类test");
        System.out.println("子类重写父类的方法，" + "其name字符串长度" + name.length());
    }

    public static void main(String[] args) {
        // 下面代码会引发空指针异常
        Sub s = new Sub();
    }

}

package modifer.test;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 17:23
 */
public class StaticDemo {
    private static final String name = "ad";

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(name);

    }

}

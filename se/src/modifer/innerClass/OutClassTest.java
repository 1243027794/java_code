package modifer.innerClass;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 17:27
 */
public class OutClassTest extends OutClass {

    public static void main(String[] args) {
        //在一个包内，默认包内私有可以创建对象
        InnerClass innerClass = new InnerClass();

    }
}

package modifer.innerClass;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 10:06
 */
public interface InterfaceDemo {
    //属性默认类型为public staticDemo final 类型
    int a = 0;

    //接口默认类型是共有抽象的，实现接口必须都要实现这些方法
    void print();

    /**
     * 接口中可以定义静态方法，就不是默认抽象类型了
     */
    static void out() {
        System.out.println("interface out method print");
    }

    //
    static void main(String[] args) {
        InterfaceDemo.out();
    }
}

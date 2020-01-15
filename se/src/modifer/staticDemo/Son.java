package modifer.staticDemo;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 17:35
 */
public class Son extends AbstractClassDemo {


    //    void eat(){
//        System.out.println("son rice");
//    }

    public static void main(String[] args) {
        AbstractClassDemo abstractClassDemo = new AbstractClassDemo();
//        abstractClassDemo.print();

//        print();
        //父类的引用指向子类的对象，调用的都是子类重写后的方法，如何没有重写就调用父类自己的方法
        AbstractClassDemo son = new Son();
//        son.print();
        son.eat();
    }
}

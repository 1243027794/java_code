package modifer.innerClass;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import modifer.Address;
import modifer.User;

/**
 * 简述：
 * <p>
 * 内部类不加static属性时，只能先创建了外部类再创建内部类
 * 加static修饰时，通过外部类名就可以创建内部类对象
 * 内部类是一个相对独立的概念
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 10:07
 */
public class OutClass extends User {

     static class InnerClass extends Address implements InterfaceDemo {

        @Override
        public void print() {
            System.out.println("inner class print");
        }
    }

    private InnerClass /*InterfaceDemo*/ returnObj() {
        return new InnerClass();
    }

    /*
     *   匿名内部类，在一个方法中创建一个类实现一个接口或者继承一个类
     *   方法内部类
     * */
    public void noNameInnerClass() {
        //实现一个接口
        ((InterfaceDemo) () -> {
            int a = 1;
            System.out.println("implement print");
        }).print();

        //继承一个类
        new Address() {
            {
                System.out.println("noNameInnerClass print");
            }
        }.pirnt();

    }


    public static void main(String[] args) {
        OutClass outClass = new OutClass();


        {
            //加static修饰内部类时的创建方法
//            InnerClass innerClass = new OutClass.InnerClass();

            //内部类为不加static的创建方式   对象.对象的方式才能创建
//            InnerClass out = new OutClass().new InnerClass();


        }
        //返回一个实体类，不看代码不知道是什么类型，实现了很好的隐藏
        InnerClass /*InterfaceDemo*/ interfaceDemo = outClass.returnObj();
        interfaceDemo.print();

        //内部类继承一个类，外部类继承一个类，先实现了多继承，但是不能隐藏内部类细节了，返回内部类类型才能访问内部类中继承的属性
        //父类的引用指向子类的对象，调用的都是子类重写之后的方法，不能调用子类对象的属性
        String address = interfaceDemo.address;
        String ph = outClass.phone;

        //继承一个类和实现一个接口时，发现他们的方法相同了，实现接口方法时是实现了方法还是重写了方法，无法确认，通过内部类可以解决这个问题

        System.out.println("-------");

        outClass.noNameInnerClass();
    }
}

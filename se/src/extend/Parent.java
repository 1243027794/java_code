package extend;

import java.io.IOException;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/9 13:38
 */
abstract class Parent {
    String parentName = "parent";

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类构造代码块");
    }

//    private Parent() {
//        System.out.println("父类无参构造方法被调用");
//    }

    Parent(String parentName) {
//        this();
        System.out.println("父类有参构造方法被调用");
    }

    Object print(String str) throws IOException {
        System.out.println(str);
        return "";
    }

    static class InnerClass {
    }
}

class Son extends Parent {
    private Son(String SonName) {
        super("name");
        System.out.println("子类构造方法被调用");
    }

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    /**
     * 子类抛异常小于等于父类异常
     * 子类返回值类型比父类返回值类型更小或相等
     *
     * @param str
     * @return
     * @throws Exception
     */
//    @Override
    String print(String str, int age) throws NullPointerException {
//        super.print(str);
        System.out.println("son print");
        return "";
    }

    String sonName = "son";
    InnerClass aClass = new InnerClass();


    public static void main(String[] args) {
//        Son son = new Son("name");
//        System.out.println(son.name);
//        System.out.println(son.name1);
//        son.print();
//        print();


        /**
         * 为什么子类构造方法会默认调用父类构造方法？？？？？？
         * 创建子类时，子类构造方法会调用父类否早方法，否则父类的引用没办法调用父类的实例属性
         * 不写构造方法，系统生成默认无参构造方法，无参方法中默认调用父类无参构造方法
         * 父类没有无参构造方法，子类需要在构造方法中手动调用父类构造方法
         *
         */
        Parent son = new Son("name");
        System.out.println(son.parentName);
        System.out.println("---------------");

        /**
         *  继承的执行顺序
         *      父类先执行，所有类先加载再实例化，可能继承了静态变量，会用到
         *      所有父类类构造方法先执行，静态变量初始化，执行静态代码块
         *      所有父类构造代码块和构造方法再执行
         *      静态代码块优于main方法执行
         */

        /**
         * 重写条件：返回值和抛出的异常都按父类执行的，所以返回值和异常都小于等于父类，权限大于等于父类权限才能保证可以执行
         *  两重两小一大
         *   返回值类型小：多态时父类引用调用子类对象的方法，
         *   异常小：
         *   权限大：本来父类方法可以执行的位置，保证可以运行
         */
        //返回值类型为父类中方法的类型，大于父类类型，会报错
        //抛出的异常为父类的异常，大于父类的异常，没办法处理
        try {
            Object ddd = son.print("ddd");

            Son son1 = new Son("");
            son1.print("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 重载主要是本类中的方法被重载
         * 重载实现了本类的多态
         *  只有方法名相同,参数必须不同，和返回值无关的方法，不能用于多态中，用于本类的引用
         */
        /**
         * 尽量不要在父类构造方法中调用子类重写的方法
         *      父类类构造方法先执行，子类类构造方法在执行
         *      执行父类实例构造方法时调用子类重写的方法，子类还未初始化
         * 不想被重写加final
         * 不想被访问加protected
         * 父类不需要外部访问的都设为private
         *
         */

    }
}
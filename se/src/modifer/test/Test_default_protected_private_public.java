package modifer.test;

import modifer.User;
import modifer.innerClass.OutClass;

/**
 * 简述：
 * 类
 * 只能是public或者默认不写，只能本包访问
 * 类内可拥有哪些元素
 * 属性：public/protected/private/default
 * 方法：public/protected/private/default
 * 代码块：在类加载和创建对象的时候使用，能访问到类就要能执行，不能加访问权限修饰符
 * 内部类：内部类不同于外部类，可以加访问权限修饰符，为什么？
 * 可以对外隐藏，
 * <p>
 * 访问权限修饰符
 * 创建类的对象时候，可不可以访问
 * private:java文件内私有，只能本类中使用。   内部类可以访问，本文件之内的其它类不能访问
 * default：包内私有，
 * protect：包内私有，包外继承该类也可以访问
 * public：都可以访问
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 9:19
 */
public class Test_default_protected_private_public extends User {

    /**
     * 类和类之间的关系，按耦合性强弱排序    可以对其它类进行操作的权限的大小
     * 继承：可以获得protect和public的部分，可以重写和重载，关系性太强
     * 实现：必须实现接口中的所有方法 public abstract方法
     * 组合：类引用作为属性存在，是类必须的属性，同生共死，非同包下，不能访问protect类型，不能重写和重载，耦合性弱一些
     * 聚合：类应用作为属性存在，可以有可以无  人房车的关系
     * 关联：两个类相互独立
     * 依赖：类引用类型存在方法中（形参 返回值  方法局部变量）,传递接口实现多态
     * <p>
     * 继承和关联如何选择？？？？？？？？？？
     *
     * 继承缺点
     *      无法多继承
     *      方法和属性五条件继承，容易造成方法污染
     *      继承的方法是静态复用，不能在运行时发生变化，不够灵活
     *      满足以下条件用继承
     *          父类中所有方法和属性，子类都适用
     *
     * 方法中可以用接口类型实现多态和解耦
     * <p>
     * 通过接口可以实现两个类的解耦，两个类实现了解耦
     *
     * @param args
     */
    public static void main(String[] args) {
        //子类继承父类之后可以访问非同包父类的protected属性
        Test_default_protected_private_public test = new Test_default_protected_private_public();
        String phone = test.phone;//内部包在外部包内，也不属于同一个包，只能访问public修饰的部分
        Integer age = test.age;

        //不在一个包内只能访问public修饰的成员变量
        User user = new User();
        String ph = user.phone;

        //和OutClass不在一个包中，内部类是public时才能访问
//        OutClass.InnerClass innerClass = new OutClass.InnerClass();

    }


}

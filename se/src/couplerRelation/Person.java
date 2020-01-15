package couplerRelation;

/**
 * 简述：
 * <p>
 *     格式
 *      父类 变量名 = new 子类();
 *
 * instanceof:子类对象的引用可以是父类的实例
 *
 *
 * 父类的引用指向子类的对象，先调用重写之后的方法，没重写就去父类中找，最小父类类型
 * 引用类型为本类，在所有方法中寻找最接近参数类型的方法调用
 *
 * <p>
 * 多态的转型分为向上转型和向下转型
 * 向上转型：父类引用指向子类对象，多态本身就是向上转型的
 * 向下转型：一个已经向上转型成功的子类对象，使用强制类型转换转换为子类引用
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/9 10:08
 */
public class Person {
    public void breath() {
        System.out.println("can breath");
    }

    public void run() {
        System.out.println("can run");
    }

    public static void main(String[] args) {
        Person stu = new Stu();
        stu.breath();

        System.out.println(stu instanceof Person);
        System.out.println(stu instanceof Stu);
        System.out.println(stu instanceof Object);


    }
}

class Stu extends Person {

    private static void  printf(Object object){
        System.out.println("Object type");
        System.out.println(object);
    }
    private static void  printf(String object){
        System.out.println("String type");
        System.out.println(object);
    }
    public void study() {
        System.out.println("can study");
    }

    public static void main(String[] args) {
        printf(11);
    }
}

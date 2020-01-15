package generic;

import reflect.Beacon;

import java.io.ObjectOutputStream;
import java.util.Map;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 15:41
 */
public class GenericTest {



    public static void main(String[] args) {

        /*
             泛型类
                  类型参数只能为类类型，不能为简单类型

                  泛型类型实参一定要传码？
                      传入泛型实参，会根据传入的泛型参数做限制
                      不传实参，在泛型中使用泛型犯法或成员变量定义的类型可以为任意类型
                  确定的泛型类不能使用instanceof操作

                  集合的实现就是利用的泛型
         */
//        Generic generic = new Generic(2);
//        System.out.println(generic.getVar());
//
//        Beacon beacon = new Beacon();
//        if(beacon instanceof Beacon){
//            System.out.println(true);
//        }
//
//        if(generic instanceof Generic){
//            System.out.println(true);
//        }
//        Object o = new Object();
//        Class<Object> aClass = (Class<Object>) o.getClass();
//        System.out.println(aClass instanceof  Class<?> );
        /**
         *   通配符？
         *       ？是一种实参类型,是所有实参的父类  <T>定义泛型形参
         *   通配符上限
         *       Box<? extends Number>   //实体类继承Number ，是number的子类
         *   通配符下限
         *       Box<? super Number>     //只能接收Number或者Number的父类
         */

        /**
         * 泛型接口
         *     未传入泛型实参时
         *          与泛型类的定义相同，声明类型的时候需要将泛型的声明也一起加到类中
         *     传入泛型实参时
         *          泛型类型传入实参时，多有用到泛型的地方都要替换为传入的实参类型
         */

//        FruitGenerator<Beacon> objectFruitGenerator = new FruitGenerator<>();
//        objectFruitGenerator.next();

//        BeaconGeneric beaconGeneric = new BeaconGeneric();
//        Beacon next = beaconGeneric.next();
//        System.out.println(next);
//        String str = beaconGeneric.genericMethod("str");
//        System.out.println(str);


        /**
         * 泛型方法
         *      不是泛型方法
         *          public T methodName(){};
         *      泛型方法
         *          用到<T>才是泛型方法
         *          用到的T和类中的T不是一个T
         */

        /**
         * 泛型方法和可变参数
         *     泛型方法的参数类型可以为泛型类型时，也可以为可变参
         *          可以传入多个不同类型的参数
         *
         *      静态方法不能使用泛型类中定义的形参类型，要使用泛型需要将静态方法也定义成泛型方法
         */
//        beaconGeneric.genericMethod("a", true, 1);



        Generic generic =new Generic();
    }





















}

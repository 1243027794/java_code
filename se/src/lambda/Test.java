package lambda;

import java.io.ObjectOutputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/14 17:13
 */
public class Test {
    public static void main(String[] args) {

        //用@FunctionalInterface 函数接口 类型做引用，右边是函数接口中的方法
        Runnable runnable = ()-> System.out.println("");
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.forEach(System.out::println);

        Collection<Integer> collection = new ArrayList<>();
        collection.add(4);
        collection.add(5);
        collection.removeIf(Predicate.isEqual(4));
        collection.forEach(System.out::println);


//        Predicate<String> predicate = Test::test;
//
//        System.out.println(predicate.test(""));
//        System.out.println(predicate.test("dd"));


        Consumer<String> consumer = Test::accept;
    }

    private static boolean test(String String) {
        return false;
    }

    private static void accept(String String) {
    }
}

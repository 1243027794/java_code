package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/15 9:56
 */
public class MyPredicateTest {
    /**
     * 过程
     *  现有一个产品类
     *  要按颜色和价格两种方式去筛选产品
     *      写两个方法分别去筛选颜色和价格
     *      只有判断条件不一样
     *
     *  设计模式优化：定义一个方法，继承类去实现
     *  匿名内部类优化：调用时创建接口对象
     *  lambda表达式优化：用的是匿名内部类方式，只是减少了代码量
//     * @param list
//     * @param myPredicate
     * @return
     */
//    private static List<Product> filterProductByPredicate(List<Product> list, MyPredicate<Product> myPredicate) {
//        ArrayList<Product> products = new ArrayList<>();
//        for (Product product : list) {
//            if (myPredicate.test(product)) {
//                products.add(product);
//            }
//        }
//        return products;
//    }

    public static void main(String[] args) {
        List<Product> lists = new ArrayList<>();
        lists.add(new Product("red", 4000));
        lists.add(new Product("red", 9000));
        lists.add(new Product("red", 100));
        lists.add(new Product("red", 1200));
        lists.add(new Product("red", 10));

//        //利用匿名内部类实现
//        List<Product> products = filterProductByPredicate(lists, new MyPredicate<Product>() {
//            @Override
//            public boolean test(Product product) {
//                return product.getPrice() < 8000;
//            }
//        });
//
//        for (Product product : products) {
//            System.out.println(product.getPrice());
//        }
//
//        //利用lambda表达式优化，直接替换内部类
//        List<Product> productList = filterProductByPredicate(lists, product -> product.getPrice() < 8000);
//
//        for (Product product : products) {
//            System.out.println(product.getPrice());
//        }

        lists.stream().filter(product -> product.getPrice() < 5000).forEach((product)->System.out.println(product.getPrice()));

        boolean red = lists.stream().findAny().equals(new Product("red", 10));
        System.out.println(red);

    }
}

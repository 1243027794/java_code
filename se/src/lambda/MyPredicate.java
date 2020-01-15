package lambda;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/15 9:54
 */
public interface MyPredicate<T> {
    boolean test(T t);
}

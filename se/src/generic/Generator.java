package generic;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 15:45
 */
public interface  Generator<T> {
    public T next();
    public <T> void  genericMethod(T... o);

}

package abstractInterface;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/13 11:12
 */
public interface TestInterface {
        public static final Integer a  =1;
    default void print(){
        System.out.println();
    }
}

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/20 17:38
 */
public class Person {
    private static Person person = new Person();

    private  Person() {
    }

    public static Person getInstance(){
        return person;
    }
}

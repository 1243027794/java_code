package modifer;

import modifer.innerClass.InterfaceDemo;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 9:55
 */
public class User implements InterfaceDemo {
    private String name;
    String sex;
    protected Integer age;
    public  String phone;

    @Override
    public void print() {

    }

    public static void main(String[] args) {
        InterfaceDemo user = new User();
    }
}

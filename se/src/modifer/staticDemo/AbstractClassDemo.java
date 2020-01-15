package modifer.staticDemo;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 17:34
 */
class AbstractClassDemo {

    private String name;
    void init(String name) {
        this.name =name;
        System.out.println("parent print ");
    }

    void eat() {
        System.out.println("parent rice");
    }
}

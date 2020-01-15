package reflect;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 11:22
 */

public class Beacon {
    private String name;
    private Integer major;
    private Integer minor;

    public Beacon() {
    }

    public Beacon(String name, Integer major, Integer minor) {
        this.name = name;
        this.major = major;
        this.minor = minor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getMinor() {
        return minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    public <T> T setRssi(T t) {
        return t;
    }

    //静态方法不能使用泛型类中定义的类型
//    public staticDemo void staticMethod(T t) {
//    }

    @Override
    public String toString() {
        return "Beacon{" +
                "name='" + name + '\'' +
                ", major=" + major +
                ", minor=" + minor +
                '}';
    }
}

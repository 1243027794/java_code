package modifer.finalD;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 简述：
 * final修饰的类不能被继承
 * 修饰的属性不能更改
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/9 16:31
 */
class FinalDe {
    static final String str;

    static {
        str = "dfdfdff";
    }

    public final Integer print() {
        System.out.println();
        return 1;
    }
}


class Demo extends FinalDe {
    //引用修饰对象时，引用不能改，属性可以改
    private static final List<String> list = new ArrayList();

    public void print(String name) {
        System.out.println();
    }

    public static void main(String[] args) {
        FinalDe finalDe = new FinalDe();
//        finalDe.str = "ddd";
        System.out.println(finalDe.str);
        list.add("d");
        list.add("dd");

        FinalDe finalDe1 = new FinalDe();
        finalDe1.print();

    }
}

interface InDemo {
}
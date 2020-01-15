package generic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/24 19:56
 */
public class GenericDemo2 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.getClass().getMethod("add",Object.class).invoke(list,"dddd");
//
        for (Object item: list){
            System.out.println(item);//类型转换错误,如果将Integer改为Object就不会有问题
        }
        System.out.println(list.get(1));

        //原始类型替换为Object
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println(arrayList.getClass() == arrayList1.getClass());
    }
}

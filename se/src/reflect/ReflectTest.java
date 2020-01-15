package reflect;

import generic.Generic;
import java.util.Properties;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 11:24
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
//        Class cls1 = Class.forName("reflect.Beacon");
        //具体类型实参的父类
//        Class<?> aClass = Class.forName("reflect.Beacon");

//        Class cls2 = Beacon.class;
//        Beacon beacon = new Beacon();
//        Class cls3 = beacon.getClass();



//
//        //field   成员属性
///*        Field[] fields = cls1.getFields();
//        for (Field field : fields) {
//            System.out.println("public fields" + field);
//        }
//        Field[] declaredFields = cls3.getDeclaredFields();
//        for (Field field : declaredFields) {
//            System.out.println("all field:" + field);
//        }
//
//        Field name = cls3.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(beacon,"msyt");
//        System.out.println(name.get(beacon));*/
//
//        /**
//         *  构造方法
//         *      获得构造方法，创建对象
//         */
///*        Constructor declaredConstructor = cls1.getDeclaredConstructor(String.class,Integer.class,Integer.class);
//        Beacon o = (Beacon) declaredConstructor.newInstance("sywh",1,2);
//        System.out.println(o);*/
//
//        /**
//         *  成员方法
//         *      获取类中的方法名
//         *      通过方法名调用对象中额方法
//         */
//        Method setName = cls1.getDeclaredMethod("setName", String.class);
//        setName.invoke(beacon, "sywh_msyt");
//        System.out.println(beacon);

//        Properties property = new Properties();
//        ClassLoader classLoader = Beacon.class.getClassLoader();
//        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
//        property.load(resourceAsStream);


//        FileReader fileReader = new FileReader("F:\\study\\java_code\\se\\src\\pro.properties");
//        property.load(fileReader);
//        String className = property.getProperty("className");
//        System.out.println(className);
//        Object methodName = property.get("methodName");
//        System.out.println(methodName);
//
//        Class aClass = Class.forName(className);
//        Method method = aClass.getMethod((String) methodName, String.class);
//
//        Object o = aClass.newInstance();
//        method.invoke(o,"sdfdsdf");
//        System.out.println(o);


/*        ArrayList arrayList = new ArrayList();
        arrayList.add("beacon");
        arrayList.add(1);
        for (Object arrayList1:arrayList){
            System.out.println(arrayList1);
        }*/

        Class<?> aClass = Class.forName("reflect.AA");
        System.out.println(aClass);
    }
}

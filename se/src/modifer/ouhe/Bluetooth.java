package modifer.ouhe;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/8 11:47
 */
public class Bluetooth {
    String name;
    BeaconInterface beacon;
    Beacon beaconObj/* = new Beacon()*/;

    public static void main(String[] args) {
        Bluetooth bluetooth = new Bluetooth();
        //利用多态不能调用子类的属性
        bluetooth.beacon.toString();
        String name = bluetooth.beaconObj.name;
        System.out.println(name);


    }
}

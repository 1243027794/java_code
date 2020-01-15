package generic;

import reflect.Beacon;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 16:00
 */
public class BeaconGeneric implements Generator<Beacon> {


    @Override
    public Beacon next() {
        return null;
    }

    @Override
    public <T> void genericMethod(T... o) {
        for(T item:o){
            System.out.println(item);
        }
    }
}

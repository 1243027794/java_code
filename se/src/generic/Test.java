package generic;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        DateInter dateInter = new DateInter();
        dateInter.setValue(new Date());
//        dateInter.setValue(new Object()); //参数类型发生了变化，重载了，而不是重写，但是如果重载了
        ArrayList<String> arrayList = new ArrayList<>();

    }
}
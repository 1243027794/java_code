package com.msyt.radarserver;

import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/25 12:25
 */
@RestController
public class RadarController {
    @PostMapping("/firew/radar/info")
    public String returnString(@RequestBody String radarData) {
        System.out.println(radarData);
        return radarData.toString();
    }

//    public String returnString(String str) {
//        System.out.println(str);
////        return radarData.toString();
//        return str;
//    }

    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>();
        User user1 = new User("111");
        User user2 = new User("111");
        users.add(user1);
        users.add(user2);
        System.out.println(users.size());

        System.out.println(users.contains(new GoodUser("111")));
    }


}
class User implements Comparable<User> {
    private String id;

    public User(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        return id.compareTo(o.id);
    }
}

class GoodUser extends User {
    public GoodUser(String id) {
        super(id);
    }
}
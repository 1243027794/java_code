package com.msyt.radarserver;

import lombok.Data;

import java.util.List;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/25 14:30
 */

@Data
public class RadarData {
    private String name;
    private String img;
    private List<FireCoordinate> fire_list;

    @Data
    private static class FireCoordinate{
        private Double longitude;
        private Double latitude;
    }

    @Override
    public String toString() {
        return "RadarData{" +
                "name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", fire_list=" + fire_list +
                '}';
    }


//    @Override
//    public String toString() {
//        return "RadarData{" +
//                "name='" + name + '\'' +
//                ", img='" + img + '\'' +
//                '}';
//    }
}

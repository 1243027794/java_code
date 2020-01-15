/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/20 17:41
 */
public class Test {

    // 计算方位角,正北向为0度，以顺时针方向递增
    public static double computeAzimuth(double lat1,double lon1,double lat2,double lon2 ) {
        double result = 0.0;

        int ilat1 = (int) (0.50 + lat1 * 3600000000.0);
        int ilat2 = (int) (0.50 + lat2 * 3600000000.0);
        int ilon1 = (int) (0.50 + lon1 * 3600000000.0);
        int ilon2 = (int) (0.50 + lon2 * 3600000000.0);

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        if ((ilat1 == ilat2) && (ilon1 == ilon2)) {
            return result;
        } else if (ilon1 == ilon2) {
            if (ilat1 > ilat2)
                result = 180.0;
        } else {
            double c = Math
                    .acos(Math.sin(lat2) * Math.sin(lat1) + Math.cos(lat2)
                            * Math.cos(lat1) * Math.cos((lon2 - lon1)));
            double A = Math.asin(Math.cos(lat2) * Math.sin((lon2 - lon1))
                    / Math.sin(c));
            result = Math.toDegrees(A);
            if ((ilat2 > ilat1) && (ilon2 > ilon1)) {
            } else if ((ilat2 < ilat1) && (ilon2 < ilon1)) {
                result = 180.0 - result;
            } else if ((ilat2 < ilat1) && (ilon2 > ilon1)) {
                result = 180.0 - result;
            } else if ((ilat2 > ilat1) && (ilon2 < ilon1)) {
                result += 360.0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        for (double i = -180; i <=180 ; i=i+0.01) {
//
//        }

        System.out.println(computeAzimuth(0.0,0,-10,10));

    }
}

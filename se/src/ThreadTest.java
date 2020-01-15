/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 14:23
 */
public class ThreadTest {

    public static void main(String[] args) throws Exception {
        new Thread(()->{
            int i = 1;
            int j = i/0;
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("子线程打印");
            }
        }).start();

        while(true){
            Thread.sleep(1000);
            System.out.println("主线程打印");
        }
    }
}

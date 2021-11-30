package cn.alenc.birthdaymanagement.sync;

public class SyncDemoTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("a开始运行");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a结束运行");
        });

        Thread t2 = new Thread(()->{
            System.out.println("b开始运行");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b结束运行");
        });

        Thread t3 = new Thread(()->{
            System.out.println("c开始运行");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("c结束运行");
        });




        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

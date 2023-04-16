package thread;

public class FunDemo05 {

    /**
     * 线程的合并
     *     join方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main  start ...");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() + " 子线程执行了...");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        t1.start();
//        try {
//            t1.join(); // 线程的合并，和主线程合并  相当于我们直接调用了run方法
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
        //111




        System.out.println("main end ...");
    }
}
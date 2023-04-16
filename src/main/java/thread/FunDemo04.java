package thread;

public class FunDemo04 {

    /**
     * isAlive方法
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

        System.out.println("main  start ...");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " .... ");
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("线程的状态："+t1.isAlive());
        t1.start();
        System.out.println("线程的状态："+t1.isAlive());
        Thread.sleep(100);
        System.out.println("线程的状态："+t1.isAlive());
        System.out.println("main  end ...");
    }
}
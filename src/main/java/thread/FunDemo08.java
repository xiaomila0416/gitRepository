package thread;

public class FunDemo08 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new FunDemo08();
        t1.start();
        Thread.sleep(3000);
         t1.interrupt(); // 中断线程 将中断标志由false修改为了true
        // t1.stop(); // 直接就把线程给kill掉了
        System.out.println("main .... ");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " start...");
        int i = 0 ;
        // Thread.interrupted() 如果没有被中断 那么是false 如果显示的执行了interrupt 方法就会修改为 true
         while(!Thread.interrupted()){
        //while(!Thread.currentThread().isInterrupted()){
             try {
                 Thread.sleep(10000);
             } catch (InterruptedException e) {
                 System.out.println(Thread.currentThread().isInterrupted());
                 e.printStackTrace();
                 break;
             }
             System.out.println(this.getName() + " " + i);
            i++;
        }

        System.out.println(this.getName()+ " end .... ");

    }
}
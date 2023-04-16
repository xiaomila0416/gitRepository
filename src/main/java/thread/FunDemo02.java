package thread;

import java.util.Date;

public class FunDemo02 {

    /**
     * 练习2：设计一个线程：运行10秒后被终止(掌握线程的终止方法)
     * @param args
     */
    public static void main(String[] args)  throws Exception{
        MyRunable02 runnable = new MyRunable02();
        new Thread(runnable).start();
        Thread.sleep(10000); // 主线程休眠10秒钟
        runnable.flag = false;
        System.out.println("main、  end ...");
    }
}

class MyRunable02 implements Runnable{

    boolean flag = true;

    @Override
    public void run() {
        while(flag){
            try {
                Thread.sleep(1000);
                System.out.println(new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 执行完成");
    }
}
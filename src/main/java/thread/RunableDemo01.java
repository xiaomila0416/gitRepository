package thread;

/**
 * @author 江朋俊
 * @create 2023-04-13 22:50
 */
public class RunableDemo01 {

    /**
     * 线程的第二种方式
     *     本质是创建Thread对象的时候传递了一个Runable接口实现
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main执行了...");
        // 创建一个新的线程  Thread对象
        Runnable r1 = new RunableTest();
        Thread t1 = new Thread(r1);
        // 启动线程
        t1.start();
        System.out.println("main结束了...");
    }
}

/**
 * 线程的第二种创建方式
 *   创建一个Runable接口的实现类
 */
class RunableTest implements Runnable{


    public void run() {
        System.out.println("子线程执行了...");
    }
}

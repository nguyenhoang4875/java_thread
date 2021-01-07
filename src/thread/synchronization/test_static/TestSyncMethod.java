package thread.synchronization.test_static;


public class TestSyncMethod {
    public static void main(String[] args) {
       Table obj1 = new Table();
        Table obj2 = new Table();
       MyThread1 t1 = new MyThread1(obj1);
        MyThread2 t2 = new MyThread2(obj2);
        t1.start();
        t2.start();
    }
}







package thread.synchronization.test_static;

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.staticMethod(5);
    }

}

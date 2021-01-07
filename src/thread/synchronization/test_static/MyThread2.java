package thread.synchronization.test_static;

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.staticMethod(100);
    }
}

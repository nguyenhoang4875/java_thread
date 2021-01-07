package thread.synchronization.method;

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.syncMethod(100);
    }
}

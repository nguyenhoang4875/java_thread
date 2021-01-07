package thread.synchronization.block;

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    MyThread1(){

    }
    public void run() {
        t.syncBlock(5);
    }

}

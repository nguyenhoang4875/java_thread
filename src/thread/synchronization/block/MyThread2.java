package thread.synchronization.block;

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    MyThread2(){

    }

    public void run() {
        t.syncBlock(1000);

    }
}

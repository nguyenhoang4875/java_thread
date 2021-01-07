package thread.interrupt;

public class TestInterrupt {

    public static void main(String args[]) {
        TestInterruptingThread1 t1 = new TestInterruptingThread1();
        t1.start();
        System.out.println("t1 is interrupted static: "+ t1.interrupted());
        System.out.println("t1 is interrupted: "+t1.isInterrupted());
        try {
            t1.interrupt();
            System.out.println(t1.isInterrupted());
            System.out.println("t1 is interrupted static: "+ t1.interrupted());
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }

    }
}

class TestInterruptingThread1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i+" ");
                Thread.sleep(1000);
            }
            System.out.println("task");
        } catch (Exception e) {
            throw new RuntimeException("Thread interrupted..." + e);
        }

    }

}

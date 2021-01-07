package thread.inter_thread;

public class TestInterThread {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.deposit(10000)).start();
    }
}

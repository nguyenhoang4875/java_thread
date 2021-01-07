package thread.synchronization.block;

class Table {

    public void syncBlock(int n) {

        System.out.println("----------------START SYNC BLOCK METHOD----------------");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(n * (i + 1));

        }
        synchronized (this) {
            System.out.println("----------------START SYNC BLOCK ----------------");
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(n * (i + 1) * 2);
            }
            System.out.println("----------------END SYNC BLOCK ----------------");
        }
        System.out.println("----------------END SYNC METHOD----------------");

    }
}

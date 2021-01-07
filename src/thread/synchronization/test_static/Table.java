package thread.synchronization.test_static;

class Table {
     static synchronized void staticMethod(int n) {
        System.out.println("----------------START SYNC STATIC METHOD----------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("----------------END SYNC STATIC METHOD----------------");
    }

}

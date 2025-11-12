public class FileDownload {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Part 1 downloading...");
                Thread.sleep(1000);
                System.out.println("Part 1 completed.");
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Part 2 downloading...");
                Thread.sleep(1000);
                System.out.println("File download completed.");
            } catch (InterruptedException e) {}
        });

        t1.start();
        try { t1.join(); } catch (InterruptedException e) {}
        t2.start();
    }
}

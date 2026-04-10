public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                    sleep(15);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted");
        }
        System.out.println("Even thread finished");
    }
}

public class NumberGenerator extends Thread {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(name + ": " + i + "  " + this.hashCode());
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }

    public static void main(String[] args) {
        Thread numberGenerator1 = new Thread(new NumberGenerator("NumberGenerator1"));
        Thread numberGenerator2 = new Thread(new NumberGenerator("NumberGenerator2"));
        numberGenerator1.setPriority(Thread.MIN_PRIORITY);
        numberGenerator2.setPriority(Thread.MAX_PRIORITY);

        numberGenerator1.start();
        numberGenerator2.start();
    }
}

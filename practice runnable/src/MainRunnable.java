public class MainRunnable  {
    public static void main(String[] args) {
        System.out.println("Main threading running... ");
        RunnableDemo demo1 = new RunnableDemo("Thread-1-HR-Database");
        demo1.start();
        RunnableDemo demo2 = new RunnableDemo("Thread-2-Send-Email");
        demo2.start();
        System.out.println("Main thread stopping!!!");
    }
}

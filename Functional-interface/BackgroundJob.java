public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Executing background job...");
        Thread thread = new Thread(job);
        thread.start();
    }
}
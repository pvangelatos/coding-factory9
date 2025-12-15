package gr.aueb.cf.cf9.ch16.threads;

public class Main {
    public static void main(String[] args) {
        WorkerThreads worker = new WorkerThreads();
        WorkerThreads worker2 = new WorkerThreads();
        WorkerThreads worker3 = new WorkerThreads();
        WorkerThreads worker4 = new WorkerThreads();
        WorkerThreads worker5 = new WorkerThreads();
        WorkerThreads worker6 = new WorkerThreads();

        Thread thread = new Thread(worker);

        thread.start();
        new Thread(worker2).start();
        new Thread(worker3).start();
        new Thread(worker4).start();
        new Thread(worker5).start();
        new Thread(worker6).start();
    }
}

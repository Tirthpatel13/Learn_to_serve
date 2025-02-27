public class Problem_2 implements Runnable {

    //task
    @Override
    public void run() {
        System.out.println("Thread Name: "+Thread.currentThread().getName());
    }
}

package LinkedInLearning;

class Shopper2 extends Thread {
    static Integer garlicCount = 0;

    @Override
    public void run(){

        for(int i =0; i<100000; i++){
            synchronized (Shopper2.class){
                garlicCount++;
            }
        }
    }
}

public class SynchronizedStatementJavaDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread sandip = new Shopper2();
        Thread sagar = new Shopper2();
        sandip.start();
        sagar.start();
        sandip.join();
        sagar.join();
        System.out.println("We should buy " + Shopper2.garlicCount + " garlic");
    }
}

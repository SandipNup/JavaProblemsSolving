package LinkedInLearning;
class Shopper1 extends Thread {
    static int garlicCount = 0;
    private static synchronized void addGarlic(){
        garlicCount++;
    }

    @Override
    public void run(){

        for(int i =0; i<100000; i++){
            addGarlic();
        }
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread sandip = new Shopper1();
        Thread sagar = new Shopper1();
        sandip.start();
        sagar.start();
        sandip.join();
        sagar.join();
        System.out.println("We should buy " + Shopper1.garlicCount + " garlic");
    }
}
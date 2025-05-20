package LinkedInLearning;
import java.util.concurrent.locks.*;
import java.util.concurrent.atomic.*;




class Shopper extends Thread {
    static AtomicInteger garlicCount = new AtomicInteger(0);
    static Lock pencil = new ReentrantLock();

//    @Override
//    public void run(){
//
//        for(int i =0; i<10; i++){
//            pencil.lock();
//            garlicCount++;
//            pencil.unlock();
//            System.out.println(Thread.currentThread().getName()+ "is Thinking");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//    }

    @Override
    public void run(){

        for(int i =0; i<100000; i++){
            garlicCount.incrementAndGet();
        }


    }
}

public class DataRaceDemo {
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

package LinkedInLearning;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Shopper3 extends Thread{
    static int garlicCount, potatoCount =0;

    static ReentrantLock pencil =new ReentrantLock();

    private void addGarlic(){
        pencil.lock();
        System.out.println(pencil.getHoldCount());
        garlicCount++;
        pencil.unlock();
    }
    private void addPotato(){
        pencil.lock();
        potatoCount++;
        addGarlic();
        pencil.unlock();
    }

    @Override
    public void run(){
        for(int i =0; i<100000; i++){
            addGarlic();
            addPotato();
        }
    }
}
public class ReentrantClassDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper3();
        Thread olivia = new Shopper3();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("Garlic Count: " + Shopper3.garlicCount);
        System.out.println("Potato Count: " + Shopper3.potatoCount);
    }
}

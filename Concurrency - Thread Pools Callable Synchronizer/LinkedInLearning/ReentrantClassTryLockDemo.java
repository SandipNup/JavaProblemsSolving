package LinkedInLearning;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Shopper4 extends Thread{
    private int itemsToAdd = 0;
    private static int itemsOnNotepad = 0;
    private static Lock pencil = new ReentrantLock();

    public Shopper4(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        while(itemsOnNotepad <= 20){
            if(itemsToAdd > 0 && pencil.tryLock()){
                try{
                    itemsOnNotepad += itemsToAdd;
                    System.out.println(this.getName() + "added" + itemsToAdd + "item(s) to notepad");
                    itemsToAdd = 0;
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    pencil.unlock();
                }
            }else {
                try{
                    Thread.sleep(100);
                    itemsToAdd++;
                    System.out.println(this.getName() + "Found something to buy");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class ReentrantClassTryLockDemo {
    public static void main(String[] args) throws InterruptedException {
         Thread barron = new Shopper4("Barron");
         Thread olivia = new Shopper4("olivia");
         long start = System.currentTimeMillis();
         barron.start();
         olivia.start();
         barron.join();
         olivia.join();
         long finish = System.currentTimeMillis();
        System.out.println("Elapsed Time " + (float) (finish-start)/1000 + " seconds");
    }
}

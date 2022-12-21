package JavaCollections;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayDeque;
import java.util.AbstractList;

public class CollectionExample {

    void ListExample(){
        // Array List
        List<Integer> list1 = new ArrayList<>();

        // Linked List
        List<Integer> list2 = new LinkedList<>();

        // vector 
        List <Integer> list3 = new Vector<>();

        // Stack
        List <Integer> list4 = new Stack<>();

    }

    static void ArrayListExample(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Sandip");
        names.add("sunil");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void LinkedListExample(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Sandip");
        names.add("sunil");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void VectorListExample(){
        Vector<String> names = new Vector<>();
        names.add("Sandip");
        names.add("sunil");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void StackListExample(){
        Stack<String> names = new Stack<>();
        names.add("Sandip");
        names.add("sunil");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    void QueueExample(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        Queue <String> dq = new ArrayDeque<>();
    }

    static void PriorityQueueExample(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Sandip");
        pq.add("Sunil");
        pq.add("Sandesh");

        Iterator <String> itr = pq.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        pq.remove();
        pq.poll();

        Iterator<String> itr1 = pq.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }

    static void DequeExample(){
        Deque <String> dq = new ArrayDeque<>();

        dq.add("Gautam");  
        dq.add("Karan");  
        dq.add("Ajay");

        for (String ele: dq){
            System.out.println(ele);
        }
    }

    static void SetImplementation(){
        Set<String> s = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();

        // treset is the implementation of the sorted set
        Set<String> ts = new TreeSet<>();
    }

    static void HashSetExample(){
        HashSet<String> hs = new HashSet<>();
        hs.add("Sandip");
        hs.add("Sunil");
        hs.add("Sandesh");

        Iterator <String> itr = hs.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static void LinkedHashSet(){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Sandip");
        lhs.add("Sunil");
        lhs.add("Sandesh");

        Iterator <String> itr = lhs.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


    public static void main(String[] args) {
        // ArrayListExample();
        // LinkedListExample();
        // VectorListExample();
        // StackListExample();
        // PriorityQueueExample();
        // DequeExample();
        HashSetExample();
        LinkedHashSet();
    }
    
}

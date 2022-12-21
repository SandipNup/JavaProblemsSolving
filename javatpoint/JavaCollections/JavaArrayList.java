package JavaCollections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class JavaArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sandip");
        list.add("Rosjan");
        list.add("Ishowr");

        System.out.println(list);

        // iterating using iterator
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // iterating using for each loop

        for(String str:list){
            System.out.println("Using for each" + " " + str);
        }

        // setting an element in array
        list.set(1, "Roshan Adhikari");

        System.out.println("Traversing Using ListIterator");

        ListIterator listItr = list.listIterator(list.size());

        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }


        // traversing through for loop

        for( int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        list.forEach(item -> {
            System.out.println(item);
        });

        // traversing using for each remaining

        Iterator<String> itrFinal = list.iterator();

        itrFinal.forEachRemaining(item -> {
            System.out.println("Each iterator items" + " " + item);
        });

        Collections.sort(list);

        System.out.println(list);

        
    }    
}

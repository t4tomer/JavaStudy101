import java.util.*;

public class Study_4_me {
    
    public void Linked_List(){
        // Creating object of the
        // class linked list
        LinkedList<String> ll
            = new LinkedList<String>();
  
        // Adding elements to the linked list
        ll.add("A");// add A in index 0
        ll.add("B"); // add B in index 1 
        ll.addLast("C");// add C in index 2 
        ll.addFirst("D");// add D in index 3
        System.out.println(ll); 
        ll.add(2, "E");// add E in index 2
        System.out.println(ll);
        ll.add(3,"t");
  
        System.out.println(ll);
  
        // ll.remove("B");
        // ll.remove(3);
        // ll.removeFirst();
        // ll.removeLast();
  
        // System.out.println(ll);
    }

}




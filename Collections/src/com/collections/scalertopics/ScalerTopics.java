package com.collections.scalertopics;

import java.util.*;
 
//initialising ArrayList using add keyword
/*public class ScalerTopics {
   public static void main(String args[])
   {
       // create an ArrayList of String type
       ArrayList<String> str = new ArrayList<String>();
 
       // Initialize an ArrayList with add()
       str.add("Scaler");
       str.add("Topics");
       str.add("Rocks");
 
       // to print the ArrayList
       System.out.println("ArrayList is " + str);
   }
}*/


//initialise ArrayList using asList method - Using asList() AsList() method in Java is used to return a fixed-size list backed by the given array.
/*public class ScalerTopics {
 public static void main(String args[])
 {
     // create an ArrayList of String type and Initialize an ArrayList with asList()
    ArrayList<String> scaler = new ArrayList<String>(Arrays.asList("I", "love", "Java"));
//      List<String> scaler = Arrays.asList("I", "love", "Java");
     // to print the ArrayList
     System.out.println("ArrayList is " + scaler);
 }
}*/


//initialise ArrayList using List.of() method -  Using list.of() Method It is used to return immutable lists containing the specified elements.
/*public class ScalerTopics {
 public static void main(String args[])
 {
     // create an ArrayList of String type and Initialize an ArrayList with List.of()
     List<String> str = new ArrayList<>(List.of("Coding", "is","Fun"));

     // to print the ArrayList
     System.out.println("ArrayList is " + str);
 }
}*/


/*public class ScalerTopics{
    public static void main(String args[]){
    //creating an ArrayList
    ArrayList<String> str= new ArrayList<String>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+str.size());
    
    //add elements
    str.add("Hello");
    str.add("Hi");
    str.add("Namaste");
    str.add("Bonjour");
    
    //displaying the ArrayList
    System.out.println(str);
    
    //displaying the size
    System.out.println("Size after addition "+str.size());
    
    //remove element at index 0 
    str.remove(0);
    
    //display the new ArrayList
    System.out.println(str);
    
    //display the new size
    System.out.println("Size after removal "+str.size());
    }
}*/


/*public class ScalerTopics{
    public static void main(String args[]){
    //creating a LinkedList
    LinkedList<String> list= new LinkedList<String>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+list.size());
    
    //add elements
    list.add("Java");
    list.add("C++");
    list.add("JavaScript");
    list.addFirst("C#");
    list.addLast("Kotlin");
    
    list.add(2,"Python");
    
    //displaying the LinkedList
    System.out.println("Original Linked List " + list);
    
    //displaying the size
    System.out.println("Size after addition "+list.size());
    
    //remove element at index 5 
    list.remove(5);
    list.remove("C#");
    
    //display the new LinkedList
    System.out.println("New Linked List "+ list);
    
    //display the new size
    System.out.println("Size after removal "+list.size());
    }
} */


/*public class ScalerTopics{
    public static void main(String args[]){
    //creating a Vector
    Vector<Integer> v= new Vector<Integer>();
    
    //displaying the size
    System.out.println("Size at the beginning "+v.size());
    
    //add elements
    v.add(19);
    v.add(88);
    v.add(1);
    v.add(39);
    
    //displaying the Vector
    System.out.println(v);
    
    //displaying the size
    System.out.println("Size after addition "+v.size());
    
    //remove element at index 3 
    v.remove(3);
    
    //display the new Vector
    System.out.println(v);
    
    //display the new size
    System.out.println("Size after removal "+v.size());
    }
}*/


/*public class ScalerTopics{
    public static void main(String args[]){
    //creating a Stack
    Stack<Integer> s= new Stack<Integer>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+s.size());
    
    //push elements
    s.push(99);
    s.push(28);
    s.push(17);
    s.push(74);
    s.push(1);
    
    
    //displaying the Stack
    System.out.println("New Stack" + s);
    
    //displaying the size
    System.out.println("Size after addition "+s.size());
    
    //pop the element and display it
    System.out.println("Popped element " + s.pop());
    
    //display the new Stack
    System.out.println("New Stack after popping"+ s);
    
    //display the new size
    System.out.println("Size after removal "+s.size());
    
    //peek method to find the top-most element and display it
    System.out.println("Top-most element " + s.peek());
    
    //the size remains the same as peek does not remove the element
    System.out.println("Size after Peek "+s.size());
    
    }
}*/


/*public class ScalerTopics{
    public static void main(String args[])
    {
    // Creating a priority queue
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    
     //displaying the initial size
     System.out.println("Size at the beginning "+pq.size());
  
        // Adding elements using add()
        pq.add(99);
        pq.add(18);
        pq.add(27);
        pq.add(34);
    
        //displaying the PriorityQueue
        System.out.println("New PriorityQueue" + pq);
    
       //displaying the size
        System.out.println("Size after addition "+pq.size());
  
        // Printing the top element of the PriorityQueue
        System.out.println("Top-most element " +pq.peek());
  
        // Printing the top element and removing it
        System.out.println("Removing " +pq.poll());
    
        //displaying the PriorityQueue
        System.out.println("New PriorityQueue after removal" + pq);
  
        //display the new size
        System.out.println("Size after removal "+pq.size());
    }
} */









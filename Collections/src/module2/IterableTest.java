package module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

// Iterable Interface Part 1 - Iterator and it's methods
public class IterableTest{
    public static void main(String args[]){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits);

        Iterator<String> it = fruits.iterator();
        
//      while (it.hasNext()) {
//        	System.out.println(it.next()); // [Apple, Banana, Cherry]
//      }
        
        
         while (it.hasNext()) {
	        String nextFruit = it.next();
	        if("Banana".equals(nextFruit)){
	             it.remove();
	         }
          }
         System.out.println(fruits); // [Apple, Cherry]
         
        
//          while (it.hasNext()) {
// 	        String nextFruit = it.next();
// 	        if("Banana".equals(nextFruit)){
// 	            it.remove();
// 	         }
// 	        	System.out.println(it.next()); // initially nextFruit = Apple checks equals it will be false and does next() which contains Banana value in it and prints. nextFruit iterates again and takes Cherry and equals check fails. next() will not have any value after Cherry so it gives NoSuchElementException
//          }
        
//          [Apple, Banana, Cherry]
//           Banana
//           Exception in thread "main" java.util.NoSuchElementException
//        		  	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1053)
//        		  	at Collections/module2.IterableTest.main(IterableTest.java:37)

        
//        while (it.hasNext()) {
// 	        String nextFruit = it.next();
// 	        if("Banana".equals(nextFruit)){
// 	             it.remove();
// 	         }
// 	        System.out.println(nextFruit); 
//        }
        
//        [Apple, Banana, Cherry]
//        		Apple
//        		Banana
//        		Cherry
        
        
//         System.out.println("New way to print elements : ");
//         it.forEachRemaining(ele -> System.out.println(ele));
//         [Apple, Banana, Cherry]
//        		 New way to print elements : 
//        		 Apple
//        		 Banana
//        		 Cherry
         
         
//         while (it.hasNext()) {
//  	        String nextFruit = it.next();
//  	        if("Banana".equals(nextFruit)){
//  	             it.remove();
//  	         }
//         }
//         System.out.println("New way to print elements : ");
//         it.forEachRemaining(ele -> System.out.println(ele)); // since we already iterated elements using above while loop forEachRemaining does not have anything to iterate so gives empty output
         
//         [Apple, Banana, Cherry]
//        		 New way to print elements : 
        
        while (it.hasNext()) {
  	        String nextFruit = it.next();
  	        if("Banana".equals(nextFruit)){
  	             it.remove();
  	         }
         }
         System.out.println("New way to print elements : ");
         Iterator<String> updatedIt = fruits.iterator(); // using separate iterator
         updatedIt.forEachRemaining(ele -> System.out.println(ele));
         
//         [Apple, Banana, Cherry]
//        		 New way to print elements : 
//        		 Apple
//        		 Cherry
    }
}

// ForEach Practice - forEach() method available in Iterable
/*public class IterableTest{
    public static void main(String args[]){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits);

//      by using Lambda Expression
        System.out.println("Printing elements using Lambda expression : ");
        fruits.forEach(fruit -> System.out.println(fruit)); // forEach() works on every collection classes and interface as it is method of Iterable interface but forEachRemaining() works only on Iterator interface
//		[Apple, Banana, Cherry]
//        Printing elements using Lambda expression : 
//        	Apple
//        	Banana
//        	Cherry
        
//       by using Method Reference
        System.out.println("Printing elements using Method Reference : ");
        fruits.forEach(System.out::println); // forEach() works on every collection classes and interface as it is method of Iterable interface but forEachRemaining() works only on Iterator interface
//		[Apple, Banana, Cherry]
//        Printing elements using Method Reference : 
//        	Apple
//        	Banana
//        	Cherry

        Iterator<String> it = fruits.iterator();
        System.out.println("Printing using ForEachRemaining after processing iterator : ");
        if(it.hasNext()){
            it.next(); // since we have Banana after Apple, Banana is in next()  
        }
        it.forEachRemaining(System.out::println);
//        [Apple, Banana, Cherry]
//        		Printing using ForEachRemaining after processing iterator : 
//        		Banana
//        		Cherry
        
        
//        fruits.forEachRemaining(); // gives error because forEachRemaining() method is available only in Iterator interface
    }
} */
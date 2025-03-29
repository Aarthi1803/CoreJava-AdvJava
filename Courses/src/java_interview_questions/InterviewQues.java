package java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//	write code so that it prints students name starting with letter "A"
/* public class InterviewQues {
    public static void main(String[] args) {
//        List<String> students = new ArrayList<>();
//        students.add("Alice");
//        students.add("Bob");
//        students.add("Andrew");
//        students.add("Charlie");
//        students.add("Alex");
//
//        // Filter names starting with 'A' and print them
//        List<String> filteredStudents = students.stream()
//                .filter(name -> name.startsWith("A"))
//                .collect(Collectors.toList());
//
//        System.out.println("Students with names starting with 'A': " + filteredStudents);
     
    
    	
// 		Alternate code - write code so that it prints students name starting with letter "A"
  
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Andrew");
        students.add("Charlie");
        students.add("Alex");

        // Filter and print names starting with 'A' using substring()
        for (String name : students) {
            if (name.length() > 0 && name.substring(0, 1).equals("A")) { // Method-1
                System.out.println(name);
            }
//	    	if(name.length() > 0 &&  name.startsWith("A")) { // Method-2
//	    		System.out.println(name);
//	    	}
        }
    }
} */
//	1.  name.length() > 0:
//This checks if the string is not empty.
//If name is an empty string (""), substring(0, 1) would cause an IndexOutOfBoundsException.
//This ensures we only proceed when the string has at least one character.

//2.  name.substring(0, 1):
//substring(0, 1) extracts a substring starting from index 0 (first character) and ending at index 1 (exclusive).
//If name = "Alice", then:
//name.substring(0, 1) // Returns "A"
//
//3. .equals("A")
//This checks if the extracted first character is exactly "A".
//It's a case-sensitive comparison, meaning "a" would not match.
//
//How It Works Together
//If name = "Alice", the condition evaluates as:
//if (5 > 0 && "A".equals("A")) // true    	
/***************************************************************************************************************************************/
    	
// 		Stream API to calculate the average of a list of numbers.
//    	List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50); // creates a list of integers [10, 20, 30, 40, 50] using Arrays.asList(). The list is immutable, meaning you can't add or remove elements.

// 		Calculate the average using Stream API
//        OptionalDouble average = numbers.stream()
//                                        .mapToInt(Integer::intValue) // Convert to IntStream
//                                        .average(); // Calculate average

// 		Print the result
//        if (average.isPresent()) {
//            System.out.println("Average: " + average.getAsDouble());
//        } else {
//            System.out.println("List is empty, no average available.");
//        }
        
/*
          Creating a Stream and Calculating the Average:
			OptionalDouble average = numbers.stream()
                                .mapToInt(Integer::intValue) // Convert to IntStream
                                .average(); // Calculate average

    		numbers.stream() → Converts the numbers list into a Stream of elements.
    		.mapToInt(Integer::intValue) → Converts the Stream<Integer> into an IntStream, extracting primitive int values.
        	This avoids unnecessary autoboxing (conversion between Integer and int).
    		.average() → Computes the average of all elements in the IntStream.
    		The result is stored in OptionalDouble, which is a wrapper that may or may not contain a value (useful if the list is empty).
    		
    		Checking and Printing the Average:
			if (average.isPresent()) {
			    System.out.println("Average: " + average.getAsDouble());
			} else {
			    System.out.println("List is empty, no average available.");
			}
		    .isPresent() checks if an average exists (i.e., the list is not empty).
		    If true, it prints the calculated average using .getAsDouble().
		    If false, it prints "List is empty, no average available."
		    
		    Output of This Code:
			Average: 30.0
			
			(Because (10 + 20 + 30 + 40 + 50) / 5 = 30.0)
			What Happens If the List Is Empty?

			If numbers is empty:
			List<Integer> numbers = Arrays.asList();
			    .average() returns OptionalDouble.empty().
			    .isPresent() returns false, so "List is empty, no average available." is printed.
			    
			Key Takeaways
			✅ Streams help process collections efficiently.
			✅ mapToInt() optimizes performance by avoiding unnecessary conversions.
			✅ OptionalDouble prevents errors when the list is empty.
         */
/****************************************************************************************************************************************/    	

/*
 Difference Between StringBuffer and StringBuilder in Java:
Feature				StringBuffer											StringBuilder
Mutability			Mutable (can be modified)								Mutable (can be modified)
Thread Safety		Thread-safe (synchronized, safe for multi-threading)	Not thread-safe (faster, but not safe for multi-threading)				
Performance			Slower (because of synchronization)						Faster (no synchronization overhead)
Usage				Used when multiple threads need to modify the string	Used in single-threaded applications for better performance

Simple Explanation:
1. StringBuffer is synchronized, meaning it ensures that multiple threads do not modify the string simultaneously. 
This makes it safe for multi-threading but slower in performance.
2. StringBuilder is not synchronized, so it is faster but not safe for multi-threading.

Example: StringBuffer
=======================
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
    }
}

✅ Thread-safe, but slower



Example: StringBuilder
=======================
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
    }
}

✅ Faster, but not thread-safe


When to Use?
    Use StringBuffer when multiple threads need to modify the string.
    Use StringBuilder when performance is important, and only one thread is modifying the string

 */
//	    int iterations = 10_00_000; // 1 million iterations
//	
//	    // Measuring StringBuffer performance
//	    long startTime1 = System.currentTimeMillis();
//	    StringBuffer stringBuffer = new StringBuffer("Hello");
//	    for (int i = 0; i < iterations; i++) {
//	        stringBuffer.append(" World");
//	    }
//	    long endTime1 = System.currentTimeMillis();
//	    System.out.println("StringBuffer Time: " + (endTime1 - startTime1) + " ms");
//	
//	    // Measuring StringBuilder performance
//	    long startTime2 = System.currentTimeMillis();
//	    StringBuilder stringBuilder = new StringBuilder("Hello");
//	    for (int i = 0; i < iterations; i++) {
//	        stringBuilder.append(" World");
//	    }
//	    long endTime2 = System.currentTimeMillis();
//	    System.out.println("StringBuilder Time: " + (endTime2 - startTime2) + " ms");
    	
    	
//    }
//}

/********************************************************************************************************************/

/*class SharedResource {
    StringBuffer stringBuffer = new StringBuffer(); // Thread-safe
    StringBuilder stringBuilder = new StringBuilder(); // Not thread-safe
}

// Thread class for StringBuffer (Thread-Safe)
class BufferThread extends Thread {
    SharedResource resource;

    BufferThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.stringBuffer.append("A"); // Safe for multi-threading
        }
    }
}

// Thread class for StringBuilder (Not Thread-Safe)
class BuilderThread extends Thread {
    SharedResource resource;

    BuilderThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.stringBuilder.append("B"); // Not safe for multi-threading
        }
    }
}

public class InterviewQues {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        // Creating multiple threads for StringBuffer (Safe)
        Thread t1 = new BufferThread(resource);
        Thread t2 = new BufferThread(resource);
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuffer Length: " + resource.stringBuffer.length()); // Expected: 2000

        // Creating multiple threads for StringBuilder (Not Safe)
        Thread t3 = new BuilderThread(resource);
        Thread t4 = new BuilderThread(resource);

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("StringBuilder Length: " + resource.stringBuilder.length()); // Expected: ??? (Inconsistent)
    }
}*/

/********************************************************************************************************************/

// String s = "Java is a programming language". 
// find how many repeated letters are there in this string by using normal logic and stream api. 

//Finding Repeated Letters in a String - Normal Logic & Stream API
//Let's break this problem into two approaches:
//    Using Normal Logic (Loops & HashMap)
//    Using Java Stream API


// Approach 1: Using Normal Logic (Loops & HashMap)
//	Step-by-step Explanation:
//    Convert the string to lowercase to handle case insensitivity ("Java" and "java" should be counted as the same).
//    Use a HashMap<Character, Integer> to store each character's count.
//    Loop through each character in the string and update the count in the HashMap.
//    Filter out characters that appear more than once (i.e., repeated characters).

//import java.util.HashMap;
//import java.util.Map;
//Repeated Letters:
//a : 7
//g : 4
//m : 2
//i : 2
//n : 3
//r : 2
//Explanation of Normal Logic:
//    Convert to Lowercase: "Java is a programming language" → "java is a programming language"
//    Use a HashMap<Character, Integer> to store character frequencies.
//    Loop through the string and count occurrences of each letter.
//    Ignore spaces and count only letters using Character.isLetter(c).
//    Print only repeated letters (count > 1).

//Explanation (Step by Step)
//Convert the string to lowercase to count letters consistently.
//Use a HashMap<Character, Integer> to store the frequency of each letter.
//Loop through the string:
//    If it's a letter, update the count in HashMap.
//Loop through the HashMap and print only letters that appear more than once.

//public class InterviewQues {
//    public static void main(String[] args) {
//        String s = "Java is a programming language";
//        s = s.toLowerCase(); // Convert to lowercase to count letters case-insensitively
//
//        Map<Character, Integer> charCountMap = new HashMap<>();
//
//        // Iterate over each character in the string -  Count occurrences of each letter
//        for (char c : s.toCharArray()) {
//            if (Character.isLetter(c)) { // Consider only letters, ignore spaces
//                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//            }
//        }
//
//        // Print repeated characters
//        System.out.println("Repeated Letters:");
//        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//            if (entry.getValue() > 1) { // Check if letter appears more than once
//                System.out.println(entry.getKey() + " : " + entry.getValue());
//            }
//        }
//    }
//}



//Approach 2: Using Java Stream API
//Step-by-step Explanation (Stream API):
//    Convert the string to lowercase (s.toLowerCase()).
//    Filter only letters (Character::isLetter).
//    Group characters and count occurrences using Collectors.groupingBy().
//    Filter out characters with count > 1 (repeated ones).
//    Print the result.
//Output (Same as Normal Logic)
//Repeated Letters:
//a : 7
//g : 4
//m : 2
//i : 2
//n : 3
//r : 2
//Explanation of Stream API Approach
//Convert the string to lowercase (s.toLowerCase()).
//Convert String to IntStream using .chars() (Each character is an int).
//Convert int to Character (mapToObj(c -> (char) c)).
//Filter only letters (filter(Character::isLetter)).
//Group by each character and count occurrences (Collectors.groupingBy(Function.identity(), Collectors.counting())).
//Filter and print only repeated characters (count > 1).

//Explanation (Step by Step)
//Convert the string to lowercase (s.toLowerCase()).
//Convert string to IntStream (chars()): Treats each character as an integer.
//Convert int to Character (mapToObj(c -> (char) c)).
//Filter only letters (filter(Character::isLetter)).
//Group and count occurrences using Collectors.groupingBy().
//Filter and print only repeated letters (count > 1).

//Understanding charCountMap.getOrDefault(c, 0) + 1 in Simple Terms:
//This code is used to update the count of a character in a HashMap. 
//Example: Counting Letters in "banana":
//Map<Character, Integer> charCountMap = new HashMap<>();
//for (char c : "banana".toCharArray()) {
//    charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//}
//Breaking It Down:	
//1️.charCountMap.getOrDefault(c, 0):
//    Checks if the character c is already in the map.
//    If present, it returns its count.
//    If not present, it returns 0 (default value).
//2️. + 1:
//    Increments the count by 1.
//3️. charCountMap.put(c, newCount):
//    Updates the map with the new count.
//Example Walkthrough - Given: "banana"
//Step	Character (c)	charCountMap.getOrDefault(c, 0)	+1	put() Updates Map
//1	'b'	0	1	{b=1}
//2	'a'	0	1	{b=1, a=1}
//3	'n'	0	1	{b=1, a=1, n=1}
//4	'a'	1 (exists)	2	{b=1, a=2, n=1}
//5	'n'	1 (exists)	2	{b=1, a=2, n=2}
//6	'a'	2 (exists)	3	{b=1, a=3, n=2}
//Final Output (charCountMap):
//{ b=1, a=3, n=2 }
//✅ 'a' appears 3 times
//✅ 'n' appears 2 times
//✅ 'b' appears 1 time
//Why Use getOrDefault(c, 0) + 1?
//✔ Avoids NullPointerException (no need to check if c exists in the map).
//✔ Simplifies counting logic (no need for if-else).
//✔ Works for any character (letters, digits, symbols, etc.).

//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class InterviewQues {
//    public static void main(String[] args) {
//        String s = "Java is a programming language";
//
//        // Use Stream API to count repeated characters
//        Map<Character, Long> charCountMap = s.toLowerCase().chars() // Convert string to IntStream
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .filter(Character::isLetter) // Consider only letters, ignore spaces
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        // Print repeated characters
//        System.out.println("Repeated Letters:");
//        charCountMap.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1) // Keep only repeated letters
//                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
//    }
//}

//Alternative Way Using Java Streams (Short & Simple)
//If you want a shorter and more modern approach, you can use Java Streams to count character occurrences in a single step.

//Explanation (Step-by-Step):
//1️. s.chars() → Converts the string into an IntStream (each character is treated as an integer).
//2️. mapToObj(c -> (char) c) → Converts each integer back to a Character object.
//3️. collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//Groups characters together and counts how many times each appears.
//4️. charCountMap.forEach(...) → Loops through the map and prints only repeated characters.

//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class InterviewQues {
//    public static void main(String[] args) {
//        String s = "banana";
//
//        // Count occurrences of each letter using Streams
//        Map<Character, Long> charCountMap = s.chars() // Convert string to IntStream
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        // Print repeated letters
//        System.out.println("Repeated Letters:");
//        charCountMap.forEach((key, value) -> {
//            if (value > 1) { // Print only repeated letters
//                System.out.println(key + " : " + value);
//            }
//        });
//    }
//}

//Faster Approach Using Parallel Streams:
//Parallel streams allow Java to use multiple CPU cores, making counting faster for large strings.
//Explanation (What’s New?)
//1️.parallel() → Enables parallel processing, making it faster for large strings.
//2️. Everything else remains the same but is now processed in multiple threads.

//When to Use Parallel Streams?
//✔ ✅ Best for large datasets (big strings, files, etc.)
//✔ ✅ Useful when CPU has multiple cores
//❌ ⚠️ Overhead for small data (like "banana")
//For small strings, normal streams are enough. But if you process huge text files or large strings, parallel streams will be faster! 

//collect(Collectors.groupingBy(Function.identity(), Collectors.counting())):
//This is used in Java Streams to count occurrences of each character in a String. Let's break it down step by step.
//Output : {b=1, a=3, n=2}
//Step-by-Step Breakdown
//1️. collect(...)
//    The .collect(...) method is used to collect the stream elements into a result (here, a Map<Character, Long>).
//
//2️. Collectors.groupingBy(Function.identity(), Collectors.counting())
//This is the main collector that does two things:
//✅ Groups elements by their value (groupingBy(Function.identity())).
//✅ Counts occurrences of each element (Collectors.counting()).
//
//3. Collectors.groupingBy(Function.identity())
//    Groups the elements by themselves.
//    Function.identity() means "use the character itself as the key."
//    Example:
//        If the stream contains [b, a, n, a, n, a], it creates a map where keys are the characters and values are lists of occurrences:
//
//    {b=[b], a=[a, a, a], n=[n, n]}
//
//4. Collectors.counting()
//    Instead of storing lists ([a, a, a]), it counts how many times each character appears.
//    Example: {b=1, a=3, n=2}
//
//🔹 Alternative Example with groupingBy Without counting()
//If we only use groupingBy(Function.identity()) without counting(), it will return a map of lists:
//
//Map<Character, List<Character>> grouped = s.chars()
//        .mapToObj(c -> (char) c)
//        .collect(Collectors.groupingBy(Function.identity()));
//
//System.out.println(grouped);
//
//📝 Output
//
//{b=[b], a=[a, a, a], n=[n, n]}
//
//Here, each character is stored in a list instead of being counted.
//🔹 Summary of Key Components
//Code	Purpose
//.collect(...)	Collects stream elements into a map
//Collectors.groupingBy(...)	Groups elements (characters)
//Function.identity()	Uses the character itself as the key
//Collectors.counting()	Counts occurrences of each character


//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class InterviewQues {
//    public static void main(String[] args) {
//        String s = "banana";
//
//        // Counting characters using Stream API
//        Map<Character, Long> charCountMap = s.chars()
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        // Printing the result
//        System.out.println(charCountMap);
//    }
//}


//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class InterviewQues {
//    public static void main(String[] args) {
//        String s = "banana";
//
//        // Count occurrences using parallel streams
//        Map<Character, Long> charCountMap = s.chars() // Convert string to IntStream
//                .parallel() // Enable parallel processing
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        // Print repeated letters
//        System.out.println("Repeated Letters:");
//        charCountMap.forEach((key, value) -> {
//            if (value > 1) { // Print only repeated letters
//                System.out.println(key + " : " + value);
//            }
//        });
//    }
//}

/****************************************************************************************************************************************/

/*public class InterviewQues {
  public static void main(String[] args) {
//	    String s1 = "JavaCharter"; // Since this is a string literal, it gets stored in the String Pool (a special memory area in Java where unique string literals are stored).
//	    String s2 = new String(("JavaCharter")); // This creates a new String object in the heap memory, separate from the String Pool. Even though the content "JavaCharter" is the same, s2 is a different object in memory.
//	    String s3 = "JavaCharter"; // Since "JavaCharter" already exists in the String Pool (from s1), s3 reuses the same reference as s1. No new object is created.
//	    System.out.println(s1.equals(s3)); // true - .equals() compares the actual content of the strings. Since s1 and s3 both store "JavaCharter", the result is true.
//	    System.out.println(s1.equals(s2));  // true - .equals() compares only the content, NOT memory location. s1 (from the String Pool) and s2 (from the Heap) both contain "JavaCharter", so the result is true.

//	  [String Pool]      ---> "JavaCharter"  (shared by s1 and s3)
//	  [Heap Memory]      ---> "JavaCharter"  (separate object for s2)

//	  Quick Summary:
//	  Code			What It Compares						Result
//	  s1 == s3		Memory Address (Both in String Pool)	true
//	  s1 == s2		Memory Address (s1 in Pool, s2 in Heap)	false
//	  s1.equals(s3)	Content ("JavaCharter")					true
//	  s1.equals(s2)	Content ("JavaCharter")					true	    
	   
//	  Key Takeaways:
//	    String literals ("text") are stored in the String Pool.
//	    Using new String("text") creates a separate object in the Heap.
//	    == compares memory addresses, while .equals() compares actual content.
//	    If you want to compare two strings for equality, always use .equals() instead of ==.
	  
	  
	    String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2); // false - Here, we are using new String("Hello"), which forces Java to create two separate objects in the heap memory.== compares memory addresses (object references). Since s1 and s2 are two different objects in the heap, the result is false.
		System.out.println(s1.equals(s2)); // true - .equals() in String class compares actual content. Since both s1 and s2 contain "Hello", the result is true.
		
		StringBuffer sb1 = new StringBuffer("Java"); // Unlike String, StringBuffer objects are mutable (they can be modified). StringBuffer does not store values in the String Pool, so each new StringBuffer("Java") creates a new object in the heap.
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb1 == sb2); // false - Since sb1 and sb2 refer to two different objects in memory, the result is false.
		System.out.println(sb1.equals(sb2)); // false - StringBuffer does NOT override the .equals() method from Object. This means .equals() will behave just like ==, comparing memory addresses instead of content. Since sb1 and sb2 are different objects, the output will be false.
		System.out.println(sb1.toString().equals(sb2.toString()));  // true - If you want to compare StringBuffer content, convert it to a String first. This will compare "Java" (the actual content), giving true.

//		 Quick Summary:
//		 Code			What It Compares					Result
//		 s1 == s2		Memory address (Heap objects)		false
//		 s1.equals(s2)	Content ("Hello")					true
//		 sb1 == sb2		Memory address (Heap objects)		false
//		 sb1.equals(sb2)	Memory address (No override in StringBuffer)	false
//		 sb1.toString().equals(sb2.toString())	Content ("Java")	true
		
//		 Key Takeaways
//		    == compares object references (memory addresses).
//		    .equals() in String compares actual content.
//		    .equals() in StringBuffer does not compare content (use .toString().equals() instead).
//		    String objects can be stored in the String Pool, but StringBuffer objects are always in the heap.
		 
	  try {
		  System.out.println("Inside try block");
		  System.exit(0); //Interview Question - what are the possible ways where java finally block will not be executed?
		  }
		  catch(Exception e)
		  {
		  System.out.println("Exception caught : "+e);
		  }
		  finally
		  {
		  System.out.println("In finally block");
		  }
		
  }
}*/

/****************************************************************************************************************************************/

/*import java.util.HashMap;

public class InterviewQues {
    public static void main(String[] args) {
        // Step 1: Define the input sentence
        String sentence = "She saw that he saw what she saw"; 
        
        // Step 2: Convert the sentence to lowercase and split it into words
//      String[] words = sentence.toLowerCase().split(" "); 
        String[] words = sentence.split(" "); 
        
        // Step 3: Create a HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 4: Iterate through each word in the array
        for (String word : words) {
            // Step 5: Check if the word already exists in HashMap
            if (wordCount.containsKey(word)) {
                // Step 6: If word exists, increment its count
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Step 7: If word does not exist, add it with count 1
                wordCount.put(word, 1);
            }
        }

        // Step 8: Print the word count results
        System.out.println("Word Frequency Count:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + " -> " + wordCount.get(key));
        }
    }
}*/

/*import java.util.HashMap;

public class InterviewQues {
    public static void main(String[] args) {
        // Step 1: Define the input sentence
        String sentence = "She saw that he saw what she saw"; 
        
        // Step 2: Convert to lowercase and split into words
        String[] words = sentence.toLowerCase().split(" "); 
        
        // Step 3: Create a HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 4: Iterate through each word
        for (String word : words) {
            // Step 5: Use getOrDefault() to update the count
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Step 6: Print the word frequency count
        System.out.println("Word Frequency Count:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + " -> " + wordCount.get(key));
        }
    }
}*/

/****************************************************************************************************************************************/

// Difference between Comparator and Comparable:

//Difference Between Comparable and Comparator in Java
//Feature						Comparable										Comparator
//Package						java.lang										java.util
//Interface Method			int compareTo(T o)								int compare(T o1, T o2)
//Sorting Logic				Defined inside the class (natural ordering)		Defined externally (custom ordering)
//Modifies Class?				Yes, the class needs to implement Comparable	No, separate class or anonymous function can be used
//Sorting Flexibility			One sorting sequence (default)					Multiple sorting sequences (custom)
//Example						Sorting students by roll number					Sorting students by name, marks, etc.

//Real-World Scenario:
//Comparable (Natural Sorting):
//Imagine a queue in a bank where customers are served based on their token number (lowest first).
//Here, token numbers are naturally ordered and define how customers should be compared.
//
//Comparator (Custom Sorting):
//Now, if the bank decides to serve senior citizens first, then age-based sorting is needed.
//This is a custom comparison that doesn’t depend on the token number but on customer age.

//Key Takeaways:
//Use Comparable when sorting logic is fixed (e.g., ID, roll number).
//Use Comparator for multiple sorting criteria (e.g., name, age, salary).
//Comparable is implemented inside the class, while Comparator is defined externally.


// Using Comparable (Natural Sorting - by Roll Number)
/*import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Natural sorting by roll number
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class InterviewQues {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students); // Uses compareTo()
        System.out.println(students); // Output: [1 - Bob, 2 - Charlie, 3 - Alice]
    }
} */

// Using Comparator (Custom Sorting - by Name)
/*import java.util.*;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class InterviewQues {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));
        students.add(new Student(3, "Alice"));
        
        // Sorting by name using Comparator
        students.sort(Comparator.comparing(s -> s.name));

        System.out.println(students); // Output: [3 - Alice, 1 - Bob, 2 - Charlie]
    }
} */

/******************************************************************************************************/
//Comparable:
//    What it is: A Comparable interface is used to define the natural ordering of objects.
//    How it works: The class itself implements the Comparable interface and overrides the compareTo() method.
//    Real-world example: Think of students in a class. Each student has a natural order based on their roll number. The compareTo() method defines how students are sorted by default (e.g., by roll number).
//
//Comparator:
//    What it is: A Comparator interface is used to define custom ordering of objects.
//    How it works: A separate class implements the Comparator interface and overrides the compare() method.
//    Real-world example: Using the same students, you might want to sort them by name, age, or marks instead of their roll number. The Comparator allows you to define these custom sorting rules.
//
//Key Difference:
//     Comparable: Defines one natural order (e.g., students sorted by roll number).
//     Comparator: Defines multiple custom orders (e.g., students sorted by name, age, or marks).
//
//When to Use:
//     Use Comparable when there’s a single, obvious way to sort objects (e.g., roll number for students).
//     Use Comparator when you need multiple ways to sort objects (e.g., by name, age, or marks).        
        
//Comparable: Natural order by roll number
/*class Student implements Comparable<Student> {
	 int rollNo;
	 String name;
	 int age;

	 public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student other) {
	     return this.rollNo - other.rollNo; // Sort by roll number
	 }
	
	@Override
    public String toString() {
        return rollNo + " - " + name + " - " + age;
    }
}

//Comparator: Custom order by name
class NameComparator implements Comparator<Student> {
 public int compare(Student s1, Student s2) {
     return s1.name.compareTo(s2.name); // Sort by name
 }
}

public class InterviewQues{
	 public static void main(String[] args) {
		 List<Student> students = new ArrayList<>();
	        students.add(new Student(10, "Bob", 21));
	        students.add(new Student(23, "Charlie", 43));
	        students.add(new Student(2, "Alice", 12));
	        
	     // Print unsorted list
	        System.out.println("Unsorted Students:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	        
//	        Collections.sort(students);  // calls Comparable<Student>
	        Collections.sort(students, new NameComparator()); // calls Comparator<Student> -The Collections.sort() method takes the list (students) and the comparator (new NameComparator()) as arguments. It sorts the list based on the logic defined in the compare() method of NameComparator.
	        System.out.println(students);
	 }
} */
/***************************************************************************************************************/
/*class Animal {
	public Animal() {
		System.out.println("Animal class");
	}
}
class Dog extends Animal {
	public Dog() {
		System.out.println("Dog class");
	}
}

public class InterviewQues {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // Create an Animal object
//        
//        try {
//            Dog dog = (Dog) animal; // This will throw ClassCastException - Attempt to downcast Animal to Dog. Since the animal object is not an instance of Dog, this results in a ClassCastException
//        Downcasting is when you assign an object of a parent class (Animal) to a reference of its child class (Dog). It is explicit (requires explicit casting using (ChildClass)) and risky because the object might not actually be an instance of the child class.
//    	}
//        catch(Exception e) {
//        	System.out.println(e.getMessage());
//        }
        
    	Animal animal = new Dog(); // Upcasting - Create a Dog object and assign it to an Animal reference. Upcasting is when you assign an object of a child class (Dog) to a reference of its parent class (Animal). It is implicit (no explicit casting is required) and always safe because a Dog is always an Animal. The reference to this Dog object is stored in a variable of type Animal. This is allowed because Dog is a subclass of Animal.
        if (animal instanceof Dog) { // Check if the object is an instance of Dog
            Dog dog = (Dog) animal; // Safe downcasting. The animal reference (which points to a Dog object) is explicitly cast to a Dog type. This works in this case because the animal reference actually points to a Dog object. However, if animal were pointing to an object that is not a Dog (e.g., Animal animal = new Animal();), this would throw a ClassCastException.
            System.out.println("Downcasting successful!");
        } else {
            System.out.println("Downcasting failed: animal is not a Dog.");
        }
        
    }
} */

/*@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class InterviewQues {
    public static void main(String[] args) {
    	
//    	Greeting greet = new Greeting() {
//			@Override
//			public void sayHello(String name) {
//				System.out.println("Name : " + name);
//			}
//    	};
//    	greet.sayHello("Aarthi");
    	
    	Greeting greeting = (name) -> System.out.println("Hello, " + name);
        greeting.sayHello("Alice");
    	
    }
} */

//Removing all non-alphanumeric characters from a string in Java
/*public class InterviewQues {
    public static void main(String[] args) {
        String input = "Hello, World! 123 @#%";
        StringBuilder result = new StringBuilder(); // Line 1

        for (char ch : input.toCharArray()) { // Line 2
            if (Character.isLetterOrDigit(ch)) { // Line 3
                result.append(ch); // Line 4
            }
        }

        System.out.println("Original String: " + input); // Line 5
        System.out.println("String after removing non-alphanumeric characters: " + result); // Line 6
    }
} */

/***************************************************************************/

/* Can Static Methods Be Overridden in Java?
❌ No, static methods cannot be overridden in Java. Why?

    Static methods belong to the class, not an instance (object).
    Method Overriding happens at runtime (dynamic binding), but static methods are resolved at compile-time (static binding).
    You can redefine (hide) a static method in a subclass, but it's not true overriding.*/

// Example of Static Method Hiding (Not Overriding):
/*class Parent {
    static void display() { // Static method in parent class
        System.out.println("Static method in Parent Class ");
    }
}

class Child extends Parent {
    static void display() { // Static method in child class (Hiding, not Overriding)
        System.out.println("Static method in Child Class ");
    }
}

public class InterviewQues {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display(); // Calls Parent's display()

        Child obj2 = new Child();
        obj2.display(); // Calls Child's display()

        Parent obj3 = new Child(); 
        obj3.display(); // Calls Parent's display() (because static methods are not overridden)
    }
}*/

//  Even when using Parent obj3 = new Child();, it calls Parent's method because static methods are resolved at compile-time.



/* Can Private Methods Be Overridden in Java?

❌ No, private methods cannot be overridden in Java.
Why?

    Private methods belong to a class, not to its instances.
    They are not inherited by subclasses, so overriding is not possible.
    If a subclass defines a method with the same name, it's a separate method (not overriding). */

//  Example of Private Method Hiding (Not Overriding):
/*class Parent {
    private void show() { // Private method in parent
        System.out.println("Private method in Parent");
    }

    void callShow() {
        show(); // Calls Parent's private method
    }
}

class Child extends Parent {
    private void show() { // This is a separate method, not overriding
        System.out.println("Private method in Child");
    }

    void callShowChild() {
        show(); // Calls Child's private method
    }
}

public class InterviewQues {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.callShow(); // Calls Parent's show()

        Child obj2 = new Child();
        obj2.callShowChild(); // Calls Child's show()

        Parent obj3 = new Child();
        obj3.callShow(); // Calls Parent's show() (not overridden)
    }
}*/

//  The private method in Parent and Child are separate. They do not override each other.
//Method Type				Can Be Overridden?			Why?
//Static Methods			❌ No						Resolved at compile-time (static binding)
//Private Methods			❌ No						Not inherited by child classes

//Now you fully understand why static and private methods cannot be overridden in Java!

/*****************************************************/

//Call by Value vs Call by Reference in Java:
//
//Java only supports Call by Value, not Call by Reference.
//1️. What is Call by Value?
//
//    In Call by Value, a copy of the variable is passed to a method.
//    Changes made inside the method do not affect the original variable.
//
//2️. What is Call by Reference? (Not in Java)
//
//    In Call by Reference, a reference (memory address) of the variable is passed.
//    Changes made inside the method affect the original variable.
//    Java does not support Call by Reference (only objects behave like reference types).


//  Example 1: Call by Value in Java (For Primitive Types)
/*public class InterviewQues {
    void modify(int num) { // Receives a copy of num
        num = num + 10;  // Changes will not affect the original num
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
    	InterviewQues ex = new InterviewQues();
        int num = 20;  // Original value
        System.out.println("Before method call: " + num);
        ex.modify(num); // Call by value (copy of num is passed)
        System.out.println("After method call: " + num);
    }
}*/

//Output:
//Before method call: 20
//Inside method: 30
//After method call: 20

//Why does the value not change?
//	    A copy of num is passed to modify().
//	    Changes inside the method do not affect the original num in main().

//  Example 2: Objects in Java (Reference-Like Behavior)
/*class Person1 {
    String name;

    Person1(String name) {
        this.name = name;
    }

    void changeName(Person1 p) { // Receives reference to object
        p.name = "Aarthi";  // Changes the object's name
    }
}
 public class InterviewQues {
    public static void main(String[] args) {
        Person1 person = new Person1("Hema"); // Original object
        System.out.println("Before method call: " + person.name);
        person.changeName(person); // Passing object reference
        System.out.println("After method call: " + person.name);
    }
}*/

//Output:
//Before method call: Hema
//After method call: Aarthi
//
//✔ Why does the value change?
//    Objects are passed by value, but the reference is copied.
//    The method can modify the object's internal data because both references point to the same object in memory.

//Summary:
//Concept								Call by Value							Call by Reference
//What is passed?						A copy of the value						A reference (memory address)
//Does it change original value?		❌ No									✅ Yes
//Supported in Java?					✅ Yes (for primitives & objects)		❌ No (Java does not support true Call by Reference)
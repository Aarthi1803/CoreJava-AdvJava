package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Test3 {
	public static void main(String args[]) {
		
//	ParallelStream in Java:
		
//		int size = 10_000;
//		List<Integer> nums = new ArrayList<>(size); // create a list that will have some capacity of 10_000
//		Random ran = new Random();
//		for(int i=1; i<=size; i++) {
			// add the upper bound (exclusive) of 100 so that only values from 0 to 100 are available0. 
//			nums.add(ran.nextInt(100));
//		}

//		int sum1 = nums.stream()
//						.map(i -> i*2)
//						.reduce(0, (c,e) -> c+e);
		
// 		sum1 and sum2 are same but difference is we used mapToInt method in sum2 instead of reduce method in sum1	
		
//		long startSeq = System.currentTimeMillis(); // gives current time in milliseconds
//		int sum2 = nums.stream()
//						.map(i -> i*2)
//						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value as it can be of any type of stream,. we need to change to int i.
//						.sum();
		
//		Adding try and catch block in map method
//		int sum2 = nums.stream()
//						.map(i -> {
//							try {
//								Thread.sleep(1);
//							}catch(Exception e) {
//								
//							}
//							return i*2;
//							})
//						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value.
//						.sum();
//		
//		long endSeq = System.currentTimeMillis(); // gives current time in milliseconds	
//		
//		
//		long startPara = System.currentTimeMillis(); // gives current time in milliseconds
//		int sum3 = nums.parallelStream()
//						.map(i -> i*2)
//						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value.
//						.sum();
		
//		int sum3 = nums.parallelStream()
//						.map(i -> {
//							try {
//								Thread.sleep(1);
//							}catch(Exception e) {
//							
//							}
//							return i*2;
//						})
//						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value.
//						.sum();
//		
//		long endPara = System.currentTimeMillis(); // gives current time in milliseconds
		
//		System.out.println(sum2+ " " +sum3);
//		System.out.println("Seq: " + (endSeq - startSeq));
//		System.out.println("Para: "  + (endPara - startPara));

		
		
//		Optional class in Java: - a class that tries to avoid Null Pointer Exception
//		List<String> names = Arrays.asList("Navin", "Laxmi", "Xavier", "John", "Kishor"); 
//		Optional<String> name = names.stream()
//								 	 .filter(str -> str.contains("x"))
//								     .findFirst(); // find 'X' letter first name
		
//		List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor"); 
//		Optional<String> name = names.stream()
//			 	 					 .filter(str -> str.contains("x"))
//			 	 					 .findFirst();
		
//		System.out.println(name.get()); // X letter name not found so gives output as " Run Time Exception: Exception in thread "main" java.util.NoSuchElementException: No value present "
//		System.out.println(name.orElse("Not found")); // X letter name not found so gives output as " Not found ". If X letter name is found it gives output as "Laxmi"
		
//		List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor"); 
//		String name = names.stream()
//			 	 		   .filter(str -> str.contains("x"))
//			 	 		   .findFirst()
//			 	 		   .orElse("Not Found");
//		System.out.println(name); // X letter name not found so gives output as " Not found ". If X letter name is found it gives output as "Laxmi"
		
		
		
//		Method Reference in Java:
//		List<String> names = Arrays.asList("Tom","Jim", "Jack");
//		List<String> uNames = names.stream()
//								   .map(name -> name.toUpperCase())
//								   .toList();
//		System.out.println(uNames);
//		uNames.forEach(i -> System.out.println(i));
		
//		List<String> uNames = names.stream()
//				   				   .map(String :: toUpperCase)
//				                   .toList();
//		System.out.println(uNames);
//		uNames.forEach(System.out :: println);
		
		

//		Constructor Reference in Java:	
//		Method-1:
//		List<String> names = Arrays.asList("Tom","Jim", "Jack");
//		List<Student> students = new ArrayList <> ();
//		for(String name : names) {
//			students.add(new Student(name));
//		}
//		System.out.println(students);
		

//		Method-2:
//		List<String> names = Arrays.asList("Tom","Jim", "Jack");
//		List<Student> students = new ArrayList <> ();
//		students = names.stream()
//						.map(name -> new Student(name))
//						.toList();
//		System.out.println(students);
		

//		Method-3:
		List<String> names = Arrays.asList("Tom","Jim", "Jack");
		List<Student> students = new ArrayList <> ();
		students = names.stream()
						.map(Student :: new)
						.toList();
		System.out.println(students);
		
	}
}

class Student{
	private String name;
	private int age;
	
	public Student(String name) {
		this.name = name;
	}

	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
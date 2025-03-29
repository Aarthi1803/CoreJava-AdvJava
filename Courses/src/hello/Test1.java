package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill
//with the help of the below charges:
//1 to 100 units – $10/unit
//101 to 200 units – $15/unit
//201 to 300 units – $20/unit
//above 301 units – $25/unit
//
//Input1: U = 250

public class Test1{
	public static void main(String args[]) {
		System.out.println("Enter units");
		try (Scanner sc = new Scanner(System.in)) {
			int units = sc.nextInt();
			int amount = 0;
			
			
			if(units >= 1 && units <=100) {
				amount = amount+units*10;
			}
			if(units >= 101 && units <=200) {
				amount += 100*10 + ((units-100)*15);
			}
			if(units >= 201 && units <=300) {
				amount += 100*10 + 100*15 + ((units-200)*20);
				
			}
			if(units >= 301) {
				amount += 100*10 + 100*15 + 100*20 + ((units-300)*25);
			}
				
			
			System.out.println(amount);
		}
		
	}
}

//class Student{
//	int age;
//	String name;
//	
//	public Student(int age, String name) {
//		this.age = age;
//		this.name = name;
//	}
//
//	public String toString() {
//		return "Student [age=" + age + ", name=" + name + "]";
//	}
//	
//}

/*class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
		if(this.age > that.age) // compare current student age (this.age) with another student age(that.age) - we are giving power to class Student to compare themselves
			return 1; // swap values as 1 is positive number
		else
			return -1; // do not swap values as -1 is negative number 
	}
	
}

public class Test1 {
	public static void main(String[] args) {		
		List<Integer> nums= new ArrayList<>();
    	nums.add(43);
    	nums.add(31);
    	nums.add(72);
    	nums.add(29);
    	
    	Collections.sort(nums);
    	
    	System.out.println(nums);
		
		
		Comparator<Integer> com=new Comparator<Integer>() { //Comparator is an interface which is used to specify your own logic for sorting using compare()
			public int compare(Integer i,Integer j) {
				if(i%10 >j%10)
    				return 1; // swap values as 1 is positive number
    			else
    				return -1; // do not swap values as -1 is negative number
			}
		};
		
//		List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);
    	
    	Collections.sort(nums, com);
    	System.out.println(nums);
	}
} */		


//	Logic to sort elements based on the length of the string 		
//		Comparator<String> com=new Comparator<String>() { //Comparator is an interface which is used to specify your own logic for sorting using compare()
//			public int compare(String i,String j) {
//				if(i.length() >j.length())
//    				return 1; // swap values as 1 is positive number
//    			else
//    				return -1; // do not swap values as -1 is negative number
//			}
//		};
//		
//    	List<String> names= new ArrayList<>();
//    	names.add("Aarthi");
//    	names.add("Isha");
//    	names.add("Pandian");
//    	names.add("Hema Malini");
//    	
//    	Collections.sort(names, com);
//    	System.out.println(names);
		
		
//		Comparator<Student> com=new Comparator<Student>() { //Comparator is an interface which is used to specify your own logic for sorting using compare()
//			public int compare(Student i,Student j) {
//				if(i.age > j.age)
//    				return 1; // swap values as 1 is positive number
//    			else
//    				return -1; // do not swap values as -1 is negative number   	
//			}
//		};
//		
//		List<Student> studs = new ArrayList<>();
//		studs.add(new Student(21,"Navin"));
//    	studs.add(new Student(12,"John"));
//    	studs.add(new Student(18,"Parul"));
//    	studs.add(new Student(20,"Kiran"));
//    	
//    	Collections.sort(studs, com); 
//		Collections.sort(nums) with List<Integer> nums= new ArrayList<>(); worked because Integer class implements Comparable<Integer> interface that has its own natural sorting logic
//		But, Collections.sort(studs) - will not work because it is not implementing Comparable<Integer> interface. So to work we need class Student to implement Comparable for natural sorting logic 
//    	
//    	for(Student s:studs)
//    		System.out.println(s);
    	
    	
//    	List<Student> studs = new ArrayList<>();
//		studs.add(new Student(21,"Navin"));
//    	studs.add(new Student(12,"John"));
//    	studs.add(new Student(18,"Parul"));
//    	studs.add(new Student(20,"Kiran"));
//    	
//    	Collections.sort(studs);
//		for(Student s:studs)
//    		System.out.println(s);
	
		
//		Using Lambda expression for Comparator as Comparator is functional interface 
//		Comparator<Student> com = (Student i,Student j) -> 
//			{
//				if(i.age > j.age)
//    				return 1; // swap values as 1 is positive number
//    			else
//    				return -1; // do not swap values as -1 is negative number  
				
				//can use ternary operator instead of above if else condition code
//				return (i.age > j.age)? 1:-1;
//			};
//		Since only one statement is there we can remove return keyword which is optional and remove curly braces. We can also remove "Student" datatype for i and j. See below code
//		Comparator<Student> com = (i, j) -> (i.age > j.age)? 1:-1;
//			
//		List<Student> studs = new ArrayList<>();
//		studs.add(new Student(21,"Navin"));
//    	studs.add(new Student(12,"John"));
//    	studs.add(new Student(18,"Parul"));
//    	studs.add(new Student(20,"Kiran"));
//    	
//    	Collections.sort(studs, com);
//    	for(Student s:studs)
//    		System.out.println(s);
    	
//		Comparator - on which logic you want to sort the elements you can use Comparator
//		Comparable - if you want to give power to class itself to compare its object to itself then use Comparable
    	
    	
/*	The Comparator interface in Java is considered a functional interface even though it has multiple methods because only one of those methods is abstract: the compare() method.
	Here's why:
    Functional Interface Definition: A functional interface is an interface that has exactly one abstract method. 
    It can have other methods like default methods, static methods, or methods inherited from the Object class, but only one abstract method is allowed.
    
    Comparator Interface: The Comparator interface has the following signature:
    public interface Comparator<T> {
    	int compare(T o1, T o2); // Abstract method

    // Other methods like equals, reversed, thenComparing, etc. (default or static)
	}
	
	Single Abstract Method:
    The only abstract method in the Comparator interface is compare(). 
    This method is the core functionality of the interface and defines how two objects should be compared.
    
    Default and Static Methods:
    The other methods in the Comparator interface, like reversed(), thenComparing(), etc., are default or static methods. 
    These methods provide additional functionality and convenience, but they are not required to be implemented by classes implementing the interface. 

	Therefore, the Comparator interface meets the requirement of having only one abstract method, making it a functional interface. 
	This allows you to use lambda expressions and method references to implement the compare() method concisely, which is a key feature of functional programming in Java.
	
*/
	
//	}
//
//}

//public class Test1 {
//    public static void main(String[] args){ 
//		
//    	Instead of creating array as List<Integer> nums= new ArrayList<>(); nums.add(43); nums.add(31); etc.  
//		We have used List<Integer> nums= Arrays.asList(4,5,7,3,2,6); --> Both works similar to each other

//    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6); 
//		Normal for loop   	
//    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
//		Enhanced for loop    	
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}

//		forEach loop    	
//    	nums.forEach(n -> System.out.println("All values in an array: "+n));
//    	
//    	
//    	int sum=0;
//    	for(int n:nums)
//    	{
//    		if(n%2==0)
//    		{
//    			n=n*2;
//    			sum=sum+n;
//    		}
//    	}
//    	
//    	System.out.println(nums);
//    	System.out.println("Multiply by 2 and sum of all even numbers: "+ sum);
//  
//    }
//}

//public class Test1 { 
//    public static void main(String[] args){   
    	
//    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
//    	nums.forEach(n -> System.out.println("All values in an array: "+ n));

    	
//    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);    	
//    	Consumer<Integer> con=new Consumer<Integer>() {
//    		
//    		public void accept(Integer n)
//    		{
//    			System.out.println("All values in an array: "+ n);
//    		}
//    	};
//    	nums.forEach(con);
 
    	
//    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);    	
//		Since Consumer is a functional interface we can use lambda function by reducing above lines of code like below:
//		Since we have only one S.O.P we can remove {}; and Integer keyword
//    	Consumer<Integer> con= n -> System.out.println("All values in an array: "+ n);
//    	nums.forEach(con);

    	
//    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
//		nums.forEach(n -> System.out.println("All values in an array: "+ n));  
    	

//   	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);   	
//   	Stream<Integer> s1= nums.stream();
//    	s1.forEach(n-> System.out.println(n)); // Gives desired output
//    	s1.forEach(n-> System.out.println(n)); // This gives error because Stream gives output only once - Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//    	Stream<Integer> s2= s1.filter(n ->n%2==0);
//    	s2.forEach(n -> System.out.println(n));
//    	Stream<Integer> s3= s2.map(n->n*2);
//    	s3.forEach(n -> System.out.println(n));
//    	int result=s3.reduce(0,(c,e)->c+e);
//    	System.out.println(result);

    	
//    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);    	
//    	int result=nums.stream()
//    					.filter(n-> n%2==0)
//    					.map(n->n*2)
//    					.reduce(0, (c,e)-> c+e);
//    	System.out.println(result);
    	
    	
//    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);  	    	
//		filter method in Stream class uses Predicate functional interface and Predicate contains test abstract method
//    	Predicate<Integer> p= new Predicate<Integer>() {
//			public boolean test(Integer n) {
//				if(n%2==0)
//						return true;
//					else
//						return false;
//				
// 			Above code can be written in one line as given below:				
//				return n%2==0;
//			}
//		};
    	
//		int result=nums.stream()
//						.filter(p) // this p can be replaced with n-> n%2==0 as .filter(n-> n%2==0)
//						.map(n->n*2)
//						.reduce(0, (c,e)-> c+e);
//		System.out.println(result);

    	
//    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);  	
//		Since "Predicate" is functional interface we can use lambda expression by removing {}; , Integer keyword and (). Since it has only one return statement we can remove return keyword.   	
//		Predicate<Integer> p= n-> n%2==0;
//		
//		int result=nums.stream()
//						.filter(p) // this p can be replaced with n-> n%2==0 as .filter(n-> n%2==0)
//						.map(n->n*2)
//						.reduce(0, (c,e)-> c+e);
//		System.out.println(result);

    	
//    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
//		map method in Stream class uses "Function" functional interface and "Function" contains apply abstract method	
//		Function<Integer, Integer> fun= new Function<Integer,Integer>() {
//			public Integer apply(Integer n) {
//				return n*2;
//			}
//		};
//	
//		int result=nums.stream()
//						.filter(n-> n%2==0)
//						.map(fun)
//						.reduce(0, (c,e)-> c+e);
//		System.out.println(result);

    	
//    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
//		Since "Function" is functional interface we can use lambda expression by removing {}; , Integer keyword and (). Since it has only one return statement we can remove return keyword.   			
//		Function<Integer,Integer> fun= n-> n*2;
//		
//		int result=nums.stream()
//						.filter(n-> n%2==0)
//						.map(fun) // this fun can be replaced with n-> n*2 as .map(n-> n*2)
//						.reduce(0, (c,e)-> c+e);
//		System.out.println(result);

    	
//    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
//		Stream<Integer> sortedValues = nums.stream()
//											.filter(n-> n%2==0)
//											.sorted(); // Output : 2 4 6 as we get even numbers these even numbers are sorted
//		sortedValues.forEach(n -> System.out.println(n)); 

    	
//    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
// 		parallelStream() used with the filter that creates multiple threads to work faster. 
//    	parallelStream should not be used with a sorted method as sorting requires all the elements together, so  multiple threads will create an ambiguity.    	
//		Stream<Integer> sortedValues = nums.parallelStream() 
//											.filter(n-> n%2==0)
//											.sorted(); // Output : 2 4 6 as we get even numbers these even numbers are sorted
//		sortedValues.forEach(n -> System.out.println(n));

//    }
//}
    
/*public class Test1 { 
//	var instVar = 10; //var' is not allowed here - var is not allowed for instance variable
	 int nonStaticVariable = 10; // Non-static variable
    public static void main(String[] args){ 

// 		LVTI - Local Variable Type Inference
//		Java is Statically-Typed Programming Language because we declare variables using data type. Eg: int i = 10;
//		After Java 10 - we are using var i = 10; --> applicable only for local variables and not instance variables
// 		Instance variable are meant for storage. We store instance variables  
//		Local variable are meant for processing in a method we don't generally store local variables.  	
//    	var keyword works with Java 10 and above versions
    	int i = 10;
    	var a = 20; // ((Object)a).getClass().getName() --> output: java.lang.Integer;  ((Object)a).getClass().getSimpleName() --> output: Integer
    	// By default var is converting data type for us behind the scene
    	System.out.println("a value : "+ a);
    	var b = "Aarthi"; // ((Object)b).getClass().getName() --> output: java.lang.String;  ((Object)b).getClass().getSimpleName() --> output: String
    	var c = 'A'; // ((Object)c).getClass().getName() --> output: java.lang.Character;  ((Object)c).getClass().getSimpleName() --> output: Character
    	var d = 5.5f; // ((Object)d).getClass().getName() --> output: java.lang.Float;  ((Object)d).getClass().getSimpleName() --> output: Float
    	var e = 5.5d; // ((Object)e).getClass().getName() --> output: java.lang.Double;  ((Object)e).getClass().getSimpleName() --> output: Double
    	var f = 5000L; // ((Object)f).getClass().getName() --> output: java.lang.Long;  ((Object)f).getClass().getSimpleName() --> output: Long
    	
//		In Java every class is inherited from the Object class itself. So if you have a variable and you would like to know its data type. You can use below code:  	
    	System.out.println(((Object)b).getClass().getName());
    	System.out.println(((Object)b).getClass().getSimpleName());
    	
    	ArrayList<Integer> obj = new ArrayList<>();
    	var  obj1 = new ArrayList<>();
//    	System.out.println(((Object)obj1).getClass().getName()); //output: java.util.ArrayList
//    	System.out.println(((Object)obj1).getClass().getSimpleName()); //output: ArrayList
    	
//    	int aa;
//    	System.out.println(aa); // Compile time error - The local variable aa may not have been initialized
//    	var bb; //Compile time error - Cannot use 'var' on variable without initializer
    	
//    	int aa = 0;
//    	System.out.println(aa); //Output = 0
    	
//    	String var = "Aarthi";
//    	System.out.println(var); // var can be used as variable name and also can be used as keyword for datatype
    	
//    	int nums[] = new int [10];
//    	int nums[] = new int []; // compile time error - Variable must provide either dimension expressions or an array initializer - must specify size of array
//    	var nums1 = new int[]; // compile time error - Variable must provide either dimension expressions or an array initializer - must specify size of array
//    	var nums1 = new int[10]; // do not use [] for array nums1 like nums1[]. It will give compile time error
//    	System.out.println(((Object)nums1).getClass().getName()); //output: [I
//    	System.out.println(((Object)nums1).getClass().getSimpleName()); //output: int[]
    	
//   	var nums2[] = new int [10]; //compile time error - 'var' is not allowed as an element type of an array. do not use [] for array nums1 like nums1[].

       	Test1 t1 = new Test1();
       	System.out.println("Non-Static variable: "+t1.nonStaticVariable); // To access a non-static variable within a static method, you must first create an instance of the class and then use that instance to access the variable.
    	
//    	Test2 t2 = new Test2();
    	var t2 = new Test2();
//    	System.out.println("Static instance variable: "+t2.i); // The static field Test2.i should be accessed in a static way
       	System.out.println("Static instance variable: "+Test2.i); 
       	System.out.println("instance variable: "+t2.instNum); // To access a non-static variable within a static method, you must first create an instance of the class and then use that instance to access the variable.
       	t2.show();
       	Test2.giveNumber();
       	
 	
    }
}

//class var{ //'var' is not a valid type name. "var" cannot be used as classname
//	
//}

class Test2{
//	static int i;// This is a valid declaration of a static variable
	static int i = 20; // This is a valid declaration of a static variable
//	static var j = 20; // compile time error - 'var' is not allowed here. var cannot be used for instance variable
	int instNum = 10;
	public void show() {
		i++; // Non-Static Method Accessing Static variable.
		System.out.println("post increment of i inside non-static method: "+i);
		++i;
		System.out.println("pre increment of i inside non-static method: "+i);
		i = 30; // Non-Static Method Accessing Static variable - changing value of static instance variable 
		var getnums = 10;
		System.out.println("getnums inside non-static method: "+getnums);
//		You cannot create a static variable inside a non-static method; static variables belong to the class itself and are declared outside any method, meaning they are not defined within the scope of a non-static method.
//		static int num = 10; // compile time error - Illegal modifier for parameter num; only final is permitted
//		static var i = 20; //compile time error  - Illegal modifier for parameter i; only final is permitted
		instNum++; 
		System.out.println("post increment of instNum inside non-static method: "+instNum);
		++instNum;
		System.out.println("pre increment of instNum inside non-static method: "+instNum);
	}
	static {
//		static int num = 10; // compile time error - Illegal modifier for parameter num; only final is permitted
//		static var i = 20; // compile time error - Illegal modifier for parameter num; only final is permitted
		var j = 20;
		System.out.println("get j inside static block: "+j); // static block is executed the moment object is created using new keyword for class Test2
//		instNum++;//compile time error - Non-static variables cannot be used inside static methods. Cannot make a static reference to the non-static field instNum
		int normalVar = 10;
		System.out.println("get normalVar inside static block: "+normalVar); 
	}
	public static void giveNumber() {
		i++; // Access the static variable using the class name. Non-Static Method Accessing Static variable.
		System.out.println("post increment of i inside static method: "+i);
		++i;
		System.out.println("pre increment of i inside static method: "+i);
// 		This is not allowed, as you cannot declare a static variable within a method 
//		static int num = 10; //compile time error - Illegal modifier for parameter num; only final is permitted
//		instNum++; //compile time error - Non-static variables cannot be used inside static methods. Cannot make a static reference to the non-static field instNum
		int normalVar1 = 10;
		System.out.println("get normalVar1 inside static block: "+normalVar1);
	}
} */
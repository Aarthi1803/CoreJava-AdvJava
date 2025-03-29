package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
class Calculator{
	int a;
	public int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
}

public class Demo {

	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		int result = calc.add(num1,num2);
		System.out.println(result);
	}
}
**/

/************************************************************************/

/*class Computer
{
	public void playMusic()
	{
		System.out.println("Music Playing...");
	}
	public String getMeAPen(int cost)
	{*/
		// Method-1
		 /* if(cost>=10)
			return "Pen";
		else
			return "Nothing";*/
		
		// Method-2
		/*if(cost>=10)
			return "Pen";
		
		return "Nothing"; //return keyword stops the execution of a method as it does not execute the further statements after it. 
	}
}*/


/*public class Demo {
	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.playMusic();
		String src=obj.getMeAPen(10);
		System.out.println(src);
	}
}*/

/************************************************************************/

/*class Calculator
{
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2) // double + int = double type value is result so return type should be double
	{
		return n1+n2;
	}
}


public class Demo {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		//int r1 = obj.add(3, 4, 5);
		//int r1=obj.add(3,4);
		//double r1 = obj.add(3.5, 5);
		System.out.println(r1);
	}
}*/

/************************************************************************/

/*class Calculator
{
	int num=5;
	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;
	}
}


public class Demo {
	public static void main(String[] args) {
		int data=10;
		Calculator obj=new Calculator();
		Calculator obj1=new Calculator();
		int r1=obj.add(3,4);
		//System.out.println(r1);
		obj.num=8;
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
}*/

/************************************************************************/

/*public class Demo {
	public static void main(String[] args) {
		int nums[]=new int[4]; //by default 0 is assigned
		//double nums[]=new double[4];//by default 0.0 is assigned
		//float nums[]=new float[4];//by default 0.0 is assigned
		//byte nums[]=new byte[4];//by default 0 is assigned
		//short nums[]=new short[4];//by default 0 is assigned
		//long nums[]=new long[4];//by default 0 is assigned
		//char nums[]=new char[4]; //default value is '\u0000' (null character)
		//boolean nums[]=new boolean[4];//by default false is assigned
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		
		//int nums[]= {3,7,2,4}; //in this we manually assign value but by default 0 is assign in this case
		//nums[1]=6;
		//System.out.println(nums[1]);
		
		//int nums[]=new int[4];
		//nums[0]=4;
		//nums[1]=8;
		//nums[2]=3;
		//nums[3]=9;
		
		//for (int i=0;i<4;i++) {
			//System.out.println(nums[i]);
		//}
		
	}
} */

/************************************************************************/

/*public class Demo {
	public static void main(String[] args) {
		int nums[][]=new int [3][4];

		//General for loop
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("************");
		
		//Enhanced for loop
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}*/

/************************************************************************/

/*public class Demo {
	public static void main(String[] args) 
	{
		int nums[][]=new int [3][]; //jagged array with rows but unspecified columns
		nums[0]=new int [3]; //assigning different column size for each row
		nums[1]=new int [4]; //assigning different column size for each row
		nums[2]=new int [2]; //assigning different column size for each row
		
		// int nums[][]=new int [3][4]; // array with fixed rows and columns 
		// int nums[][]=new int [3][4][5]; // three dimensional
		
		System.out.println("Method-1");
		//Method-1:
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Method-2");
		
		//Method-2:
		for(int n[]:nums) {
			for(int m:n) {
				m=(int)(Math.random()*10);
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}*/

/************************************************************************/

/*class Student
{
	int rollno;
	String name;
	int marks;	
}

public class Demo {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Navin";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Harsh";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Kiran";
		s3.marks=97;
		
		System.out.println(s1.name + ":"+ s1.marks);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		//Method-1:
		System.out.println("Normal for loop");
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].rollno +"-"+ students[i].name +":"+ students[i].marks);
		}
		System.out.println();
		
		//Method-2:
		System.out.println("Enhanced for loop");
		for(Student stud: students)
		{
			System.out.println(stud.rollno + "-" + stud.name + "-" + stud.marks);
		}
		
		int nums[] = new int[6];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		System.out.println();
		
		//Method-1:
		System.out.println("Normal for loop");
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//Method-2:
		System.out.println("Enhanced for loop");
		for(int n : nums){
			System.out.print(n + " ");
		}
		
	}
} */

/************************************************************************/

/*public class Demo {
	public static void main(String[] args) 
	{
		String name1=new String("Aarthi");
		System.out.println("Name1: " +name1); //output = Name1: Aarthi
        String name="Navin";
		System.out.println("Name: " +name); //output = Name: Navin
		System.out.println("HashCode: " + name.hashCode()); //output = get address = HashCode: 75041128
		System.out.println("hello "+name); //output = hello Navin
		
		System.out.println(name.concat("reddy")); // output = Navinreddy
		System.out.println("Name: " +name); //output = Name: Navin
		System.out.println("Index Value: "+name.charAt(0)); //output = Index Value: N
		//System.out.println("Index Value: "+name.charAt(7)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 7 out of bounds for length 5
		//String str = "abc";
		char data[] = {'a', 'b', 'c'}; 
	    String str1 = new String(data);
	    System.out.println("Data: " +str1); //output = Data: abc
	    
	    String name2="navin";
		name2=name2+" reddy";
		System.out.println("hello "+name2); //output = hello navin reddy
		System.out.println("Name: " +name2); //output = Name: navin reddy
		System.out.println("Index Value: "+name2.charAt(7)); //output: e
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2); //output: true
	    
	    String cde = "cde";
	    System.out.println("abc" + cde); //output = abccde
	    System.out.println("cde: " + cde); //output = cde: cde
	    String c = "abc".substring(2, 3);
	    System.out.println("c substring: " + c); //output = c substring: c
	    String d = cde.substring(1, 2);
	    System.out.println("d substring: " + d); //output = d substring: d
	    
		StringBuffer sb1 = new StringBuffer();
		System.out.println("SB1 Capacity: "+ sb1.capacity()); //shows capacity of 16 space. 
	    StringBuffer sb = new StringBuffer("Navin");
		System.out.println("SB Length: "+ sb.length());// SB Length: 5
		System.out.println("SB2 Capacity: "+ sb.capacity()); // after adding Navin in SB it shows capacity of 16+5 = 21
		sb.append("Reddy");
		System.out.println("SB : "+sb);
		//System.out.println("SB3 Capacity: "+ sb.capacity());
		
		String str=sb.toString();
		System.out.println("String : "+str);
		
		sb.deleteCharAt(2);
		System.out.println("SB Delete : "+sb);
		
	    sb.insert(0,"Java");
	    System.out.println("SB Insert : "+sb);
	    //System.out.println("SB4 Capacity: "+ sb.capacity());
		sb.insert(6,"java");
		System.out.println("SB Insert-1 : "+sb);
		//System.out.println("SB5 Capacity: "+ sb.capacity());
		sb.setLength(30); // set length as 30
		sb.ensureCapacity(100);
		//System.out.println("SB6 Capacity: "+ sb.capacity());
		System.out.println("SB2 : "+sb);
		
	}
}*/

/************************************************************************/

/* class Mobile{
	String brand;
	int price;
	// String OSname;
	static String OSname;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+OSname);
	}
	
}

public class Demo {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.OSname="SmartPhone";
		Mobile.OSname="IOS";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.OSname="SmartPhone";
		Mobile.OSname="Android";
		
		//obj1.OSname="Phone";
		Mobile.OSname="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		//Initial output:
		// Apple : 1500 : Phone
		// Samsung : 1700 : SmartPhone

		
		//After adding static keyword for OSname instance variable it became class variable 
		//That is why we are able to access using Classname.class variable i.e. Mobile.OSname
		
		//Final output:
		 // Apple : 1500 : SmartPhone
		 // Samsung : 1700 : SmartPhone
		 
	}
}*/

/************************************************************************/

/*class Mobile{
	String brand;
	int price;
//	String name;
	static String OSname;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+OSname);
	}
	
	public static void show2()
	{
		//System.out.println(brand+" : "+ price +" : "+Mobile.name); 
		//cannot use non static variables inside a state method as it gets confused which object either obj1 or obj2 to use. So it shows error.
	}
	
	public static void show1(Mobile obj1)
	{
		//passing obj1 as parameter will resolve issue of indirectly accessing non static variables in a static method
		//Now it is aware which object to use as we mentioned obj1
		System.out.println(obj1.brand+" : "+ obj1.price +" : "+Mobile.OSname);
		//System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
	}
}

public class Demo {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		Mobile.OSname="IOS";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		Mobile.OSname="Android";
		
		//obj1.name="Phone";
		Mobile.OSname="SmartPhone";
		
		obj1.show();
		obj2.show();
		
		Mobile.show1(obj1);
		
		//System.out.println(obj1.brand);
	
	}
}*/

/************************************************************************/

/*class Mobile{
	String brand;
	int price;
	static String OSname;
	
	static { //static block is used to initialize static variables - as we have two objects two times constructor Mobile is called & initializes OSname twice. 
		//To overcome this we have used OSname only one time in static block. 
		//static block is called only once. 
		//Irrespective of how many number of objects are created when class is loaded for first time only once static block is called
		OSname="IOS";
		System.out.println("in static block: "+ OSname);
	}
	
	public Mobile() {
		brand="Apple";
		price=200;
//		OSname="Phone"; // we can initialize static variable inside a constructor
		System.out.println("in constructor: " + brand + " : "+ price);
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+OSname);
	}
	
	
} 

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("hello.Mobile");
		//If you don't create any object like obj1 it will not load the class in class loader. 
		//So to load class without object creation we can use Class.forName("package_name.class_name") --> this loads your class in class loader and not create object. 
		//It throws exception so add "throws ClassNotFoundException"
		//We use above line for starting JDBC
		
		// Mobile obj1=new Mobile();
		// obj1.brand="Samsung";
		// obj1.price=1500;
		// Mobile.OSname="SmartPhone";
		// obj1.show();
		
		// Mobile obj2=new Mobile();
		// obj2.show();
	
	}
	
	//Final Output:
	// in static block: IOS
	// in constructor: Apple : 200
	// Samsung : 1500 : SmartPhone
	// in constructor: Apple : 200
	// Apple : 200 : SmartPhone
} */

/************************************************************************/

//class Calc1{ 
//	static{ 
//		System.out.println("Static Block"); 
//		System.out.println("Executed before main"); 
//	} 
//
//	{ //non static block 
//	System.out.println("Non static block executed before the execution of constructor"); 
//	} 
//}
//
//class Demo{
//	public static void main(String []args){ 
//		Calc1 c = new Calc1(); //non static block executed when we create object 
//		System.out.println("main method"); 
//		Help h ; // this will not execute static block of Help class 
//		Help h1 = new Help(); //this will execute static block of Help class 
//		Help.wish(); // this will execute static method of Help class 
//		
//		//Output:	
//		//Static Block
//		//Executed before main
//		//Non static block executed before the execution of constructor
//		//main method
//		//Static block of Help class
//		//Hello		
//	} 
//} 
//
//class Help{ 
//	static { 
//		System.out.println("Static block of Help class"); 
//	}
//	static void wish(){ 
//		System.out.println("Hello"); 
//	} 
//}

/************************************************************************/

//Nested Static Classes
/*class OuterClass{
	static int staticVar = 100;
	static class InnerClass {
		void display() {
			System.out.println(" Static inner class: " + staticVar);
		}	
	}
}

class Demo{
	public static void main(String []args){ 
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		inner.display();
		hello.OuterClass.InnerClass inner = new hello.OuterClass.InnerClass();
		inner.display();
	}
}*/

/************************************************************************/

/*class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Demo {
	public static void main(String[] args)
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}

//Encapsulation - assigning and getting the values with the help of getters and setters methods. 
}*/

/************************************************************************/

/*class Human
{
	
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age, Human obj)
	{
		Human obj1=obj;
		obj1.age=age;
		//this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
//	public void setName(String n)
//	{
//		name=n;
//	}

}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();

		obj.SetAge(30,obj);
//		obj.SetAge(30);
		obj.setName("Reddy");
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}*/

/************************************************************************/

/*class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
		//System.out.println("in constructor");
	}
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Demo {
	public static void main(String[] args)
	{
		Human obj=new Human();
		Human obj1=new Human();
		System.out.println(obj.getName()+" : "+obj.getAge());
		
		obj.SetAge(30);
		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}*/

/************************************************************************/

/*class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
	}
	public Human(String name) {
		this.age=age;
		this.name=name;
	}
	public Human(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
//	public Human()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}
	
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Demo {
	public static void main(String[] args)
	{
		Human obj=new Human();
		Human obj1=new Human(18, "Navin");
		Human obj2=new Human("Navin");
		System.out.println("Default Constructor: " + obj.getName()+" : "+obj.getAge());
		System.out.println("Parameterized Constructor-1: " + obj1.getName()+" : "+obj1.getAge());
		System.out.println("Parameterized Constructor-2: " + obj2.getName()+" : "+obj2.getAge());
		
//		obj.SetAge(30);
//		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}*/
/************************************************************************/

//class and interface - Calculator(class) and Runnable(interface) --> (first letter capital)
//variable and method - marks, show() --> (small letters)
//constants - PIE, BRAND --> (all capital letters)


//showMyMarks() --> (first letter of each word is capital from second word)
//show_my_marks() --> (words join by underscore) --> snake casing

//MyData - classname
//age - variable name
//DATA - Constant
//Human() - constructor

/*class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
		int marks;
		marks=99;
		
		new A();   //called as anonymous object as it doesn't have name to refer (creating object using -->new A())
		new A().show();
		
//		A obj=new A();
		A obj;  //obj is reference variable which is created
		obj=new A(); //creating object using -->new A() and assigning value of new A() to obj reference variable
		
		obj.show();
	}
}*/

/*public class Demo
{
	public static void main(String a[]) 
	{
//		Calc obj=new Calc();
//		AdvCalc obj=new AdvCalc();
		VeryAdvCalc obj=new VeryAdvCalc();
		int r1=obj.add(4, 5);
		int r2=obj.sub(7,3);
		int r3=obj.multi(5,3);
		int r4=obj.div(15,4);
		int r5=obj.power(4,2);
		
		System.out.println("Addition: "+r1);
		System.out.println("Subtraction: "+r2);
		System.out.println("Multiplication: "+r3);
		System.out.println("Division: "+r4);
		System.out.println("Power: "+r5);
	}
}*/

/************************************************************************/

//super()
/*class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
		super();
//		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
		super();   //call default constructor of super class
//		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}*/

/************************************************************************/

//this() 
/*class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super(); //call constructor of super class or parent class
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class
		System.out.println("in B int");
	}

}
public class Demo {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B obj=new B(5);
	}
}*/

/************************************************************************/

/*class A extends Object
{
	int num= 1;
}

class B extends A
{
	int num=2;
	public int getValue()
	{
		int num=3;
	    return this.num; // Ouput : 2
//		return this.num = num; // Ouput : 3
//		return super.num; // Ouput : 1
	}
}


public class Demo
{
	public static void main(String a[]) 
	{
		B obj=new B();
		System.out.println(obj.num);
		System.out.println(obj.getValue());
	}
} */

/************************************************************************/

/*class A
{
	public void show()
	{
		System.out.println("in A show");
	}
	public void config()
	{
		System.out.println("in A config");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

public class Demo{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
		obj.config();
	}
}*/

/************************************************************************/

/*class Calc1 
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}
class AdvCalc1 extends Calc1
{
	public int add(int n1, int n2)
	{
		return n1+n2+1;
	}
}


public class Demo{
	public static void main(String args[])
	{	
		AdvCalc1 obj=new AdvCalc1();
		int r1=obj.add(3, 4);
		System.out.println(r1);
	}
}*/

/************************************************************************/

/*class Computer
{
	
}
class Laptop extends Computer
{
	
}

class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}


public class Demo{
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
		
//		obj=new D(); // as class D is not inheriting parent class A so it will give error.
		
//		Computer obj1=new Computer();
//		obj1=new Laptop();
	
	}
} 



Dynamic Method Dispatch (Runtime Polymorphism) in Java allows a child class to override a method of a parent class, and the method that gets called is determined at runtime based on the object type.

📌 Key Concept:
    Method Overriding → A subclass provides a specific implementation of a method already defined in its parent class.
    Upcasting → A parent class reference holds a child class object.
    Runtime Binding → The method call is resolved at runtime, not compile-time.

Why Use Dynamic Method Dispatch?

✅ Supports runtime polymorphism (flexibility & reusability).
✅ Enables method overriding for more specific behavior.
✅ Achieves loose coupling (code depends on interfaces, not concrete classes).

Example - Dynamic Method Dispatch in Action

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class - Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class - Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Animal myAnimal; // Parent class reference
        
        myAnimal = new Dog(); // Upcasting - Parent reference to Dog object
        myAnimal.makeSound();  // Calls Dog's overridden method

        myAnimal = new Cat(); // Upcasting - Parent reference to Cat object
        myAnimal.makeSound();  // Calls Cat's overridden method
    }
}

4️. Explanation (Step by Step)

    Create a Parent Class (Animal)
        It has a method makeSound() that prints "Animal makes a sound".
    Create Child Classes (Dog and Cat)
        They override the makeSound() method with their own implementation.
    Use Upcasting to Hold Child Objects
        Animal myAnimal = new Dog(); → Upcasting
        At runtime, makeSound() calls Dog's version of the method.
        Animal myAnimal = new Cat(); → Upcasting
        At runtime, makeSound() calls Cat's version of the method.

5️. Expected Output

Dog barks
Cat meows

📌 Why? Even though myAnimal is of type Animal, the method call depends on the actual object (Dog or Cat) at runtime.
6️. Key Takeaways

✔ Dynamic Method Dispatch enables runtime polymorphism.
✔ Method calls are resolved at runtime (not compile-time).
✔ Achieved using method overriding and upcasting.
✔ Enhances flexibility & maintainability.


*/

/************************************************************************/
//final - variable, method, class

//final class Calc1
//{
//	public void show()
//	{
//		System.out.println("in Calc show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}


/*class Calc1
{
	public final void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc1 extends Calc1
{
	public void show()
	{
		System.out.println("By John");
	}
}

	
public class  Demo{
  public static void main(String[] args) {
      
//  	final int num=8;
//  	num=9;
//  	System.out.println(num);
  	
//  	Calc1 obj= new Calc1();
//  	obj.show();
//  	obj.add(4, 5);
  	
  	AdvCalc1 obj= new AdvCalc1();
  	obj.show();
  	obj.add(4, 5);
  }
} */

/************************************************************************/

/* class Laptop
{
	String model;
	int price;
//	String serial;
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(model, price);
//	}
//	@Override
//	public String toString() {
//		return "Laptop [model=" + model + ", price=" + price + "]";
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Laptop other = (Laptop) obj;
//		return Objects.equals(model, other.model) && price == other.price;
//	}
	
	public String toString()
	{
		return model+ " : "+price;
	}
	public boolean equals(Laptop that)
	{
//		if(this.model.equals(that.model) && this.price==that.price) 
//			return true;
//		else
//			return false;
		
		return this.model.equals(that.model) && this.price==that.price ;
	}	
	
} 
	
public class  Demo{
    public static void main(String[] args) {

    	Laptop obj=new Laptop();
    	obj.model="Lenevo Yoga";
    	obj.price=1000;
    	System.out.println(obj);
//    	System.out.println(obj.toString());
    	
    	Laptop obj2=new Laptop();
    	obj2.model="Lenevo Yoga";
 //   	obj2.model="Lenevo Yoga1";
    	obj2.price=1000;
    	
//    	boolean result = obj.equals(obj2); //  false - compares hexadecimal number which is inside equals method
    	boolean result = obj.equals(obj2); // true - because we have written our own logic to compares values inside object
    	System.out.println("result: " + result);
    	
    }
}*/

/************************************************************************/

//class A
//{
//	public void show1()
//	{
//		System.out.println("in A show");
//	}
//}
//class B extends A
//{
//	public void show2()
//	{
//		System.out.println("in B show ");
//	}
//}

//public class  Demo{
//    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d; //typecasting from double to int data type - explicit typecasting 	
//    	System.out.println(i);
    	
//    	int j = 4;
//    	double d1 = j; //- implicit typecasting
//    	System.out.println(d1);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	A obj=new B();
//    	obj.show1();
    	
//    	A obj=new B();
//    	obj.show1();
//    	((B)obj).show2();  // downcasting
    	
//    	A obj=new B();
//    	B obj1=(B)obj; // downcasting
//    	obj1.show1();
//   	obj1.show2();

//    }
//}

/*
Upcasting & Downcasting in Java - Simple Explanation
1️. What is Upcasting?

Upcasting is the process of converting a child class object to a parent class reference.

    ✅ Happens automatically (implicit casting).
    ✅ Allows calling only the methods defined in the parent class.
    ✅ Supports polymorphism (runtime method overriding).

Example of Upcasting
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting: Dog → Animal
        myAnimal.makeSound();  // Calls Animal's method (or overridden one)
        
        // myAnimal.bark(); // ❌ Not allowed (because reference type is Animal)
    }
}

Explanation
    A Dog object is assigned to an Animal reference.
    Upcasting happens automatically.
    Only methods available in Animal can be accessed.
    If Dog overrides makeSound(), the overridden method runs.

📌 Output (if Dog does not override makeSound()):
Animal makes a sound

📌 Output (if Dog overrides makeSound()):
Dog barks


2. What is Downcasting?
Downcasting is the process of converting a parent class reference back to a child class object.

    ❌ NOT automatic (explicit casting required).
    ❌ If the object is not actually of the child type, it throws ClassCastException.
    ✅ Allows access to child-specific methods.
    
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting (Implicit)
        
        Dog myDog = (Dog) myAnimal; // Downcasting (Explicit)
        myDog.bark();  // ✅ Now we can call Dog-specific methods
        myDog.makeSound();
    }
}

Downcasting with instanceof (Safe Downcasting)

Using instanceof prevents ClassCastException.

if (myAnimal instanceof Dog) {
    Dog myDog = (Dog) myAnimal;
    myDog.bark();  // Safe downcasting
}

📌 Why use instanceof?
✔ Prevents casting errors by checking the object type before casting.


 Key Differences: Upcasting vs Downcasting
Feature						Upcasting (Child → Parent)					Downcasting (Parent → Child)
Automatic?					✅ Yes (Implicit)							❌ No (Explicit)
Safe?						✅ Always safe								❌ Risk of ClassCastException
Access to Child Methods?	❌ No										✅ Yes (after casting)
Polymorphism?				✅ Supports									❌ Used for specific needs

Final Summary
✔ Upcasting makes code more flexible (polymorphism).
✔ Downcasting is useful but should be done carefully with instanceof.
✔ Always check the object type before downcasting to avoid exceptions.


instanceof Operator in Java - Simple Explanation
1️⃣ What is instanceof?

instanceof is a Java operator used to check if an object belongs to a specific class or its subclass.

    ✅ Prevents ClassCastException by checking the object type before casting.
    ✅ Returns true if the object is an instance of the specified class or its subclass.
    ✅ Used in downcasting and runtime type checking.
    
Example - Checking Object Type

class Animal {}

class Dog extends Animal {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting (Dog → Animal)

        // Checking object type
        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");
        }
        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an instance of Animal");
        }
        if (myAnimal instanceof Object) {
            System.out.println("myAnimal is an instance of Object");
        }
    }
}

Output:
myAnimal is an instance of Dog
myAnimal is an instance of Animal
myAnimal is an instance of Object

Example - Safe Downcasting with instanceof

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SafeDowncasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting

        // Safe downcasting using instanceof
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Now it's safe to cast
            myDog.bark(); // Access Dog-specific method
        }
    }
}

Output:

Dog barks

📌 Why use instanceof?
✔ Prevents ClassCastException when downcasting.
✔ Ensures object is of the correct type before casting.


Key Takeaways

✔ instanceof checks if an object is of a specific class or subclass.
✔ Returns true if the object is an instance of the given class.
✔ Used for safe downcasting and runtime type checking.
✔ Always use instanceof before downcasting to avoid exceptions.
 */

/************************************************************************/

//Wrapper Classes
//int -> Integer
//char -> Character
//double -> Double


//public class Demo {
//    public static void main(String[] args){   
 
// 	Wrapper Class    	
//    	int num=7;
//   	Integer num1=new Integer(num); // Boxing - taking a primtive value and storing in Integer class wrapper object
//    	System.out.println(num1);
    	
//    	int num=7;
//    	Integer num1=num; // AutoBoxing - converts automatically
//    	System.out.println(num1);
    	
//    	Integer num1 = 7;
//    	int num2=num1.intValue(); // unboxing
//    	System.out.println(num2);
    	
//    	Integer num1 = 7;
//    	int num2=num1; // Auto unboxing
//    	System.out.println(num2);
    	
//    	String str="12";
//    	int num3=Integer.parseInt(str); // convert a String into an int (primitive type)
//    	System.out.println(num3+2);
    	
    	
    	
    	
//    	A wrapper class in Java is a class that encapsulates a primitive data type into an object. Java provides wrapper classes for each primitive type in the java.lang package.
//    	Primitive Type			Wrapper Class
//    	byte					Byte
//    	short					Short
//    	int						Integer
//    	long					Long
//    	float					Float
//    	double					Double
//    	char					Character
//    	boolean					Boolean
    	
//    	What is Boxing?
//		Boxing is the process of converting a primitive type into a wrapper object manually.

//        int num = 10; // Primitive type
//        Integer obj = Integer.valueOf(num); // Boxing: Manually converting int to Integer
//
//        System.out.println("Primitive int: " + num);
//        System.out.println("Boxed Integer: " + obj);
        
//      What is Autoboxing?
//		Autoboxing is the automatic conversion of a primitive type into its wrapper class by the compiler.
//        int num = 20;
//        Integer obj = num; // Autoboxing (Compiler automatically converts int to Integer)
//
//        System.out.println("Autoboxed Integer: " + obj);
		  
//    	Unboxing is the reverse of boxing—it converts a wrapper object back into a primitive type.
//        Integer obj = Integer.valueOf(30); // Wrapper class object
//        int num = obj.intValue(); // Unboxing: Manually converting Integer to int
//
//        System.out.println("Unboxed int: " + num);
        
//        Auto-unboxing is the automatic conversion of a wrapper object into its primitive type by the compiler.
//            Integer obj = 40; // Autoboxing (int → Integer)
//            int num = obj; // Auto-unboxing (Integer → int) //  Here, the compiler automatically converts obj (Integer) into an int value.
//            System.out.println("Auto-unboxed int: " + num);   	
    	
//    }
//}

/************************************************************************/
/*abstract class Car
{
//	public void drive()
//	{
//
//	}
	
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

//class WagnoR extends Car{ //concrete class
//
//	@Override
//	public void drive() {
//		System.out.println("driving");
//	}
//
//	@Override
//	public void fly() {
//		System.out.println("flying");
//	}
//	
//}

abstract class WagnoR extends Car
{
//	public void fly()
//	{
//		System.out.println("Flying...");
//	}
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdateWagnoR extends WagnoR   //concrete class
{
	public void fly()
	{
		System.out.println("flying...");
	}
}

public class  Demo{
    public static void main(String[] args) {

//   	Car obj=new Car();
//   	Car obj=new WagnoR();
//    	obj.drive();
//    	obj.fly();
//    	obj.playMusic();
    	
//    	Car obj=new UpdateWagnoR();
//    	obj.fly();
//    	obj.drive();
//    	obj.playMusic();
    }
} */

/************************************************************************/
/*class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in non static inner class config");
//		}
//	}
	
	static class B // static Inner class - outer class cannot be static. Only inner classes can be static
	{
		public void config()
		{
			System.out.println("in static inner class  config");
		}
	}
}


public class  Demo{
    public static void main(String[] args) {
//    	A obj=new A();
//    	obj.show();
//    	obj.config(); // gives error
    	
//    	A obj=new A();
//    	A.B obj1=obj.new B(); // calling non static inner class
//    	obj1.config();
//    	obj1.show(); // gives error
    	
    	A.B obj1=new A.B(); // calling static inner class
    	obj1.config();
    }
}*/

/************************************************************************/
/*class A
{
	public void show() 
	{
		System.out.println("in A show");
	}
}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class  Demo{
    public static void main(String[] args) {
    	
//    	A obj=new B();
//    	obj.show();
    	
    	A obj=new A()  // Anonymous Inner Class
    	{
    		public void show()
    		{
    			System.out.println("in new show"); 
    		}
    	};
    	obj.show(); // Output - in new show. as Anonymous Inner Class is used gives preference to in new show 
    }
}*/
/************************************************************************/

/*abstract class A
{
	public abstract void show();
	public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class  Demo{
    public static void main(String[] args) {
    	
//    	A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in anonymous inner class show method");
    		}

			public void config() {
				System.out.println("in anonymous inner class config method");
				
			}
    	};
    	obj.show();
    	obj.config();
    }
}*/
/************************************************************************/

/*interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // by default all variables are final and static 
	String area="Mumbai";
	
	void show(); // by default all classes in interface are public and abstract
	void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

public class Demo {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}*/

/***********************************************************************/
//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

/*interface AA
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

interface XX
{
	void run();
}
interface YY extends XX
{
	
}

class B implements AA,YY
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
	public void run()
	{
		System.out.println("running...");
	}
}

public class Demo {
 public static void main(String[] args) {

 	AA obj;
 	obj=new B();	
 	obj.show();
 	obj.config();
 	
 	XX obj1=new B(); // or YY obj1 = new B();
 	obj1.run();
 	
//   AA.area="Hyderabad";
 	
 	System.out.println(AA.area);
     
 }
}*/

/************************************************************************/

// ABSTRACT CLASS
/*abstract class Computer
{
	public abstract void code();
}

//class Laptop 
class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

//class Desktop
class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer computer)
	{
		computer.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//    	Laptop lap=new Laptop();
//    	Desktop desk=new Desktop();
//      Developer navin=new Developer();
//      navin.devApp(lap);
    	
    	Computer com=new Laptop();
    	Computer com1=new Desktop();
        Developer navin=new Developer();
//      navin.devApp(com); // calls laptop class as we are creating laptop object
        navin.devApp(com1); // calls desktop class as we are creating laptop object
        
    }
}*/


// INTERFACE 
/*interface Computer
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
	public void devApp(Computer computer)
	{
		computer.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//      Laptop lap=new Laptop();
//      Desktop desk=new Desktop();
        
        Computer com=new Laptop();
        Computer com1=new Desktop();
        
        Developer navin=new Developer();
//      navin.devApp(com); // calls laptop class as we are creating laptop object
        navin.devApp(com1); // calls desktop class as we are creating laptop object
    }
}*/


/************************************************************************/
/*enum Status{ // Status is like a class
	Running, Failed, Pending, Success; // named constants - like class objects
}

public class Demo {
    public static void main(String[] args) {

//    	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());
    	
    	Status[] ss=Status.values(); // gives all values of named constants as an array
//    	System.out.println(ss[0]); //Running
    	
    	for(Status s:ss)
    	{
    		System.out.println(s+" : "+s.ordinal()); // ordinal gives index value of named constants
    	}
        
    }
}*/

//Output :   	
//Running : 0
//Failed : 1
//Pending : 2
//Success : 3
/************************************************************************/
/*enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	Status s=Status.Pending;
    	System.out.println(s.getClass().getSuperclass()); // class java.lang.Enum - enum Status extends enum class only.
    	switch(s)
    	{
    		case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
    	}
    	
    	if(s==Status.Running)
    		System.out.println("All Good");
    	else if(s==Status.Failed)
    		System.out.println("Try Again");
    	else if ( s==Status.Pending)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    	
    }
}*/
/************************************************************************/
/*enum Laptop{ //cannot extend enum with any class but can do all other like class does.
//	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800); // parameterized constructor is created
	Mackbook(2000), XPS(2200), Surface, ThinkPad(1800); // Surface is default constructor
// since we are creating objects in same class constructor here is private
	
	private int price;
	
	private Laptop() //creating private default constructor for Laptop 
	{
		price=500;
		System.out.println("in Default constructor Laptop : " + this.name());
	}
	
	private Laptop(int price) //creating private parameterized constructor for Laptop 
	{
		this.price=price;
		System.out.println("in Parameterized constructor Laptop : " + this.name());
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
}

public class Demo {
    public static void main(String[] args) {

//    	Laptop lap=Laptop.Mackbook;
//    	System.out.println(lap+ " : "+lap.getPrice());
    	
//    	Laptop lap=Laptop.Mackbook;
//    	lap.setPrice(1_00_000); // changing price of MacBook
//    	System.out.println(lap.getPrice());
    	
    	for(Laptop lap : Laptop.values()) // gives all values of named constants as an array
    	{
    		System.out.println(lap+" : "+lap.getPrice());
    	}
    	
//    	Laptop lap=Laptop.Surface;
//    	System.out.println(lap.getPrice()); //gets default price as 500
    	

    }
} */

/*
 A private constructor in Java is used for specific design patterns and restrictions. Here’s why we create it, explained step by step:

    Prevent Object Creation
        A private constructor stops other classes from creating objects of that class.
        This is useful when we don’t want multiple instances of a class.

    Singleton Pattern
        A private constructor is used in the Singleton Pattern, which ensures that only one object of a class is created.
        We create a static method to provide access to this single instance.

    Utility Classes
        In utility/helper classes (like Math or Collections), we only have static methods.
        A private constructor prevents object creation since objects are not needed.

    Restricting Instantiation
        Sometimes, we want to restrict a class from being instantiated directly.
        Example: A factory method can control how objects are created instead.
        
    What is Singleton Pattern?
    It ensures that only one object of a class is created and provides a way to access that object.
    
    Step-by-Step Explanation:
Step 1: Make the constructor private:
    This prevents other classes from creating objects directly.
    Now, no one can do new Singleton(); outside the class.

Step 2: Create a private static instance:
    This is the only object of the class that will be created.
    It is declared static so it belongs to the class, not an instance.

Step 3: Provide a public static method:
    This method will return the single instance of the class.
    If the object is not created yet, it will create it. Otherwise, it will return the existing object.
    
When to use Singleton?
✅ When you need only one instance of a class, like:
    Database connections
    Logging system
    Configuration settings    
 */

// Code Example (Lazy Initialization Singleton)
//class Singleton {
//    private static Singleton instance; // Step 2: Private static instance
//
//    private Singleton() {} // Step 1: Private constructor
//
//    public static Singleton getInstance() { // Step 3: Public static method
//        if (instance == null) { // If no instance exists, create one
//            instance = new Singleton();
//        }
//        return instance; // Return the single instance
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) { 
//        Singleton obj1 = Singleton.getInstance(); // hello.Singleton@5f0e4369
//        Singleton obj2 = Singleton.getInstance(); // hello.Singleton@5f0e4369 - Both obj1 and obj2 refer to the same object.
//
//        System.out.println(obj1 == obj2); // true (both are the same instance)
//    }
//}

/*
 Types of Singleton Implementations:
   1. Lazy Initialization (above example)
        Object is created only when needed (when getInstance() is called).

   2. Eager Initialization (Creates object at the start)
   
   3. Thread-Safe Singleton (for multi-threaded applications)
 */
//Eager Initialization (Creates object at the start)
//class Singleton {
//    private static final Singleton instance = new Singleton(); // Created at start
//    private Singleton() {}
//    public static Singleton getInstance() {
//        return instance; // Always returns the same instance
//    }
//}

//Thread-Safe Singleton (for multi-threaded applications)
//class Singleton {
//    private static Singleton instance;
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() { // `synchronized` ensures thread safety
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

/*************************************************************************/
/*@Deprecated
class A
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class B extends A 
{
	@Override
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

public class Demo {
    public static void main(String[] args) {
    	
    	B obj=new B();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
} */

/*************************************************************************/
/*Types of Interface:-
1. Normal interface - an interface having two or more methods
2. Functional interface (SAM) - SAM => Single Abstract Method interface
3. Marker interface - an interface that as no methods (blank interface) - like Serializiation and Deserialization concept.
*/

/*Step 1: What is Serialization?
	    Serialization means converting an object into a byte stream (a series of bytes).
	    This allows us to save the object in a file, send it over a network, or store it in a database.
	    The class must implement the Serializable interface.

Step 2: What is Deserialization?
	    Deserialization is the process of converting the byte stream back into an object.
	    This allows us to retrieve the saved object and use it again.

Key Points to Remember

	    ✅ Serializable Interface:

	        The class must implement Serializable, but it has no methods to override.

	    ✅ serialVersionUID:

	        Helps during deserialization to check class version compatibility.
	        If not defined, Java generates one automatically.

	    ✅ Transient Keyword:

	        If you don’t want to save a particular field, mark it as transient.

	    transient int ssn; // This field won't be saved	    

Real-World Use Cases

Saving user session data
Sending objects over a network (e.g., in web services)
Caching objects to files

Summary in Simple Terms:
Serialization (Saving):
    Open a file (FileOutputStream).
    Use ObjectOutputStream to write an object into the file.
    Close the file.
Deserialization (Reading):
    Open the file (FileInputStream).
    Use ObjectInputStream to read the object from the file.
    Convert it back into a Java object.
This allows Java objects to be saved and retrieved later.

private static final long serialVersionUID = 1L; - What is serialVersionUID?

serialVersionUID is like a unique ID for a class when using Serialization and Deserialization.
Why do we need serialVersionUID?
Imagine you save an object to a file (Serialization) and later read it back (Deserialization).
💡 If the class structure changes (e.g., you add or remove a variable), Java might not recognize the old saved object and throw an error.

How serialVersionUID helps?
    It acts as a version number for the class.
    If the class structure remains the same, deserialization works fine.
    If the class structure changes, Java checks the serialVersionUID to ensure compatibility.
    
Simple Example Without serialVersionUID

import java.io.*;

class Person implements Serializable {
    String name;
    int age;
}

    You save an object of Person (Serialization).
    Later, you change the Person class by adding a new variable:
    
class Person implements Serializable {
    String name;
    int age;
    String address;  // New field added
}

If you try to deserialize the old saved object, Java throws an InvalidClassException because the class structure has changed.

How serialVersionUID Fixes This?
If you manually define serialVersionUID, Java ignores small changes and allows deserialization.
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Unique ID

    String name;
    int age;
}

Now, if you add or remove fields, Java still allows deserialization (as long as the class is compatible).
Key Points to Remember:
✔️ If you don’t set it manually, Java automatically generates a serialVersionUID, but it can change if the class changes.
✔️ If you manually set it, Java uses your value and allows deserialization even if minor changes occur.
✔️ If the serialVersionUID of a saved object does not match the class, Java throws an error during deserialization.

*/

//Let’s take an example where we save an object to a file and then read it back.
//Step 1: Create a class and implement Serializable
//import java.io.*;  // Required for Serialization
//
//class Person implements Serializable { // Step 1: Implement Serializable
//    private static final long serialVersionUID = 1L; // Good practice
//    String name;
//    int age;
//
//    // Constructor
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Display object data
//    public void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}

// Serialize (Save) the Object:   This saves the Person object into a file called person.ser.
//public class Demo {
//    public static void main(String[] args) {
//       try {
            // Create an object
//            Person person1 = new Person("Alice", 25);

            // Create file output stream
//            FileOutputStream fileOut = new FileOutputStream("person.ser");  // Creates (or opens) a file named "person.ser" to store the object. Think of this as opening a notebook to write down some information.
//			  FileOutputStream fileOut = new FileOutputStream("C:/Users/Aarthi Muthiya/Downloads/person.ser"); // Windows
//
//              ObjectOutputStream out = new ObjectOutputStream(fileOut); // Wraps around FileOutputStream to allow writing Java objects (not just text). Think of this as a special pen that lets you write full objects into the notebook.
           // Write object to file (Serialization)
//            out.writeObject(person1); // Converts person1 (an object of Person class) into bytes and saves it in person.ser. Imagine writing a detailed note in your notebook.
//            out.close();
//            fileOut.close();
//
//            System.out.println("Object Serialized and saved in person.ser");
//            
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

// Deserialize (Load) the Object:  This reads the object back from the file and restores it.
//public class Demo {
//    public static void main(String[] args) {
//        try {
//            // Create file input stream
//            FileInputStream fileIn = new FileInputStream("person.ser"); // Opens the file "person.ser" to read the saved object. Think of this as opening your notebook to read the notes.
//            ObjectInputStream in = new ObjectInputStream(fileIn); // Wraps around FileInputStream to read Java objects (not just text). Think of this as a special reading tool that understands the object format.
//
//            // Read object from file (Deserialization)
//            Person person2 = (Person) in.readObject(); // Reads the object from the file and converts it back into a Java object. This is like reading the note from your notebook and recreating the object in memory.
//            in.close();
//            fileIn.close();
//
//            System.out.println("Object Deserialized:");
//            person2.display(); // Output: Name: Alice, Age: 25
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
/*************************************************************************/
/*@FunctionalInterface
interface A
{
	void show();
//	void run(); // gives error as FunctionalInterface contains only SAM - single abstract method
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Demo {
    public static void main(String[] args) {
    	
    	A obj=new A()
    	{    	
    		public void show()
    		{
    			System.out.println("in Show");
    		}
    	};
 //   	A obj=new B();
    	obj.show();
    }
}*/

/************************************************************************/
//@FunctionalInterface
//interface A
//{
////	void show();
//	void show(int i);
////	void show(int i,int j);
//
//}

//public class Demo {
//    public static void main(String[] args) {
//    	
////    	A obj=new A()
////    	{
////    		public void show(int i)
////    		{
////    			System.out.println("in show "+i);
////    		}
////    	};
////    	obj.show(5);
//    	
////    	A obj=() -> System.out.println("in Show A");  
////    	obj.show();
//    	
//    	
////    	A obj=(int i) ->System.out.println("in show "+ i);
////    	obj.show(5);
//    	
////    	A obj=(int i,int j) ->System.out.println("in show "+ i);
////    	obj.show(5,8);
//    	
////    	A obj=i -> System.out.println("in show "+ i);
////    	obj.show(5);
//    }
//}
/************************************************************************/
//@FunctionalInterface
//interface A
//{
//	int add(int i, int j);
//}


//public class Demo {
//    public static void main(String[] args) {
////   	A obj=new A()
////   	{
////   		public int add(int i, int j)
////   		{
////   			return i+j;
////   		}
////   	};
//    	
//    	A obj=(i,j) -> i+j;
//   	
//   	int result=obj.add(5, 4);
//   	System.out.println(result);
//    }
//}

/************************************************************************/
//public class Demo {
//    public static void main(String[] args) {
//    
//    int i=0;
//    int j=0;
//   
//    try
//    {
//    	j=18/i;
//    }
//    catch(Exception e)
//    {
//    	System.out.println("Something went wrong");
//    }
//    System.out.println(j);
//    
//    System.out.println("Bye");
//    }
//}
/************************************************************************/
//public class Demo {
//    public static void main(String[] args) {
//    	
//    	int i=2;
//  //  	int i=0;
//    	int j=0;
//    	
//    	int nums[]=new int[5];
//    	String str=null;
//    	
//    	try
//    	{
//    		j=18/i;
//    		System.out.println(str.length());
//    		System.out.println(nums[1]);
//    		System.out.println(nums[5]);
//    	}
////    	catch(Exception e) // Always write parent class Exception at bottom only
////    	{
////  
////    		System.out.println("Something went wrong."+e);
////    	}
//    	catch(ArithmeticException e)
//    	{
//    		System.out.println("Cannot divide by zero");
//    	}
//    	catch(ArrayIndexOutOfBoundsException e)
//    	{
//    		System.out.println("Stay in your limit.");
//    	}
//    	catch(Exception e)
//    	{
//  
//    		System.out.println("Something went wrong."+e);
//    	}
//    	System.out.println(j);
//    	System.out.println("Bye");
//    }
//}

/************************************************************************/
//public class Demo {
//    public static void main(String[] args) {
//    	
////    	int i=2;
//    	int i=20;
//    	int j=0;
// 
//    	try
//    	{
//    		j=18/i;
//    		if(j==0)
//    			throw new ArithmeticException("I don't want to do print zero");
//    	}
//
//    	catch(ArithmeticException e)
//    	{
//    		j=18/i;
//    		System.out.println("that is default output" + e);
////    		System.out.println("Cannot divide by zero");
//    	}
//    	
//    	catch(Exception e)
//    	{
//    		System.out.println("Something went wrong."+e);
//    	}
//    	System.out.println(j);
//    	System.out.println("Bye");
//    }
//}

/************************************************************************/
//class NavinException extends Exception  // Custom Exception (Checked Exception)
//{
//	public NavinException(String string)
//	{
//		super(string);
//	}
//}
//public class Demo {
//    public static void main(String[] args) {
//    	int i=20;
//    	int j=0;
//    	
//    	try
//    	{
//    		j=18/i;
//    		if(j==0)
//    			throw new NavinException("I don't want to do print zero");
//    	}
//    	
////    	catch (NavinException e) { // Explicitly catches NavinException instead of using catch(Exception e).
////    	    System.out.println("Custom Exception: " + e.getMessage());
////    	}
//    	
//    	catch(Exception e) // This catches all exceptions, including NavinException (since NavinException extends Exception). If you remove this catch block, the NavinException remains unhandled, causing a compilation error.
//    	{
//    		System.out.println("Something went wrong "+ e);
//    	}
//    	
//    	System.out.println(j);
//    	System.out.println("Bye");
//    }
//}
/************************************************************************/
/*class NavinException extends Exception
{
	public NavinException(String string)
	{
		super(string);
	}
}

class A
{
	public void show() throws ClassNotFoundException 
	{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find the class " + e);
//    	}
		Class.forName("Calc");
	}
}

public class Demo {
	
	static {
		System.out.println("Class Loaded");
	}
	
    public static void main(String[] args) {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find the class " + e);
//    	}
    	A obj=new A();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    }
} */

/************************************************************************/

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException{   	
    	
//    	System.out.println("Enter a number");
//    	int num=System.in.read(); // it gives ASCII value for each letter or number - A-65, a-97, 0-48 ... 
//    	System.out.println(num-48);
    	
//    	System.out.println("Enter a number");
//    	InputStreamReader in=new InputStreamReader(System.in);
//    	BufferedReader br=new BufferedReader(in);
//    	int num=Integer.parseInt(br.readLine());
//    	System.out.println(num);
//    	bf.close();
    	
    	System.out.println("Enter a number");
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	System.out.println(num);
    }
}*/

/************************************************************************/
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException {   
    	
//    	int i=0;
//    	int j=0;
//    	try // using try-catch-finally
//    	{
//    		j=18/i;
//    		
//    	}
//    	catch(Exception e)
//    	{
//    		System.out.println("Someting went wrong.");
//    		System.out.println("Bye");
//    	}
//    	finally // used mostly when u want to close resource
//    	{
//    		System.out.println("Bye");
//    	}
    	
//    	int num=0;
//    	BufferedReader br=null;
//    	try // using try-finally
//    	{
//    		System.out.println("Enter a number");
//    		InputStreamReader in =new InputStreamReader(System.in);
//    		br=new BufferedReader(in);
//    		num=Integer.parseInt(br.readLine());
//    		System.out.println(num);
////    		br.close();
//    	}
//    	finally
//    	{
//    		br.close();
//    	}
    	
    	int num=0;
    	System.out.println("Enter a number");
    	//BufferedReader br=null;
    	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) // using try-with resources - used to close resources automatically if classes like BufferedReader extends Closable or AutoClosable 
    	{
//    		InputStreamReader in =new InputStreamReader(System.in);
//    		BufferedReader br=new BufferedReader(in);
    		num=Integer.parseInt(br.readLine());
    		System.out.println(num);
//    		br.close();
    	}
    }
}*/

/************************************************************************/
/*Threads:-
Multiple threads run at same time in a code.
This is known as Multithreading.

- A thread is a smallest unit to work with. (individual task)
- They can run parallely.
- Multiple threads can share resources.*/
/************************************************************************/
/*class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
		}
	}
}

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj1.start();
    	obj2.start();
    }
    
}*/

/************************************************************************/
/*class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj2.setPriority(Thread.MAX_PRIORITY);
    	System.out.println(obj1.getPriority()); // 5 - normal priority value. 10 - highest and  - least priority value
    	
    	obj1.start();
    	try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    	obj2.start();
    }
    
} */



//print hai and hello parallely in java using threads

/*class HaiThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hai");
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        HaiThread hai = new HaiThread();
        HelloThread hello = new HelloThread();

        hai.start();   // Start "Hai" thread
        hello.start(); // Start "Hello" thread
    }
}*/

//Alternative Using Runnable (Another Way) - Instead of extending Thread, you can implement Runnable:
/*class PrintTask implements Runnable {
    private String word;

    public PrintTask(String word) {
        this.word = word;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(word);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintTask("Hai"));
        Thread t2 = new Thread(new PrintTask("Hello"));

        t1.start();
        t2.start();
    }
}*/

/***********************************************************************/
/*class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
//    	A obj1=new A();
//    	B obj2=new B();
//    	obj1.start(); // after implementing Runnable interface we can't use start method as Runnable method doesn't have start() in it. Only Thread class has start().
//    	obj2.start();
    	
//    	A obj1=new A();
//    	B obj2=new B();
//    	Thread t1=new Thread(obj1);
//    	Thread t2=new Thread(obj2);
//    	t1.start();
//    	t2.start();
    	
//    	Runnable obj1=new A();
//    	Runnable obj2=new B();
//    	Thread t1=new Thread(obj1);
//    	Thread t2=new Thread(obj2);
//    	t1.start();
//    	t2.start();
    	
//    	Runnable obj1=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};
//    	
//   		Runnable obj2=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};
//   		
//   	Thread t1=new Thread(obj1);
//    	Thread t2=new Thread(obj2);
//    	t1.start();
//    	t2.start();
   		
    	Runnable obj1=()->
    	{
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hi");
    			try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
    		}
    	};
    	
    	Runnable obj2=()->
    	{
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hello");
    			try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	t1.start();
    	t2.start();
    	
    }
    
} */

/***********************************************************************/
// Thread safe - only one thread can work at a time
/*class Counter
{
	int count;
//	public void increment()
	public synchronized void increment() // synchronized - only one thread works at one time. synchronized keyword makes your output constant as 20_000
	{
		count++;
	}
}

public class Demo {
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10_000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10_000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    	
    	t1.join();
    	t2.join();
    	
    	System.out.println(c.count);
    }
} */

/***********************************************************************/
/* Thread States:
- New State -> Thread t1=new Thread()
- Runnable State  ->  start() method
- Running State   -> a thead is running with run() method 
- Waiting State	 -> sleep(),  wait() method
- Dead State -> during runnable / running state, if thread is over it goes to stop state 

Through notify(), you will go from waiting state to runnable state.
From Running, Runnable state to dead state through stop() method.
 */
/***********************************************************************/
//Collection API -> concept
//Collection -> Interface
//Collections -> classe with multiple methods
//			    different type of data structures

/************************************************************************/
//Difference between Collection , Collection API and Collections in Java. need simple example with easy explaination
//Collection (Interface):
//Collection is the root interface of the Java Collection Framework (JCF).
//It provides basic methods like add(), remove(), size(), etc.
//Other interfaces like List, Set, and Queue extend Collection.
//It is part of java.util package.

//Example: Using Collection Interface:

//public class Demo {
//  public static void main(String[] args) {
//      Collection<String> names = new ArrayList<>(); // Using Collection Interface
//      names.add("Alice");
//      names.add("Bob");
//
//      System.out.println("Names: " + names);
//  }
//}

//✅ Output:
//Names: [Alice, Bob]

//Collection API:
//The Collection API is the complete set of interfaces and classes in Java to work with collections.
//It includes interfaces (Collection, List, Set, Queue) and their implementations (ArrayList, HashSet, LinkedList, etc.).
//📌 Example: Different Parts of Collection API

//import java.util.*;
//public class Demo {
//  public static void main(String[] args) {
//      List<Integer> list = new ArrayList<>(); // Part of Collection API
//      Set<String> set = new HashSet<>(); // Part of Collection API
//      Queue<Double> queue = new LinkedList<>(); // Part of Collection API
//      
//      list.add(10);
//      set.add("Hello");
//      queue.add(5.5);
//
//      System.out.println("List: " + list);
//      System.out.println("Set: " + set);
//      System.out.println("Queue: " + queue);
//  }
//}

//Output:
//List: [10]
//Set: [Hello]
//Queue: [5.5]

//Collections (Utility Class):
//Collections is a utility/helper class in java.util package.
//It provides static methods to operate on collections, like:
//  sort()
//  reverse()
//  shuffle()
//  min(), max()
//  binarySearch(), etc.
//
//📌 Example: Using Collections Utility Class
//import java.util.*;
//
//public class Demo {
//  public static void main(String[] args) {
//      List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
//      
////    ArrayList numbers1 = (ArrayList) Arrays.asList(5, 3, 9, 1);
//      
//      Collections.sort(numbers); // Sorting the list
//      System.out.println("Sorted List: " + numbers);
//      
//      System.out.println("After sorting : " + numbers);
//      
//      Collections.reverse(numbers); // Reversing the list
//      System.out.println("Reversed List: " + numbers);
//  }
//}

//Output:
//Sorted List: [1, 3, 5, 9]
//Reversed List: [9, 5, 3, 1]

//Quick Comparison Table
//Feature	Collection (Interface)	Collection API	Collections (Class)
//Type	Interface	API (Set of Interfaces & Classes)	Utility Class
//Purpose	Defines common methods for all collections	Provides complete framework for working with collections	Provides helper methods for collection operations
//Contains?	Basic methods (add(), remove(), etc.)	Collection, List, Set, Queue, Map & implementations	Static utility methods (sort(), reverse(), shuffle(), etc.)
//Example	Collection<String> list = new ArrayList<>();	List, Set, Queue & their classes	Collections.sort(list);

//Final Summary
//✔ Collection → Root interface of the Collection framework.
//✔ Collection API → Complete set of interfaces and classes for collections.
//✔ Collections → A utility/helper class with static methods for operations on collections.

/************************************************************************/
/*import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums= new ArrayList<Integer>();
//    	Collection nums=new ArrayList();
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");
    	
    	System.out.println("Number at 2nd index : "+nums.get(2)); // Returns the element at the specified position in this list.
    	
    	System.out.println("Number 2 at which index : "+nums.indexOf(5)); // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    	
    	for(int n:nums)
    	{
    		System.out.println(n);	
    	}
//    	for(Object n:nums)
//    	{
//    		int num=(Integer)n;
//    		System.out.println(nums*2);	
//    	}
    }
} */

/************************************************************************/
/*import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){   
    	Set<Integer> nums=new HashSet<Integer>();  //not sorted in order and gives only unique values	
//    	Set<Integer> nums=new TreeSet<Integer>(); //sorted in order and gives only unique values
//    	Collection<Integer> nums=new TreeSet<Integer>();
    	nums.add(62);
    	nums.add(54);
    	nums.add(82);
    	nums.add(21);
//    	nums.add(54); // In Set interface - prints only unique values 
    	//nums.add("5");
    	
    	Iterator<Integer> values = nums.iterator();
    	
    	while(values.hasNext())
    		System.out.println(values.next());
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(n);
//   	}
    }
}*/ 

/************************************************************************/
/*import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){   
    	
    	Map<String, Integer> students=new HashMap<>();
//    	Map<String, Integer> students=new Hashtable<>(); // Both HashMap and Hashtable works same. for synchronized multithreading use HashTable else for normal use HashMap. 
    	
    	students.put("Navin",56); // In HashMap - keys are like Set interface which is unique and values are like List interface which can be duplicate
    	students.put("Harsh",23);
    	students.put("Sushil",67);
    	students.put("Kiran",92);
    	students.put("Harsh",45); // It will replace Harsh as keys should be unique
//    	students.put(null,55); // For HashMap - we can have null as key but if we insert another null key it gets replaced with new value. For HashTable - throws NullPointer Exception
//    	students.put(null,75); 
    	
    	System.out.println(students.values()); // [56, 67, 92, 45]
    	
    	System.out.println(students.entrySet()); // [Navin=56, Sushil=67, Kiran=92, Harsh=45]
    	
    	System.out.println(students); // {Navin=56, Sushil=67, Kiran=92, Harsh=45}
    	
    	System.out.println(students.get("Harsh")); // 45
    	
    	System.out.println(students.keySet()); // [Navin, Sushil, Kiran, Harsh]
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}*/
/************************************************************************/
/*class Student1 implements Comparable<Student1>{
	int age;
	String name;
	
	public Student1(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student1 that) {
//		if(this.age > that.age) // compare current student age (this.age) with another student age(that.age) - we are giving power to class Student to compare themselves
//			return 1; // swap values as 1 is positive number
//		else
//			return -1; // do not swap values as -1 is negative number 
//   can use ternary operator instead of above if else condition code
//	    return (this.age > that.age)?1:-1;

//		Compare names and arrange in alphabetically order. If names are same order by age
		int nameComparison = this.name.compareTo(that.name); //	Compare names:

//		if (nameComparison == 0) { // Method-1 - If names are same, compare age
//	        return Integer.compare(this.age, that.age);
//	    }
		
		if (nameComparison == 0) { // Alternate Method-2
			if(this.age > that.age)
				return 1; // swap values as 1 is positive number
			else
				return -1; // do not swap values as -1 is negative number
		}
		return nameComparison;
	}
}

public class Demo {
	public static void main(String[] args) {		
		List<Integer> nums= new ArrayList<>(); // works because Integer class implements Comparable<Integer> interface that has its own natural sorting logic
//		nums.add(43);
//		nums.add(31);
//		nums.add(72);
//		nums.add(29);
//		Collections.sort(nums);
//		System.out.println(nums);
		
//		Comparator<Integer> com=new Comparator<Integer>() { //Comparator is an interface which is used to specify your own logic for sorting using compare()
//			public int compare(Integer i,Integer j) {
//				if(i%10 > j%10)
//					return 1; // swap values as 1 is positive number
//				else
//					return -1; // do not swap values as -1 is negative number
//			}
//		};
//		Collections.sort(nums, com);
//		System.out.println(nums);
		
		List<Student1> studs = new ArrayList<>();
		studs.add(new Student1(21, "Aarthi"));
		studs.add(new Student1(28, "Isha"));
		studs.add(new Student1(51, "Hanu"));
		studs.add(new Student1(32, "Aarthi"));
		
//		Comparator<Student1> com=new Comparator<Student1>() { //Comparator is an interface which is used to specify your own logic for sorting using compare()
//			public int compare(Student1 i,Student1 j) {
//				if(i.age > j.age)
//					return 1; // swap values as 1 is positive number
//				else
//					return -1; // do not swap values as -1 is negative number   	
//			}
//		};
		
		//Above code I have used lambda expression
		Comparator<Student1> com=(i,j) -> (i.age > j.age) ? 1:-1;
		
//		Collections.sort(studs, com);
		Collections.sort(studs); // will not work because it is not implementing Comparable<Integer> interface. So to work we need class Student to implement Comparable for natural sorting logic 
		System.out.println(studs);
		
	}
} */

//Logic to sort elements based on the length of the string 	
/*public class Demo {
	public static void main(String[] args) {
		Comparator<String> com=new Comparator<String>() { //Comparator is an interface which is used to specify your own logic for sorting using compare()
			public int compare(String i,String j) {
				if(i.length() >j.length())
					return 1; // swap values as 1 is positive number
				else
					return -1; // do not swap values as -1 is negative number
			}
		};
		
		List<String> names= new ArrayList<>();
		names.add("Aarthi");
		names.add("Isha");
		names.add("Pandian");
		names.add("Hema Malini");
		
		Collections.sort(names, com);
		System.out.println(names);
	}
}*/


//Comparator - on which logic you want to sort the elements you can use Comparator
//Comparable - if you want to give power to class itself to compare its object to itself then use Comparable


/*	The Comparator interface in Java is considered a functional interface even though it has multiple methods because only one of 
those methods is abstract: the compare() method.
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
This allows you to use lambda expressions and method references to implement the compare() method concisely, 
which is a key feature of functional programming in Java.

*/

/************************************************************************/
/*public class Demo {
	public static void main(String[] args){ 
	
		//	Instead of creating array as List<Integer> nums= new ArrayList<>(); nums.add(43); nums.add(31); etc.  
		//	We have used List<Integer> nums= Arrays.asList(4,5,7,3,2,6); --> Both works similar to each other
		
			List<Integer> nums= Arrays.asList(4,5,7,3,2,6); 
		//	Normal for loop   	
		//	for(int i=0;i<nums.size();i++)
		//	{
		//		System.out.println(nums.get(i));
		//	}
			
		//	Enhanced for loop    	
		//	for(int n: nums)
		//	{
		//		System.out.println(n);
		//	}
		
		//	forEach loop    	
			nums.forEach(n -> System.out.println("All values in an array: "+n));
		//	
		//	
		//	int sum=0;
		//	for(int n:nums)
		//	{
		//		if(n%2==0)
		//		{
		//			n=n*2;
		//			sum=sum+n;
		//		}
		//	}
		//	
		//	System.out.println(nums);
		//	System.out.println("Multiply by 2 and sum of all even numbers: "+ sum);
		//
	}
} */

/************************************************************************/
/*public class Demo { 
	public static void main(String[] args){   
		//	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
		//	nums.forEach(n -> System.out.println("All values in an array: "+ n));
		
			
		//	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);    	
		//	Consumer<Integer> con=new Consumer<Integer>() {
		//		
		//		public void accept(Integer n)
		//		{
		//			System.out.println("All values in an array: "+ n);
		//		}
		//	};
		//	nums.forEach(con);
		
			
		//	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);    	
		//	Since Consumer is a functional interface we can use lambda function by reducing above lines of code like below:
		//	Since we have only one S.O.P we can remove {}; and Integer keyword
		//	Consumer<Integer> con= n -> System.out.println("All values in an array: "+ n);
		//	nums.forEach(con);
		
			
		//	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
		//	nums.forEach(n -> System.out.println("All values in an array: "+ n));  
			
		
		//	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);   	
		//	Stream<Integer> s1= nums.stream();
		//	s1.forEach(n-> System.out.println(n)); // Gives desired output
		//	s1.forEach(n-> System.out.println(n)); // This gives error because Stream gives output only once - Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//	Stream<Integer> s2= s1.filter(n ->n%2==0);
		//	s2.forEach(n -> System.out.println(n));
		//	Stream<Integer> s3= s2.map(n->n*2);
		//	s3.forEach(n -> System.out.println(n));
		//	int result=s3.reduce(0,(c,e)->c+e);
		//	System.out.println(result);
		
			
		//	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);    	
		//	int result=nums.stream()
		//					.filter(n-> n%2==0)
		//					.map(n->n*2)
		//					.reduce(0, (c,e)-> c+e);
		//	System.out.println(result);
			
			
		//	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);  	    	
		////	filter method in Stream class uses Predicate functional interface and Predicate contains test abstract method
		//	Predicate<Integer> p= new Predicate<Integer>() {
		//		public boolean test(Integer n) {
		//			if(n%2==0)
		//					return true;
		//				else
		//					return false;
		//			
		////		Above code can be written in one line as given below:				
		////			return n%2==0;
		//		}
		//	};
			
		//	int result=nums.stream()
		//					.filter(p) // this p can be replaced with n-> n%2==0 as .filter(n-> n%2==0)
		//					.map(n->n*2)
		//					.reduce(0, (c,e)-> c+e);
		//	System.out.println(result);
		
			
		//	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);  	
		//	Since "Predicate" is functional interface we can use lambda expression by removing {}; , Integer keyword and (). Since it has only one return statement we can remove return keyword.   	
		//	Predicate<Integer> p= n-> n%2==0;
		//	
		//	int result=nums.stream()
		//					.filter(p) // this p can be replaced with n-> n%2==0 as .filter(n-> n%2==0)
		//					.map(n->n*2)
		//					.reduce(0, (c,e)-> c+e);
		//	System.out.println(result);
		
			
		//	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
		//	map method in Stream class uses "Function" functional interface and "Function" contains apply abstract method	
		//	Function<Integer, Integer> fun= new Function<Integer,Integer>() {
		//		public Integer apply(Integer n) {
		//			return n*2;
		//		}
		//	};
		//
		//	int result=nums.stream()
		//					.filter(n-> n%2==0)
		//					.map(fun)
		//					.reduce(0, (c,e)-> c+e);
		//	System.out.println(result);
		
			
		//	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
		//	Since "Function" is functional interface we can use lambda expression by removing {}; , Integer keyword and (). Since it has only one return statement we can remove return keyword.   			
		//	Function<Integer,Integer> fun= n-> n*2;
		//	
		//	int result=nums.stream()
		//					.filter(n-> n%2==0)
		//					.map(fun) // this fun can be replaced with n-> n*2 as .map(n-> n*2)
		//					.reduce(0, (c,e)-> c+e);
		//	System.out.println(result);
		
			
			List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
			Stream<Integer> sortedValues = nums.stream()
												.filter(n-> n%2==0)
												.sorted(); // Output : 2 4 6 as we get even numbers these even numbers are sorted
			sortedValues.forEach(n -> System.out.println(n)); 
		
			
		//	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
		//	parallelStream() used with the filter that creates multiple threads to work faster. 
		//	parallelStream should not be used with a sorted method as sorting requires all the elements together, so  multiple threads will create an ambiguity.    	
		//	Stream<Integer> sortedValues = nums.parallelStream() 
		//										.filter(n-> n%2==0);  // Output : 2 4 6 as we get even numbers these even numbers are sorted
		//	sortedValues.forEach(n -> System.out.println(n));
	}
}*/

/************************************************************************/
/*public class Test1 { 
//var instVar = 10; //var' is not allowed here - var is not allowed for instance variable
 int nonStaticVariable = 10; // Non-static variable
public static void main(String[] args){ 

//		LVTI - Local Variable Type Inference
//	Java is Statically-Typed Programming Language because we declare variables using data type. Eg: int i = 10;
//	After Java 10 - we are using var i = 10; --> applicable only for local variables and not instance variables
//		Instance variable are meant for storage. We store instance variables  
//	Local variable are meant for processing in a method we don't generally store local variables.  	
//	var keyword works with Java 10 and above versions
	int i = 10;
	var a = 20; // ((Object)a).getClass().getName() --> output: java.lang.Integer;  ((Object)a).getClass().getSimpleName() --> output: Integer
	// By default var is converting data type for us behind the scene
	System.out.println("a value : "+ a);
	var b = "Aarthi"; // ((Object)b).getClass().getName() --> output: java.lang.String;  ((Object)b).getClass().getSimpleName() --> output: String
	var c = 'A'; // ((Object)c).getClass().getName() --> output: java.lang.Character;  ((Object)c).getClass().getSimpleName() --> output: Character
	var d = 5.5f; // ((Object)d).getClass().getName() --> output: java.lang.Float;  ((Object)d).getClass().getSimpleName() --> output: Float
	var e = 5.5d; // ((Object)e).getClass().getName() --> output: java.lang.Double;  ((Object)e).getClass().getSimpleName() --> output: Double
	var f = 5000L; // ((Object)f).getClass().getName() --> output: java.lang.Long;  ((Object)f).getClass().getSimpleName() --> output: Long
	
//	In Java every class is inherited from the Object class itself. So if you have a variable and you would like to know its data type. You can use below code:  	
	System.out.println(((Object)b).getClass().getName());
	System.out.println(((Object)b).getClass().getSimpleName());
	
	ArrayList<Integer> obj = new ArrayList<>();
	var  obj1 = new ArrayList<>();
//	System.out.println(((Object)obj1).getClass().getName()); //output: java.util.ArrayList
//	System.out.println(((Object)obj1).getClass().getSimpleName()); //output: ArrayList
	
//	int aa;
//	System.out.println(aa); // Compile time error - The local variable aa may not have been initialized
//	var bb; //Compile time error - Cannot use 'var' on variable without initializer
	
//	int aa = 0;
//	System.out.println(aa); //Output = 0
	
//	String var = "Aarthi";
//	System.out.println(var); // var can be used as variable name and also can be used as keyword for datatype
	
//	int nums[] = new int [10];
//	int nums[] = new int []; // compile time error - Variable must provide either dimension expressions or an array initializer - must specify size of array
//	var nums1 = new int[]; // compile time error - Variable must provide either dimension expressions or an array initializer - must specify size of array
//	var nums1 = new int[10]; // do not use [] for array nums1 like nums1[]. It will give compile time error
//	System.out.println(((Object)nums1).getClass().getName()); //output: [I
//	System.out.println(((Object)nums1).getClass().getSimpleName()); //output: int[]
	
//	var nums2[] = new int [10]; //compile time error - 'var' is not allowed as an element type of an array. do not use [] for array nums1 like nums1[].

   	Test1 t1 = new Test1();
   	System.out.println("Non-Static variable: "+t1.nonStaticVariable); // To access a non-static variable within a static method, you must first create an instance of the class and then use that instance to access the variable.
	
//	Test2 t2 = new Test2();
	var t2 = new Test2();
//	System.out.println("Static instance variable: "+t2.i); // The static field Test2.i should be accessed in a static way
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
//static int i;// This is a valid declaration of a static variable
static int i = 20; // This is a valid declaration of a static variable
//static var j = 20; // compile time error - 'var' is not allowed here. var cannot be used for instance variable
int instNum = 10;
public void show() {
	i++; // Non-Static Method Accessing Static variable.
	System.out.println("post increment of i inside non-static method: "+i);
	++i;
	System.out.println("pre increment of i inside non-static method: "+i);
	i = 30; // Non-Static Method Accessing Static variable - changing value of static instance variable 
	var getnums = 10;
	System.out.println("getnums inside non-static method: "+getnums);
//	You cannot create a static variable inside a non-static method; static variables belong to the class itself and are declared outside any method, meaning they are not defined within the scope of a non-static method.
//	static int num = 10; // compile time error - Illegal modifier for parameter num; only final is permitted
//	static var i = 20; //compile time error  - Illegal modifier for parameter i; only final is permitted
	instNum++; 
	System.out.println("post increment of instNum inside non-static method: "+instNum);
	++instNum;
	System.out.println("pre increment of instNum inside non-static method: "+instNum);
}
static {
//	static int num = 10; // compile time error - Illegal modifier for parameter num; only final is permitted
//	static var i = 20; // compile time error - Illegal modifier for parameter num; only final is permitted
	var j = 20;
	System.out.println("get j inside static block: "+j); // static block is executed the moment object is created using new keyword for class Test2
//	instNum++;//compile time error - Non-static variables cannot be used inside static methods. Cannot make a static reference to the non-static field instNum
	int normalVar = 10;
	System.out.println("get normalVar inside static block: "+normalVar); 
}
public static void giveNumber() {
	i++; // Access the static variable using the class name. Non-Static Method Accessing Static variable.
	System.out.println("post increment of i inside static method: "+i);
	++i;
	System.out.println("pre increment of i inside static method: "+i);
//		This is not allowed, as you cannot declare a static variable within a method 
//	static int num = 10; //compile time error - Illegal modifier for parameter num; only final is permitted
//	instNum++; //compile time error - Non-static variables cannot be used inside static methods. Cannot make a static reference to the non-static field instNum
	int normalVar1 = 10;
	System.out.println("get normalVar1 inside static block: "+normalVar1);
}
} */
/************************************************************************/
//ParallelStream in Java:

/*public class Demo { 
	public static void main(String[] args){  
		int size = 10_000;
		List<Integer> nums = new ArrayList<>(size); // create a list that will have some capacity of 10_000
		Random ran = new Random();
		for(int i=1; i<=size; i++) {
//			 add the upper bound (exclusive) of 100 so that only values from 0 to 100 are available0. 
			nums.add(ran.nextInt(100));
		}
//		System.out.println(nums);
	
		
		
//	    sum1 and sum2 are same but difference is we used mapToInt method in sum2 instead of reduce method in sum1			
//		int sum1 = nums.stream()
//						.map(i -> i*2)
//						.reduce(0, (c,e) -> c+e);
//		int sum2 = nums.stream()
//				.map(i -> i*2)
//				.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value as it can be of any type of stream,. we need to change to int i.
//				.sum();
//		System.out.println(sum1+ " " +sum2);	
	
		
		
//	    long startSeq = System.currentTimeMillis(); // gives current time in milliseconds
//		int sum2 = nums.stream()
//						.map(i -> i*2)
//						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value as it can be of any type of stream,. we need to change to int i.
//						.sum();
//		long endSeq = System.currentTimeMillis();
//		
//		long startPara = System.currentTimeMillis();
//		int sum3 = nums.parallelStream()
//		 			   .map(i -> i*2)
//					   .mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value.
//					   .sum();
//		long endPara = System.currentTimeMillis();
//		
//		System.out.println(sum2+ " " +sum3);
//		System.out.println("Seq: " + (endSeq - startSeq));
//		System.out.println("Para: "  + (endPara - startPara));
		
		
		
		long startSeq = System.currentTimeMillis();
		//Adding try and catch block in map method
		int sum2 = nums.stream()
						.map(i -> {
							try {
								Thread.sleep(1);
							}catch(Exception e) {
								
							}
							return i*2;
							})
						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value.
						.sum();
		long endSeq = System.currentTimeMillis(); // gives current time in milliseconds	
		
		long startPara = System.currentTimeMillis(); // gives current time in milliseconds
		int sum3 = nums.parallelStream()
						.map(i -> {
							try {
								Thread.sleep(1);
							}catch(Exception e) {
							
							}
							return i*2;
						})
						.mapToInt(i -> i) // MaptoInt gives you new stream. We need to convert stream into integer for sum(). here it gets stream value of i and convert i from stream to int type for sum() to work on int value and not stream value.
						.sum();
		long endPara = System.currentTimeMillis(); // gives current time in milliseconds
		
		System.out.println(sum2+ " " +sum3);
		System.out.println("Seq: " + (endSeq - startSeq));
		System.out.println("Para: "  + (endPara - startPara));
	}
} */

/************************************************************************/
//Optional class in Java: - a class that tries to avoid Null Pointer Exception
/*public class Demo { 
	public static void main(String[] args){ 
//		List<String> names = Arrays.asList("Navin", "Lakshmi", "Xavier", "John", "Kishor"); 
//		Optional<String> name = names.stream()
//								 	 .filter(str -> str.contains("x"))
//								     .findFirst(); // find 'X' letter first name
//		System.out.println(name.get()); // If X letter name not found  gives output as " Run Time Exception: Exception in thread "main" java.util.NoSuchElementException: No value present "
//		System.out.println(name.orElse("Not found")); // X letter name not found so gives output as " Not found ". If X letter name is found it gives output as "Laxmi"
	
		List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor"); 
		String name = names.stream()
			 	 		   .filter(str -> str.contains("x"))
			 	 		   .findFirst()
			 	 		   .orElse("Not Found");
		System.out.println(name); // X letter name not found so gives output as " Not found ". If X letter name is found it gives output as "Laxmi"
	}
}*/


//Method Reference in Java: pass a method name inside a method and we need to use method name along with class name or object name
/*public class Demo { 
	public static void main(String[] args){ 
//	List<String> names = Arrays.asList("Tom","Jim", "Jack");
//	List<String> uNames = names.stream()
//							   .map(name -> name.toUpperCase())
//							   .toList();
//	System.out.println(uNames);
//	uNames.forEach(i -> System.out.println(i));
	
	List<String> names = Arrays.asList("Tom","Jim", "Jack");
	List<String> uNames = names.stream()
			   				   .map(String :: toUpperCase)
			                   .toList();
//	System.out.println(uNames);
	uNames.forEach(System.out :: println);
	}
}*/


//Constructor Reference in Java:	

/*public class Demo { 
	public static void main(String[] args){ 
//		Method-1:
//		List<String> names = Arrays.asList("Tom","Jim", "Jack");
//		List<Student1> students = new ArrayList <> ();
//		for(String name : names) {
//			students.add(new Student1(name));
//		}
//		System.out.println(students);
		
		
//		Method-2:
//		List<String> names = Arrays.asList("Tom","Jim", "Jack");
//		List<Student1> students = new ArrayList <> ();
//		students = names.stream()
//						.map(name -> new Student1(name))
//						.toList();
//		System.out.println(students);
		
		
//		Method-3:
		List<String> names = Arrays.asList("Tom","Jim", "Jack");
		List<Student1> students = new ArrayList <> ();
		students = names.stream()
						.map(Student1 :: new)
						.toList();
		System.out.println(students);
	}
}

class Student1{
	private String name;
	private int age;
	
	public Student1(String name) {
	this.name = name;
	}
	
	public Student1() {
	
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
	return "Student1 [name=" + name + ", age=" + age + "]";
	}

}*/

/************************************************************************/
//Difference between Collection , Collection API and Collections in Java. need simple example with easy explaination
//Collection (Interface):
//Collection is the root interface of the Java Collection Framework (JCF).
//It provides basic methods like add(), remove(), size(), etc.
//Other interfaces like List, Set, and Queue extend Collection.
//It is part of java.util package.

//Example: Using Collection Interface:

//public class Demo {
//    public static void main(String[] args) {
//        Collection<String> names = new ArrayList<>(); // Using Collection Interface
//        names.add("Alice");
//        names.add("Bob");
//
//        System.out.println("Names: " + names);
//    }
//}

//✅ Output:
//Names: [Alice, Bob]

//Collection API:
//The Collection API is the complete set of interfaces and classes in Java to work with collections.
//It includes interfaces (Collection, List, Set, Queue) and their implementations (ArrayList, HashSet, LinkedList, etc.).
//📌 Example: Different Parts of Collection API

//import java.util.*;
//public class Demo {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(); // Part of Collection API
//        Set<String> set = new HashSet<>(); // Part of Collection API
//        Queue<Double> queue = new LinkedList<>(); // Part of Collection API
//        
//        list.add(10);
//        set.add("Hello");
//        queue.add(5.5);
//
//        System.out.println("List: " + list);
//        System.out.println("Set: " + set);
//        System.out.println("Queue: " + queue);
//    }
//}

//Output:
//List: [10]
//Set: [Hello]
//Queue: [5.5]

//Collections (Utility Class):
//Collections is a utility/helper class in java.util package.
//It provides static methods to operate on collections, like:
//    sort()
//    reverse()
//    shuffle()
//    min(), max()
//    binarySearch(), etc.
//
//📌 Example: Using Collections Utility Class
//import java.util.*;
//
//public class Demo {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
//        
////      ArrayList numbers1 = (ArrayList) Arrays.asList(5, 3, 9, 1);
//        
//        Collections.sort(numbers); // Sorting the list
//        System.out.println("Sorted List: " + numbers);
//        
//        System.out.println("After sorting : " + numbers);
//        
//        Collections.reverse(numbers); // Reversing the list
//        System.out.println("Reversed List: " + numbers);
//    }
//}

//Output:
//Sorted List: [1, 3, 5, 9]
//Reversed List: [9, 5, 3, 1]

//Quick Comparison Table
//Feature	Collection (Interface)	Collection API	Collections (Class)
//Type	Interface	API (Set of Interfaces & Classes)	Utility Class
//Purpose	Defines common methods for all collections	Provides complete framework for working with collections	Provides helper methods for collection operations
//Contains?	Basic methods (add(), remove(), etc.)	Collection, List, Set, Queue, Map & implementations	Static utility methods (sort(), reverse(), shuffle(), etc.)
//Example	Collection<String> list = new ArrayList<>();	List, Set, Queue & their classes	Collections.sort(list);

//Final Summary
//✔ Collection → Root interface of the Collection framework.
//✔ Collection API → Complete set of interfaces and classes for collections.
//✔ Collections → A utility/helper class with static methods for operations on collections.

/************************************************************************/
package hello;

import java.util.ArrayList;

public class Test4 { 
	//var instVar = 10; //var' is not allowed here - var is not allowed for instance variable
	int nonStaticVariable = 10; // Non-static variable
	public static void main(String[] args){ 
	
	//	LVTI - Local Variable Type Inference
	//	Java is Statically-Typed Programming Language because we declare variables using data type. Eg: int i = 10;
	//	After Java 10 - we are using var i = 10; --> applicable only for local variables and not instance variables
	//	Instance variable are meant for storage. We store instance variables  
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
	
	 	Test4 t1 = new Test4();
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
} 
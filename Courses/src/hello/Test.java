package hello;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;

//enum Status{
//	Running, Failed, Pending, Success;
//}

//class AA extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println("Hi");
//			try {
//				Thread.sleep(10000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class BB extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println("Hello");
//			try {
//				Thread.sleep(10000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//} 

public class Test {

//	public static void main(String[] args) throws NumberFormatException, IOException {
	public static void main(String[] args){
//		Status s = Status.Pending;
//		String result = "";
//		if(s==Status.Running)
//    		System.out.println("All Good");
//    	else if(s==Status.Failed)
//    		System.out.println("Try Again");
//    	else if ( s==Status.Pending)
//    		System.out.println("Please Wait");
//    	else
//    		System.out.println("Done");
		
// 		Method-1:		
//		switch(s)
//    	{
//    		case Running:
//    			System.out.println("All Good");
//    			break;
//    			
//    		case Failed:
//    			System.out.println("Try Again");
//    			break;
//    			
//    		case Pending:
//    			System.out.println("Please Wait");
//    			break;
//    		
//    		default:
//    			System.out.println("Done");
//    			break;
//    	}
	
		
// 		Method-2:		
//		switch(s){
//			case Running -> System.out.println("All Good");
//			case Failed -> System.out.println("Try Again");
//			case Pending -> System.out.println("Please Wait");
//			default -> System.out.println("Done");
//		}

		
// 		Method-3:
//		switch(s){
//			case Running -> result = "All Good";
//			case Failed -> result = "Try Again";
//			case Pending -> result = "Please Wait";
//			default -> result = "Done";
//		}	
//		System.out.println(result);
		

// 		Method-4:
//		result = switch(s){
//			case Running -> "All Good";
//			case Failed -> "Try Again";
//			case Pending -> "Please Wait";
//			default -> "Done";
//		};
//		System.out.println(result);	

		
// 		Method-5:
//		result = switch(s){
//			case Running : yield "All Good";
//			case Failed : yield "Try Again";
//			case Pending : yield "Please Wait";
//			default : yield "Done"; 
//		};
//		System.out.println(result);	

//		System.out.println("Enter a number");
//		InputStreamReader in = new InputStreamReader(System.in);
//		BufferedReader bf = new BufferedReader(in);
//		int num = Integer.parseInt(bf.readLine());
//		System.out.println("number:" + num);
//		bf.close();
		
//		System.out.println("Enter a number");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		System.out.println("number:" + num);
		

//    	AA obj1=new AA();
//    	BB obj2=new BB();

//    	obj2.setPriority(Thread.MAX_PRIORITY);
//    	System.out.println(obj1.getPriority());
    	
// 		how to get the priority of a thread
//        System.out.println("Priority is: " + obj1.getPriority());
//		range of priority goes from 1 - 10
//      1 -> LOWEST PRIORITY
//      10->HIGHEST PRIORITY
//        System.out.println("Priority (before) is: " + obj1.getPriority());
//        obj1.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Priority (after) is: " + obj1.getPriority());
//
//    	obj1.start();
//    	try {
//			Thread.sleep(10000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//    	obj2.start();
	}

}

// Sealed Classes:
// Abstract Class - A base class that has abstract methods and define methods. Implementation of abstract class methods are done by concrete classes/normal classes. Abstract class are meant to be inherited. We don't create object of abstract class. We create object of subclasses that inherit methods of abstract class.
// Final Class - A class that cannot be inherited. This is final implementation of final class and can't be inherited. No subclass can inherit final class.
// final class A{...}
// class B extends A{...} // gives compile time error - final class can't be inherited
// If you want inheritance and not every class can inherit it. We need to restrict it. In new Java version we are using sealed class in which subclass or sub interface that can inherit from a particular class and interface with the help of "sealed" keyword. Only specific class can be inherited and not all class.
// i. parent class must have "sealed" keyword and must have "permits" keyword for which subclass can use sealed parent class.
// ii. subclass that extends parent class must have either 3 options - "final/non-sealed/sealed" keyword and must have "extends" keyword to extend sealed parent class.
// iii. we can make subclass as "non-sealed" which can be extended by some other classes.
// iv. sealed class can extends any other inbuilt java classes and use implements for interface like --> sealed class A extends Thread implements Runnable permits B, C{...}
// v. "permits" keyword must be last word to add
sealed class parentA extends Thread implements Runnable permits childB,childC{
	
}
// final class childB extends parentA{ // as class childB is final it cannot be inherited by any subclass
// non-sealed childB extends parentA{  //we can make subclass as "non-sealed" which can be extended by some other classes
sealed class childB extends parentA permits childD,childF{ // childB is sealed and is giving permission to be used by subclass childD	

} 
final class childC extends parentA{ // no one can extend childC class
// non-sealed class childC extends parentA{ // we can make subclass as "non-sealed" which can be extended by some other classes
	
}
// class childD extends parentA{ // compile time error - The class childD with a sealed direct supertype parentA should be declared either final, sealed, or non-sealed
// subclasses that use sealed parent class must have keyword as either final/sealed/non-sealed
final class childD extends childB{	// no one can extend childD class

}

final class childE implements Y{
	
}
// sealed class childF permits childG{
// non-sealed class childF permits childG{ // A type declaration childF that has a permits clause should have a sealed modifier - because non-sealed class can be used by any subclass 
// non-sealed class childF implements Y{// The non-sealed class childF must have a sealed direct supertype
non-sealed class childF extends childB{
	
}
// final class childG extends childF{
final class childG{	
	
}
sealed interface X permits Y{ // sealed interface gives permit to interface Y
	
}

// sealed interface Y extends X permits childE {
// non-sealed interface Y extends X permits childE { // A type declaration Y that has a permits clause should have a sealed modifier - because non-sealed class can be used by any subclass 
non-sealed interface Y extends X {	// can be used by any subclass that implements interface Y
	
}

//final interface Z{ // compile time error - Illegal modifier for the interface Z; only public & abstract are permitted
//	interface can never be final. interface can have two options either sealed or non-sealed
// classes can have three options either sealed or non-sealed or final
//}
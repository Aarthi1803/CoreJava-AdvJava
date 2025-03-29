package hello;

import java.util.Objects;

//public sealed class MySealedClass permits Alpha, Beta {
//
//}
//
//sealed class Alpha extends MySealedClass permits Gamma {
//	
//}
//
//non-sealed class Beta extends MySealedClass {
//	
//}
//
//final class Gamma extends Alpha {
//
//}



// Because this is all in one file, MySealedClass does not require a permits clause.
//public sealed class MySealedClass {
//
//}
//
//final class Alpha extends MySealedClass{
//	
//}
//
//final class Beta extends MySealedClass{
//	
//}


//public sealed class MySealedClass permits Alpha {
//	public static void main(String args[]) {
//		MySealedIF msif = new Alpha();
//		msif.myMeth();
//		MySealedIF msif1 = new Beta();
//		msif1.myMeth();
//	}
//}
//
//sealed interface MySealedIF permits Alpha, Beta, MyIF {
//	void myMeth();
//}
//
//non-sealed class Alpha extends MySealedClass implements MySealedIF {
//	public void myMeth(){
//		System.out.println("In Alpha's myMeth()");
//	}
//}
//
//final class Beta implements MySealedIF {
//	public void myMeth(){
//		System.out.println("In Beta's myMeth()");
//	}
//}
//
//non-sealed interface MyIF extends MySealedIF {
//
//}



// However, as is the case with sealed classes, it is also possible for a sealed interface and its implementing classes (and extending interfaces) to be stored in a single file as long as the classes and interfaces have default package access. In cases such as this, no permits clause
// is required for a sealed interface. For example, here MySealedIF does not include a permits clause because Alpha and Beta are declared in the same file in the unnamed module:
//public sealed class MySealedClass permits Alpha, Beta{
//	public static void main(String args[]) {
//		MySealedIF msif = new Alpha();
//		msif.myMeth();
//		MySealedIF msif1 = new Beta();
//		msif1.myMeth();
//	}
//}
//sealed interface MySealedIF {
//	void myMeth();
//}
//
//non-sealed class Alpha extends MySealedClass implements MySealedIF {
//	public void myMeth(){
//		System.out.println("In Alpha's myMeth(),");
//	}
//}
//
//final class Beta extends MySealedClass implements MySealedIF {
//	public void myMeth(){
//		System.out.println("In Beta's myMeth(),");
//	}
//}

// Record Classes:

//class Alien{
//	//variables that hold data here are called as states.
//	private final int id;
//	private final String name;
//	
//	public Alien(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "Alien [id=" + id + ", name=" + name + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Alien other = (Alien) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//	
//	
//}



// Data Carrier Classes: Some classes are used only for data storage or for data carrying purpose. We are not going to change that data that class and objects are used only for data transfer. so from server side you will convert that object into json that json goes to client. 
// Object here is immutable and is only used for data storage. To create that particular object in Java we have inbuilt class called Record class.
// To create a class for holding data we need to create alot of methods. For this problem we have solution called record class. In Java if you want to represent  a class which holds only data as data carrier class we can create something called record.
// In record class, instance variables are known as components and are called as state variables/ state description. Behind the scene it is creating a parameterized constructor for you. Constructor created based on values created here are known as Canonical constructor. By default there is no default constructor inside a record class and also variables are private and final as they are immutable data.
// Record class cannot be extended by any other class because record class extends record class.
// record class can implement interface as many as you want: record Alien (int id, String name) implements Runnable{...}
// we can create our own methods in record class like
// record Alien (int id, String name) implements Runnable{
//	public void show(){
//	}
// }
// we can create normal methods, static methods and also static variables.
// To create instance variable do it here --> record Alien (int id, String name, int age)
// no getters and setters here direct use variable name to get values - System.out.println(a1.name() + ":" +a1.id());

record Alien (int id, String name) implements Runnable{
	
	static int num;
//	public Alien() { //compile time error - A non-canonical constructor must start with an explicit invocation to a constructor
//		this(0, " "); // to resolve this error we need to call parameterized constructor
//	}
	
//	public Alien(int id, String name) { // this is happening behind the scene
//		if(id == 0) // I don't need ID to be zero so doing a check here. Doing a check before creating an object inside constructor
//			throw new IllegalArgumentException("ID cannot be zero");
//		this.id = id;
//		this.name = name;
//	} // This constructor is called as canonical constructor because it has same parameters as defined in state description i.e. record Alien (int id, String name)
	
	//compact canonical constructor - don't mention state description in constructor i.e. public Alien {...} instead of public Alien(int id, String name) {...}
	//no need to mention this variable assignment. Assign variables are don't automatically just do the checks which you need.
	public Alien{
		if(id == 0) // I don't need ID to be zero so doing a check here. Doing a check before creating an object inside constructor
			throw new IllegalArgumentException("ID cannot be zero");
	}

	@Override
	public void run() {
		
	}
	
	public void show() { //create own methods in record class
		
	}
	
}

public class MySealedClass{
	public static void main(String args[]) {
		Alien a1 = new Alien(1, "Aarthi");
		Alien a2 = new Alien(2, "Aarthi");
		Alien a3 = new Alien(3, "Aarthi");
		//public read-only accessor methods (getter methods) that have the same names and types as the record components name and id are provided. Therefore, these getter methods are called name( ) and id( ).
		System.out.println(a1.name() + ":" +a1.id()); // no getters and setters here direct use variable name
		// Alien a3 = new Alien();
		System.out.println(a1.equals(a2)); // here it is comparing 2 object memory location and gives output as false.
		// to compare values of 2 objects and not object memory location and give output as true we need to override equals() and hashCode() method
		// System.out.println(a3); // output - Alien[id=0, name= ]

	}
}
package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
//		Pqr p = new Pqr(); // creating the object and loading the class - gives output -> in Static block  in instance block
		Class.forName("jdbc.Pqr"); // not creating the object but loading the class - gives output -> in Static block
		Class.forName("jdbc.Pqr").newInstance(); // creates the object and loads the class - gives output -> in Static block  in instance block
		Class.forName("com.mysql.cj.jdbc.Driver"); // loads the Driver class and register Mysql connector
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // to register driver we use this statement
	}
}

class Pqr{
	static { // static block - while loading the class it executes this static block
		System.out.println("in Static block");
	}
	
	{ // instance block - while creating  the  object of class it executes this instance block
		System.out.println("in instance block");
	}
}

/* We have a class PQR and in this class we have a static block-a block which will be executed once you load the class. 
So we have a static block and then we have instance block.

So this stuff here -  Class.forName("com.mysql.cj.jdbc.Driver"); is same as this thing - DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());  
But the question arise how its same it is because whenever you go to the Driver class of your MySQL connector in this you have a static
block and this static block does the same thing which you you are trying to do-DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()). 
so whenever you call Class.forName("com.mysql.cj.jdbc.Driver"); it will load the Driver class and it will execute the static block 
of Driver class and when we execute static block it will call the method which is registering driver 
so that means you do not have to write this statement - DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());  
because you're writing Class.forName("com.mysql.cj.jdbc.Driver");
It is actually the static block of Driver class which loads register driver.
 */

package hello;
// Declare an employee record. This automatically creates a record class with private, final fields called name and idNum, and with read-only accessors called name () and idNum(). 
// record Employee (String name, int idNum) {}

//public class RecordDemo {
//
//	public static void main(String[] args) {
//		// Create an array of Employee records.
//		Employee [] empList = new Employee [4];
//		empList [0]= new Employee ("Doe, John", 1047);
//		empList [1]= new Employee("Jones, Robert", 1048); 
//		empList [2]= new Employee ("Smith, Rachel", 1049); 
//		empList [3]= new Employee("Martin, Dave", 1050);
//		// Use the record accessors to display names and IDs. 
//		for (Employee e: empList)
//			System.out.println("The employee ID for " + e.name() + ":" +e.idNum());
//	}
//
//}


// record Employee (String name, int idNum) {
// Use a canonical constructor to remove any leading and trailing spaces that might be in the name string. This ensures that names are stored in a consistent manner.
//	public Employee (String name, int idNum) {
		// Remove any leading and trailing spaces.
//		this.name = name.trim();
//		this.idNum = idNum;
//	}
//}



//record Employee (String name, int idNum) {
//Use a compact canonical constructor to remove any leading and trailing spaces from the name string.
//	public Employee {
//		//Remove any leading and trailing spaces.
//		name = name.trim();
//	}	
//}



//public class RecordDemo {
//
//	public static void main(String[] args) {
//		// Create an array of Employee records.
//		Employee [] empList = new Employee [4];
//		// Here, the name has no leading or trailing spaces.
//		empList [0]= new Employee ("Doe, John", 1047);
//		// The next three names have leading and/or trailing spaces.
//		empList [1]= new Employee(" Jones, Robert", 1048); 
//		empList [2]= new Employee ("Smith, Rachel ", 1049); 
//		empList [3]= new Employee(" Martin, Dave ", 1050);
//		// Use the record accessors to display names and IDs. 
//		for (Employee e: empList)
//			System.out.println("The employee ID for " + e.name() + ":" +e.idNum());
//	}
//
//}



// Use a non-canonical constructor in a record.
// Declare an employee record that explicitly declares both a canonical and non-canonical constructor.
//record Employee (String name, int idNum) {
// Use a static field in a record.
//	static int pendingID = -1;
// Use a compact canonical constructor to remove any leading and trailing spaces from the name string.
//	public Employee {
		// Remove any leading and trailing spaces.
//		name = name.trim();
//	}
// This is a non-canonical constructor. Notice that it is not passed an ID number. Instead, it passes pendingID to the canonical constructor to create the record.
//	public Employee (String name) {
//		this (name, pendingID);
//	}
//}

//public class RecordDemo {
//	public static void main(String[] args) {
//	Employee[] empList = new Employee [4];
	// Create a list of employees that uses the Employee record. 
//	empList [0]= new Employee ("Doe, John", 1047);
//	empList [1]= new Employee ("Jones, Robert", 1048); 
//	empList [2]= new Employee ("Smith, Rachel", 1049);
	// Here, the ID number is pending. 
//	empList [3]= new Employee ("Martin, Dave");
	// Display names and IDs.
//		for (Employee e: empList) {
//			System.out.print ("The employee ID for " + e.name() + " is ");
//			if (e.idNum() == Employee.pendingID) System.out.println("Pending"); else System.out.println(e.idNum());
//		}
//	}
//}



//Use a compact canonical constructor to remove any leading and trailing spaces in the name component. 
//Also perform a basic check that the required format of lastname, firstname is passed to the name parameter.
// record Employee (String name, int idNum) {
//	public Employee {
		//Remove any leading and trailing spaces.
//		name = name.trim();
		//Perform a minimalist check that name follows the lastname, firstname format.
		//First, confirm that name contains only one comma.
//		int i = name.indexOf(','); // look for comma separating names. 
//		int j= name.lastIndexOf(',');
//		if(i!=j) 
//			throw new IllegalArgumentException("Multiple commas found.");
		//Next, confirm that a comma is present after at least one leading character, and that at least one character follows the comma.
//		if(i < 1 | name.length() == i+1) 
//			throw new IllegalArgumentException("Required format: last, first");
//	}
//}

//public class RecordDemo {
//	public static void main(String[] args) {
//		Employee[] empList = new Employee [4];
//		empList [0]= new Employee ("Doe, John", 1047);
		// No comma between last and first name. 
		// empList [1] = new Employee ("Jones Robert", 1048);
		// Extra commas.
		// empList [1] = new Employee ("Jones,, Robert", 1048);
		// Missing last name.
		// empList [1] = new Employee(", Robert", 1048);
//		empList [1] = new Employee ("Jones, Robert", 1048);
//		empList [2]= new Employee ("Smith, Rachel", 1049);
//		empList [3]= new Employee ("Martin, Dave", 1051);
		// Display names and IDs.
//		for (Employee e: empList) {
//			System.out.println("The employee ID for " + e.name() + " is " + e.idNum());
//		}
//	}
//}

//Use an instance method in a record.
//This version of Employee provides a method called lastName() that returns only the last name of the name component. 
//It also includes the version of the compact constructor that checks for the conventional lastname, firstname format. 
record Employee (String name, int idNum) {
//Use a compact canonical constructor to remove any leading and trailing spaces in the name component. 
// Also perform a basic check that the required format of lastname, firstname is passed to the name parameter.
	public Employee {
	//Remove any leading and trailing spaces.
	name = name.trim();
	//Perform a minimalist check that name follows the lastname, firstname format.
	//First, confirm that name contains only one comma.
	int i = name.indexOf(',');
	//look for comma separating names. 
	int j = name.lastIndexOf(',');
	if(i!=j) 
	throw new IllegalArgumentException ("Multiple commas found.");
	//Next, confirm that a comma is present after at least one leading character, and that at least one character follows the comma.
	if(i < 1 | name.length() ==i+1) 
	throw new IllegalArgumentException ("Required format: last, first");
	}
	//An instance method that returns only the last name without the first name.
	String lastName() {
		return name.substring(0, name.trim().indexOf(','));
	}
}


class RecordDemo {
	public static void main(String[] args) {
	Employee emp = new Employee ("Jones, Robert", 1048);
	//Display the name component unmodified. 
	System.out.println("Employee full name is " + emp. name());
	//Display only last name.
	System.out.println("Employee last name is " + emp.lastName());
	}
}

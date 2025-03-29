package java_interview_questions;

//  Shallow Cloning:

//Step 1: Create Address class (used in Person)
/*class Address implements Cloneable {
	 String city;
	
	 Address(String city) {
	     this.city = city;
	 }
	
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
	     return super.clone(); // Shallow copy - Calls super.clone(), which copies the object but not its referenced objects.
	 }
}

//Step 2: Create Person class
class Person implements Cloneable {
	 String name;
	 Address address; // Reference type
	
	 Person(String name, Address address) {
	     this.name = name;
	     this.address = address;
	 }
	
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
	     return super.clone(); // Shallow copy - new Person object shares the same Address reference.
	 }
}

//Step 3: Test Cloning
public class Mphasis_Interview {
	 public static void main(String[] args) throws CloneNotSupportedException {
	     Address address = new Address("New York");
	     Person p1 = new Person("Alice", address); // Original object
	
	     // Cloning p1 into p2
	     Person p2 = (Person) p1.clone();
	
	     System.out.println("Before change:");
	     System.out.println("p1 Address: " + p1.address.city);
	     System.out.println("p2 Address: " + p2.address.city);
	
	     // Changing address in p1
	     p1.address.city = "Los Angeles";
	
	     System.out.println("\nAfter change:");
	     System.out.println("p1 Address: " + p1.address.city);
	     System.out.println("p2 Address: " + p2.address.city); // Also changes in p2
	 }
} */

/* Output : 
	Before change:
	p1 Address: New York
	p2 Address: New York
	
	After change:
	p1 Address: Los Angeles
	p2 Address: Los Angeles
 */


// Deep Cloning:

//Step 1: Modify Address class for deep cloning
class Address implements Cloneable {
 String city;

 Address(String city) {
     this.city = city;
 }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     return new Address(this.city); // Creating a new Address object. returns a new Address object (new Address(this.city)). Each clone gets a new, independent Address object.
 }
}

//Step 2: Modify Person class for deep cloning
class Person implements Cloneable {
 String name;
 Address address;

 Person(String name, Address address) {
     this.name = name;
     this.address = address;
 }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     Person cloned = (Person) super.clone(); // Clone Person object
     cloned.address = (Address) address.clone(); // Deep copy of Address - Clone Address object separately (Deep Copy) - after calling super.clone(), we also call address.clone() to ensure the new Person object gets a separate Address copy.
     return cloned;
 }
}

//Step 3: Test Deep Cloning
public class Mphasis_Interview {
 public static void main(String[] args) throws CloneNotSupportedException {
     Address address = new Address("New York");
     Person p1 = new Person("Alice", address); // Original object

     // Deep Cloning p1 into p2
     Person p2 = (Person) p1.clone();

     System.out.println("Before change:");
     System.out.println("p1 Address: " + p1.address.city);
     System.out.println("p2 Address: " + p2.address.city);

     // Changing address in p1
     p1.address.city = "Los Angeles";

     System.out.println("\nAfter change:");
     System.out.println("p1 Address: " + p1.address.city);
     System.out.println("p2 Address: " + p2.address.city); // No change in p2
 }
} 

/*
 Before change:
p1 Address: New York
p2 Address: New York

After change:
p1 Address: Los Angeles
p2 Address: New York
 
 */

// Object Class Methods:

// toString() Method:
/*class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println(p.toString()); // Calls overridden toString()
    }
}*/

// equals(Object obj) Method
/*class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        Car car = (Car) obj;
        return this.model.equals(car.model); // Compare content
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla");
        Car c2 = new Car("Tesla");
        System.out.println(c1.equals(c2)); // true (because we overrode equals())
    }
}*/

// hashCode() Method
/*class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        return model.hashCode(); // Generates hash code based on model name
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla");
        Car c2 = new Car("Tesla");
        System.out.println(c1.hashCode()); // Hashcode for Tesla
        System.out.println(c2.hashCode()); // Same as c1 since model is same
    }
} */


// clone() Method

/*class Student implements Cloneable {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Performs cloning
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Alice");
        Student s2 = (Student) s1.clone();
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}*/

// finalize() Method

/*class Demo {
    @Override
    protected void finalize() {
        System.out.println("Object is being garbage collected!");
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Demo d = new Demo();
        d = null; // Remove reference
        System.gc(); // Request garbage collection
    }
}*/

// getClass() Method

/*class Animal {}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.getClass().getName());
    }
}*/

//  wait(), notify(), notifyAll() Methods

/*class SharedResource {
    synchronized void waitForSignal() throws InterruptedException { // This method is synchronized, meaning only one thread can execute it at a time. A thread calling this method waits until another thread signals it.
        System.out.println("Waiting...");
        wait(); // Pause thread - The current thread pauses and releases the lock on SharedResource. It goes into a waiting state until another thread calls notify() on the same object.
        System.out.println("Resumed!");
    }

    synchronized void sendSignal() { // This method is also synchronized, ensuring only one thread modifies SharedResource at a time.
        System.out.println("Sending signal...");
        notify(); // Resume thread - Wakes up one waiting thread, allowing it to resume execution from where it called wait().If multiple threads are waiting, only one gets notified.
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new Thread(() -> {
            try {
                resource.waitForSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate delay
                resource.sendSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
} */

/* 
  
Output:
Waiting...
Sending signal...
Resumed!

1️. "Waiting..." (Thread 1 starts and waits).
2️. 2-second delay (Thread 2 is sleeping).
3️. "Sending signal..." (Thread 2 calls notify()).
4️. "Resumed!" (Thread 1 wakes up and continues).

sleep() vs wait() - sleep() just pauses a thread but does not release the lock, whereas wait() releases the lock and allows another thread to proceed.
 
What Happens If We Remove synchronized?
If synchronized is removed, wait() and notify() will throw an IllegalMonitorStateException because they must be called inside a synchronized block or method.
 
 */


// wait() - Making a Thread Wait

/*class SharedResource {
    synchronized void waitForSignal() throws InterruptedException {
        System.out.println("Waiting...");
        wait(); // Pause thread
        System.out.println("Resumed!");
    }

    synchronized void sendSignal() {
        System.out.println("Sending signal...");
        notify(); // Resume one thread
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new Thread(() -> {
            try {
                resource.waitForSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulating delay
                resource.sendSignal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}*/

/*
Waiting...
Sending signal...
Resumed!

✅ One thread waits until another thread signals it.
 */

// notify() - Resumes One Waiting Thread - Used when only one thread needs to be resumed.
/*class TaxiStand {
    synchronized void waitForTaxi() throws InterruptedException {
        System.out.println("Waiting for a taxi...");
        wait(); // Passenger waits
        System.out.println("Got a taxi!");
    }

    synchronized void callTaxi() {
        System.out.println("A taxi has arrived!");
        notify(); // Wake up one passenger
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        TaxiStand stand = new TaxiStand();

        new Thread(() -> {
            try {
                stand.waitForTaxi();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(3000); // Delay
                stand.callTaxi();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}*/

// notifyAll() - Resumes All Waiting Threads - Wakes up all threads that are waiting on wait().

/*class BusStop {
    synchronized void waitForBus() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is waiting for the bus...");
        wait(); // Passengers wait
        System.out.println(Thread.currentThread().getName() + " got on the bus!");
    }

    synchronized void busArrives() {
        System.out.println("The bus has arrived!");
        notifyAll(); // Wake up all waiting passengers
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        BusStop stop = new BusStop();

        new Thread(() -> {
            try {
                stop.waitForBus();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Passenger 1").start();

        new Thread(() -> {
            try {
                stop.waitForBus();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Passenger 2").start();

        new Thread(() -> {
            try {
                Thread.sleep(5000); // Simulate delay
                stop.busArrives();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
} */

/*

Passenger 1 is waiting for the bus...
Passenger 2 is waiting for the bus...
The bus has arrived!
Passenger 1 got on the bus!
Passenger 2 got on the bus!
 
*/

// join() - Wait for a Thread to Complete - Makes the main thread wait until a child thread finishes execution.

/*class Passenger extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " boarded the train!");
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) throws InterruptedException {
        Passenger p1 = new Passenger();
        Passenger p2 = new Passenger();

        p1.start();
        p1.join(); // Wait for p1 to finish

        p2.start();
        p2.join(); // Wait for p2 to finish

        System.out.println("Train departs!");
    }
}*/

/*
Thread-0 boarded the train!
Thread-1 boarded the train!
Train departs!

✅ Train departs only after both passengers board.
 
*/

// If join() is removed from code below will be the output:
/*
Train departs!
Thread-0 boarded the train!
Thread-1 boarded the train!
*/

// start() - Start a New Thread - Begins a new thread, executing run() in a separate call stack.  A new thread is created for run().
/*class Car extends Thread {
    public void run() {
        System.out.println("Car is running...");
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Car c = new Car();
        c.start(); // Starts the car
    }
}*/

// run() - Does not start a new thread; just runs the code like a normal method. A person manually pushing a car instead of starting it.
/*class Bike extends Thread {
    public void run() {
        System.out.println("Bike is running...");
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run(); // No new thread, just calls run() like a normal method
    }
}*/

// Overriding a Static Method (Method Hiding)
/*class Parent {
    static void display() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child's static method");
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display(); // Calls Parent's static method

        Child c = new Child();
        c.display(); // Calls Child's static method

        Parent pc = new Child();
        pc.display(); // Calls Parent's static method (Method Hiding, NOT Overriding)
    }
}*/

/* Output:
Parent's static method
Child's static method
Parent's static method
 */

// What If We Remove static? (Actual Overriding)
/*class Parent {
    void display() { // Removed static
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    void display() { // Overriding method
        System.out.println("Child's method");
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display(); // Calls Parent's method

        Child c = new Child();
        c.display(); // Calls Child's method

        Parent pc = new Child();
        pc.display(); // Calls Child's method (Overriding applies)
    }
} */

/*
Parent's method
Child's method
Child's method
 */


// Comparable (Default Sorting - compareTo())
/*import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementing Comparable to sort by ID
    public int compareTo(Employee other) {
        return this.id - other.id; // Ascending order
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(2, "Charlie"));

        System.out.println("Before Sorting: " + employees);
        Collections.sort(employees); // Uses compareTo()
        System.out.println("After Sorting by ID: " + employees);
    }
} */

// Before Sorting: [Employee{id=3, name='Alice'}, Employee{id=1, name='Bob'}, Employee{id=2, name='Charlie'}]
// After Sorting by ID: [Employee{id=1, name='Bob'}, Employee{id=2, name='Charlie'}, Employee{id=3, name='Alice'}]


// Comparator (Custom Sorting - compare())

/*import java.util.*;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

// Custom Comparator to sort by Name
class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name); // Ascending order
    }
}

public class Mphasis_Interview {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(2, "Charlie"));

        System.out.println("Before Sorting: " + employees);
        Collections.sort(employees, new NameComparator()); // Uses Comparator
        System.out.println("After Sorting by Name: " + employees);
    }
} */

//  Using Anonymous Class (Inline Comparator) - Instead of creating a separate Comparator class, we can use an anonymous class:
/*Collections.sort(employees, new Comparator<Employee>() {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}); */

// Using Lambda Expression (Comparator in One Line)
// Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));


//Abstract class Vehicle

/*abstract class Vehicle {
 int price = 1000; // Instance variable

 // Abstract method (Syntax Error fixed)
 abstract void vehiclePrice();
}

//Bike class extending Vehicle
class Bike extends Vehicle {
 int price = 500; // Instance variable in Bike

 @Override
 void vehiclePrice() {
     System.out.println("Price of bike is " + price);
 }
}

//Main class
public class Mphasis_Interview {
 public static void main(String[] args) {
     Vehicle vehicle = new Bike(); // Upcasting (Vehicle reference, Bike object)

     vehicle.vehiclePrice();       // ---------> Price of bike is 500
     System.out.println(vehicle.price);  // ---------> 1000
     vehicle.price = 100;
     System.out.println(vehicle.price);  // ---------> 100
 }
}*/





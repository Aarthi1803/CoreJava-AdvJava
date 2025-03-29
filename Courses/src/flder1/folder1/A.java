package flder1.folder1;
//import flder1.folder2.B; //since class B is in default access modifier it cannot be accessed in different package
import flder1.folder2.C;

public class A { //different package non-subclass

	public static void main(String[] args) {
//		B obj1=new B(); //since class B is in default access modifier it cannot be accessed in different package
		C obj =new C(); //since class C is in public access modifier it can be accessed anywhere in any package
// 	System.out.println("in A def show: " + obj.def); //since def is in default access modifier it cannot be accessed in different package but can be accessed in same package
// 	System.out.println("in A prot show: " + obj.prot); //since prot is in protected access modifier it cannot be accessed in different package but can be accessed in same package
	System.out.println("in A pub show: " + obj.pub); //since pub is in public access modifier it can be accessed anywhere in any package
//	System.out.println("in A pvt show: " + obj.pvt); //since pvt is in private access modifier it can be accessed only in same class. 
	//Even if class is in same package, private access modifier won't work with different class.
	System.out.println("in A pvt show: " + obj.getPvt()); //after using encapsulation of getters and setters for private access modifier we can access in different class different package
		Child ch =new Child();
//		 ch.a; // since pvt is in private access modifier it can be accessed only in same class. 
			//Even if class is in same package, private access modifier won't work with different class.

	}

}

class Child extends C{ //different package subclass
    private int a=9;
	public void natureProtected(){
    		System.out.println(prot); //since prot is in protected access modifier it cannot be accessed in different package but can be accessed in same package.
    		//As Child extends C it inherits class C properties. So using inheritance we can use protected access modifier.
	}
}
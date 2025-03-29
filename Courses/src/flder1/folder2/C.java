package flder1.folder2;

public class C {
	int def=5;
	protected int prot=6;
	public int pub=7;
	private int pvt;
	public int getPvt() {
		return pvt;
	}
	public void setPvt(int pvt) {
		this.pvt = pvt;
	}
}

class E { //same package non-subclass
	B obj = new B();
	void show() {
		System.out.println("in D show: " + obj.a); //since class B is in default access modifier it cannot be accessed in different package 
		// but can be accessed in same package
	}
}

class F{ //same package non-subclass
	C obj1 = new C();
	void show1() {
		System.out.println("in F def show: " + obj1.def); //since def is in default access modifier it cannot be accessed in different package 
		// but can be accessed in same package
		System.out.println("in F prot show: " + obj1.prot); //since prot is in protected access modifier it can be accessed in same package
		//it is only visible in same package or visible in other package if  class is subclass of that class.
		//protected is visible to inherited class of different package also.
		System.out.println("in F pub show: " + obj1.pub); //since pub is in public access modifier it can be accessed anywhere in any package
		//System.out.println("in F pvt show: " + obj1.pvt); //since pvt is in private access modifier it can be accessed only in same class. 
		//Even if class is in same package, private access modifier won't work with different class.
		System.out.println("in F pvt show: " + obj1.getPvt()); //after using encapsulation of getters and setters for private access modifier we can access in different class same package
	}
}

class G extends C{ //same package subclass
	C obj2 = new C();
	void show2() {
		System.out.println("in G def show: " + obj2.def); // for default access modifier same package subclass works
		System.out.println("in G prot show: " + obj2.prot); // for protected access modifier same package subclass works
		System.out.println("in G pvt show: " + obj2.getPvt()); //after using encapsulation of getters and setters for private access modifier we can access in different class same package
	}
}
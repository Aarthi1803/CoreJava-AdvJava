package flder1.folder2;

class B {
 int a = 5;
}

class D { //same package non-subclass
	B obj = new B();
	void show() {
		System.out.println("in D show: " + obj.a); //since class B is in default access modifier it cannot be accessed in different package 
		// but can be accessed in same package
	}
}
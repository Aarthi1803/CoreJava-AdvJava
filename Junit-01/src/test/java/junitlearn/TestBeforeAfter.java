package junitlearn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // This annotation will create object only once in a class and not create object for every test case.
// @TestInstance(TestInstance.Lifecycle.PER_METHOD) // Default Behaviour. No need to mention it. By default this gets called and creates object for every test case.
class TestBeforeAfter {
	
	// @BeforeEach - annotation used in JUnit5 Jupiter
	// @Before - annotation used in JUnit4
	// @AfterEach - annotation used in JUnit5 Jupiter
	// @After -  annotation used in JUnit4
	// @BeforeClass - annotation used in JUnit4
	// @BeforeAll - annotation used in JUnit5 Jupiter
	// @AfterClass - annotation used in JUnit4
	// @AfterAll - annotation used in JUnit5 Jupiter
	// @TestInstance(TestInstance.Lifecycle.PER_CLASS) - creates object only once for all test cases.
	// @TestInstance(TestInstance.Lifecycle.PER_METHOD) - creates onject for all test cases.
	
	TestBeforeAfter(){
		System.out.println("Test object is created before test method");
	}
	
	@BeforeAll // Executed only once before all test case 
	void beforeAll() { 
		System.out.println("Before all test cases");
	}
	
	@AfterAll // Executed only once after all test case 
	void afterAll() { 
		System.out.println("After all test cases");
	}

	
//	@BeforeAll // Executed only once before all test case 
//	static void beforeAll() { // use static keyword as @BeforeAll will give runtime error - org.junit.platform.commons.JUnitException: @BeforeAll method 'void junitlearn.TestBeforeAfter.beforeAll()' must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
//		System.out.println("Before all test cases");
//	}
//	
//	@AfterAll // Executed only once after all test case 
//	static void afterAll() { // use static keyword as @AfterAll will give runtime error - org.junit.platform.commons.JUnitException: @BeforeAll method 'void junitlearn.TestBeforeAfter.beforeAll()' must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
//		System.out.println("After all test cases");
//	}

	
	
	Shapes shape;
	@BeforeEach // Executes this method before every test case
	void init() { // not mandatory to have init method name. It can be any method name. 
		shape = new Shapes();
		System.out.println("Before each test case");
	}
	
	@Test
	void testcomputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
		System.out.println("Actual test case running...");
	}
	
	@Test
	void testcomputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test case running...");
	}
	
	@AfterEach // Executes this method after every test case
	void destroy() {
		System.out.println("After each test case clean up");
	}

}


// Output for @TestInstance(TestInstance.Lifecycle.PER_METHOD) - Default Behaviour.
/*
Before all test cases
Test object is created before test method
Before each test case
Actual test case running...
After each test case clean up
Test object is created before test method
Before each test case
Actual test case running...
After each test case clean up
After all test cases
 */

// Output for @TestInstance(TestInstance.Lifecycle.PER_CLASS)
/*
Test object is created before test method
Before all test cases
Before each test case
Actual test case running...
After each test case clean up
Before each test case
Actual test case running...
After each test case clean up
After all test cases
 */

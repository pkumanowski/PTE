package pl.edu.pw.ii.pte.junit.executionOrder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AfterBeforeTest {

	@BeforeClass
	public static void setupClass() {
		System.out.println("@BeforeClass setUpClass");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("@AfterClass tearDownClass");
	}

	@Before
	public void setUp() {
		System.out.println("@Before setUp");
	}

	@After
	public void tearDown() {
		System.out.println("@After tearDown");
		System.out.println();
	}

	@Test
	public void test1() {
		System.out.println("@Test test1()");
		System.out.println(new Exception().getStackTrace()[0].getMethodName());
	}

	@Test
	public void test2() {
		System.out.println("@Test test2()");
		System.out.println(new Exception().getStackTrace()[0].getMethodName());
	}
}

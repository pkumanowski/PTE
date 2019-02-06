package pl.edu.pw.ii.pte.junit.executionOrder;

import org.junit.Test;
import org.junit.runners.MethodSorters;

@org.junit.FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestMethodOrder {

	@Test
	public void testC() {
		System.out.println("trzy");
	}

	@Test
	public void testA() {
		System.out.println("jeden");
	}

	@Test
	public void testB() {
		System.out.println("dwa");
	}
}

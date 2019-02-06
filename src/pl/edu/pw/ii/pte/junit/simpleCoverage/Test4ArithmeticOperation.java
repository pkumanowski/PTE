package pl.edu.pw.ii.pte.junit.simpleCoverage;

import org.junit.Assert;
import org.junit.Test;

public class Test4ArithmeticOperation {

	@Test
	public void multiply_zero() {
		ArithmeticOperation a = new ArithmeticOperation();
		Assert.assertEquals(0 * 0, a.multiply(0, 0));
	}

	@Test
	public void multiply_three() {
		ArithmeticOperation a = new ArithmeticOperation();
		Assert.assertEquals(3 * 3, a.multiply(3, 3));
	}

	@Test
	public void multiplyCorrect_zero() {
		ArithmeticOperation a = new ArithmeticOperation();
		Assert.assertEquals(0 * 0, a.multiplyCorrect(0, 0));
	}

	@Test
	public void multiplyCorrect_three() {
		ArithmeticOperation a = new ArithmeticOperation();
		Assert.assertEquals(3 * 3, a.multiplyCorrect(3, 3));
	}

}

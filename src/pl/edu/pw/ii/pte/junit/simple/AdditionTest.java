package pl.edu.pw.ii.pte.junit.simple;

import org.junit.Test;
import org.junit.Assert;

public class AdditionTest {
	private int x = 2;
	private int y = 2;

	@Test
	public void addition() {
		int z = x + y;
		Assert.assertEquals(4, z);
	}

}

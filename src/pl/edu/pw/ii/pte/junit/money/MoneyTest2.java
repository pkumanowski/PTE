package pl.edu.pw.ii.pte.junit.money;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest2 {
	private Money m12CHF;
	private Money m14CHF;

	@Before
	public void setUp() throws Exception {
		m12CHF = new Money(12, "CHF");
		m14CHF = new Money(14, "CHF");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimpleAdd2() {
		Money expected = new Money(26, "CHF");
		Money result = m12CHF.add(m14CHF); //
		assertTrue(expected.equals(result)); //
	}

	@Test
	public void testEquals2() {
		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new Money(12, "CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
	}

}

package pl.edu.pw.ii.pte.junit.money;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

	Currency PLN, USD, EUR;
	Money PLN100, PLN200, PLN0, USD10, EUR200, EUR10;

	@Before
	public void setUP() throws Exception {
		PLN = new Currency("PLN", 0.16);
		USD = new Currency("USD", 0.22);
		EUR = new Currency("EUR", 1.4);

		PLN100 = new Money(1000, PLN);
		PLN200 = new Money(2000, PLN);
		USD10 = new Money(1000, USD);
		EUR200 = new Money(2000, EUR);
		EUR10 = new Money(1000, EUR);
		PLN0 = new Money(0, PLN);
	}

	@Test
	public void testGetAmount() {

		assertEquals("Amounts should be equal", (Integer) 1000, PLN100.getAmount());
		assertEquals("Amounts should be equal", (Integer) 1000, USD10.getAmount());
		assertEquals("Amounts should be equal", (Integer) 2000, EUR200.getAmount());

	}

	@Test
	public void testGetCurrency() {
		assertEquals(PLN100.getCurrency(), PLN);
		assertEquals(EUR200.getCurrency(), EUR);
		// EUR != USD
		assertNotEquals(EUR200.getCurrency(), USD);
	}

	@Test
	public void testToString() {
		assertEquals(EUR200.toString(), "2000 EUR");
		assertEquals(PLN100.toString(), "1000 PLN");
	}

	@Test
	public void testGlobalValue() {
		assertEquals(EUR10.universalValue(), (Integer) 1400);
		assertEquals(EUR200.universalValue(), (Integer) 2800);
	}

	@Test
	public void testEqualsMoney() {
		assertEquals(PLN200, new Money(2000, PLN));
	}

	@Test
	public void testAdd() {
		// plus
		assertEquals(PLN0.add(new Money(100, PLN)), new Money(100, PLN));
	}

	@Test
	public void testSub() {
		// subtraction
		assertEquals(PLN200.sub(new Money(2000, PLN)), new Money(0, PLN));
	}

	@Test
	public void testMultiply(){
		assertEquals(PLN200.multiply(new Money(200, PLN)), new Money(64000, PLN));
	}


	@Test
	public void testIsZero() {
		// Logic - it's true value
		assertTrue(PLN0.isZero());
	}

	@Test
	public void testCompareTo() {
		// SEK100 != EUR10
		assertNotEquals(USD10, EUR10);
		assertEquals(PLN200, PLN200);
	}

}
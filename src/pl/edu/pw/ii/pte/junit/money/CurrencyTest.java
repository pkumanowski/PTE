package pl.edu.pw.ii.pte.junit.money;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class CurrencyTest {
        Currency PLN, USD, EUR;

        @Before
        public void setUp() throws Exception {
            /* Setup currencies with exchange rates */
            PLN = new Currency("PLN", 0.15);
            USD = new Currency("USD", 0.20);
            EUR = new Currency("EUR", 1.5);
        }

        @Test
        public void testGetName() {
            // code of the currency( expected value) = objCurrency.getName();
            assertEquals("Names should be equal", "PLN", PLN.getName());
            assertEquals("Names should be equal", "USD", USD.getName());
            assertEquals("Names should be equal", "EUR", EUR.getName());
        }

        @Test
        public void testGetRate() {
            // check value
            assertEquals("Rates should be equal", 0.15, PLN.getRate(), 0);
            assertEquals("Rates should be equal", 0.20, USD.getRate(), 0);
            assertEquals("Rates should be equal", 1.5, EUR.getRate(), 0);
        }

        @Test
        public void testSetRate() {

            // set rate for pln, usd, eur - 0.09
            PLN.setRate(0.09);
            USD.setRate(0.09);
            EUR.setRate(0.09);

            // Check value for every of 3 currencies
            assertEquals("Rates should be equal", 0.09, PLN.getRate(), 0);
            assertEquals("Rates should be equal", 0.09, USD.getRate(), 0);
            assertEquals("Rates should be equal", 0.09, EUR.getRate(), 0);
        }

        @Test
        public void testGlobalValue() {
            // test global value
            assertEquals("Global values should be equal", (long) 15, (long) PLN.universalValue(100));
            assertEquals("Global values should be equal", (long) 20, (long) USD.universalValue(100));
            assertEquals("Global values should be equal", (long) 150, (long) EUR.universalValue(100));
        }

        @Test
        public void testValueInThisCurrency() {
            // test value currency
            assertEquals("Values should be equal", (long) 1000, (long) PLN.valueInThisCurrency(100, EUR));
            assertEquals("Values should be equal", (long) 750, (long) USD.valueInThisCurrency(100, EUR));
            assertEquals("Values should be equal", (long) 13, (long) EUR.valueInThisCurrency(100, USD));
        }
}

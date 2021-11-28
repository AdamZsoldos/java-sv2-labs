package initializer.creditcard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testCharge() {
        CreditCard creditCard = new CreditCard(10000);
        assertTrue(creditCard.charge(200));
        assertEquals(9800, creditCard.getBalance());
        assertTrue(creditCard.charge(10, Currency.EUR));
        assertEquals(6106, creditCard.getBalance());
        assertTrue(creditCard.charge(14, Currency.GBP));
        assertEquals(16, creditCard.getBalance());
        assertFalse(creditCard.charge(17));
        assertTrue(creditCard.charge(16));
        assertEquals(0, creditCard.getBalance());
    }
}

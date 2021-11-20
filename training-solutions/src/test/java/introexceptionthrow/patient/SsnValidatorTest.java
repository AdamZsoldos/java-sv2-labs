package introexceptionthrow.patient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SsnValidatorTest {

    String validSsn = "333333330";

    @Test
    void testValidate() {
        assertTrue(SsnValidator.isValid("333333330"));
        assertTrue(SsnValidator.isValid("373737372"));
    }

    @Test
    void testValidateTooShort() {
        assertFalse(SsnValidator.isValid(""));
        assertFalse(SsnValidator.isValid("00000000"));
    }

    @Test
    void testValidateWrongSum() {
        assertFalse(SsnValidator.isValid("333333331"));
        assertFalse(SsnValidator.isValid("333333339"));
    }
}

package enumabstract.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void testCanDelete() {
        assertTrue(OrderState.NEW.canDelete());
        assertTrue(OrderState.CONFIRMED.canDelete());
        assertTrue(OrderState.PREPARED.canDelete());
        assertFalse(OrderState.ONBOARD.canDelete());
        assertFalse(OrderState.DELIVERED.canDelete());
        assertFalse(OrderState.RETURNED.canDelete());
        assertFalse(OrderState.DELETED.canDelete());
    }
}

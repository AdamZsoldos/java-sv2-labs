package objectclass.bag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    SimpleBag bag = new SimpleBag();

    @BeforeEach
    void setUp() {
        bag.putItem(new Book("J. R. R. Tolkien", "The Hobbit"));
        bag.putItem(new Beer("Dreher", 300));
    }

    @Test
    void testSize() {
        assertEquals(2, bag.size());
        bag.putItem(new Book("Edgar Allen Poe", "The Raven"));
        assertEquals(3, bag.size());
    }

    @Test
    void testBeforeFirst() {
        assertEquals(2, bag.getCursor());
        bag.beforeFirst();
        assertEquals(0, bag.getCursor());
    }

    @Test
    void testHasNext() {
        assertFalse(bag.hasNext());
        bag.beforeFirst();
        assertTrue(bag.hasNext());
        bag.next();
        assertTrue(bag.hasNext());
        bag.next();
        assertFalse(bag.hasNext());
    }

    @Test
    void testNext() {
        bag.beforeFirst();
        assertEquals(new Book("J. R. R. Tolkien", "The Hobbit"), bag.next());
        assertEquals(new Beer("Dreher", 300), bag.next());
    }

    @Test
    void testContains() {
        assertTrue(bag.contains(new Book("J. R. R. Tolkien", "The Hobbit")));
        assertTrue(bag.contains(new Beer("Dreher", 300)));
        assertFalse(bag.contains(new Book("Edgar Allen Poe", "The Raven")));
    }
}

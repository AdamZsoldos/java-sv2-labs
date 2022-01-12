package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {

    NameServer nameServer = new NameServer();

    @BeforeEach
    void setUp() {
        nameServer.addEntry("google.com", "142.250.217.78");
        nameServer.addEntry("duckduckgo.com", "40.89.244.232");
        nameServer.addEntry("facebook.com", "157.240.3.35");
        nameServer.addEntry("youtube.com", "216.58.206.238");
    }

    @Test
    void testAddEntry() {
        assertEquals(4, nameServer.getEntries().size());
        assertNotNull(nameServer.getEntries().get(0));
        assertNotNull(nameServer.getEntries().get(1));
        assertNotNull(nameServer.getEntries().get(2));
        assertNotNull(nameServer.getEntries().get(3));
    }

    @Test
    void testAddDuplicateEntry() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> nameServer.addEntry("google.com", "142.250.217.78_"));
        assertEquals("Already exists", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> nameServer.addEntry("google.com_", "142.250.217.78"));
        assertEquals("Already exists", e.getMessage());
    }

    @Test
    void testRemoveEntryByName() {
        nameServer.removeEntryByName("duckduckgo.com");
        assertEquals(3, nameServer.getEntries().size());
    }

    @Test
    void testRemoveEntryByIp() {
        nameServer.removeEntryByIp("40.89.244.232");
        assertEquals(3, nameServer.getEntries().size());
    }

    @Test
    void testGetIpByName() {
        assertEquals("40.89.244.232", nameServer.getIpByName("duckduckgo.com"));
    }

    @Test
    void testGetIpByNonexistentName() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> nameServer.getIpByName("google.com_"));
        assertEquals("Entry not found", e.getMessage());
    }

    @Test
    void testGetNameByIp() {
        assertEquals("duckduckgo.com", nameServer.getNameByIp("40.89.244.232"));
    }

    @Test
    void testGetNameByNonexistentIp() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> nameServer.getNameByIp("142.250.217.78_"));
        assertEquals("Entry not found", e.getMessage());
    }
}

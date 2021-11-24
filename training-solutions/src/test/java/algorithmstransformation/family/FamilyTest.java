package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    @Test
    void testGetMemberAgeValuesByGivenName() {
        Family family = new Family();
        family.addMember(new FamilyMember("John Doe", 45));
        family.addMember(new FamilyMember("Jill Doe", 55));
        family.addMember(new FamilyMember("John Doe Jr.", 25));
        family.addMember(new FamilyMember("Jack Doe", 65));
        assertEquals(Arrays.asList(45, 25), family.getMemberAgeValuesByGivenName("John"));
    }
}

package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private final List<FamilyMember> members = new ArrayList<>();

    public List<FamilyMember> getMembers() {
        return members;
    }

    public void addMember(FamilyMember familyMember) {
        members.add(familyMember);
    }

    public List<Integer> getMemberAgeValuesByGivenName(String givenName) {
        List<Integer> ageValues = new ArrayList<>();
        for (FamilyMember member : members) {
            if (member.getName().startsWith(givenName + ' ')) {
                ageValues.add(member.getAge());
            }
        }
        return ageValues;
    }
}

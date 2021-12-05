package inheritanceconstructor.classroom;

public class Course {

    private final int numParticipants;
    private final Facility facilityRequirement;

    public Course(int numParticipants, Facility facilityRequirement) {
        this.numParticipants = numParticipants;
        this.facilityRequirement = facilityRequirement;
    }

    public int getNumParticipants() {
        return numParticipants;
    }

    public Facility getFacilityRequirement() {
        return facilityRequirement;
    }
}

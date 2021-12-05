package inheritanceconstructor.classroom;

public class ClassRoom extends Room {

    private final Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }

    public boolean isSuitable(Course course) {
        return getCapacity() >= course.getNumParticipants() && facility == course.getFacilityRequirement();
    }
}

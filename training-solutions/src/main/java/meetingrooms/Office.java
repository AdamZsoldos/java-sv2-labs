package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private final List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        List<String> names = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            names.add(meetingRoom.getName());
        }
        System.out.println("\n" + names);
    }

    public void printNamesReverse() {
        List<String> names = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            names.add(meetingRooms.get(i).getName());
        }
        System.out.println("\n" + names);
    }

    public void printEvenNames() {
        List<String> names = new ArrayList<>();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            names.add(meetingRooms.get(i).getName());
        }
        System.out.println("\n" + names);
    }

    public void printAreas() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            System.out.print("\n" + (i + 1) + ". ");
            System.out.println(meetingRooms.get(i));
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().equalsIgnoreCase(name)) {
                System.out.print("\n" + (i + 1) + ". ");
                System.out.println(meetingRooms.get(i));
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.print("\n" + (i + 1) + ". ");
                System.out.println(meetingRooms.get(i));
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getArea() >= area) {
                System.out.print("\n" + (i + 1) + ". ");
                System.out.println(meetingRooms.get(i));
            }
        }
    }
}

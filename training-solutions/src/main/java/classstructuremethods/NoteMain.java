package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();

        note.setName("Adam");
        note.setTopic("Hello!");
        note.setText("How's it going?");

        System.out.println("New text message:");
        System.out.println(note.getNoteText());
    }
}

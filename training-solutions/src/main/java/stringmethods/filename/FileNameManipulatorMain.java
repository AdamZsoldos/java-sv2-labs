package stringmethods.filename;

public class FileNameManipulatorMain {
    public static void main(String[] args) {

        String fileName = "  Horses_Standing_On_Field.JPG   \n";
        System.out.println(fileName);

        System.out.println(FileNameManipulator.getFileName(fileName));
        System.out.println(FileNameManipulator.getExtension(fileName));
        System.out.println(FileNameManipulator.getLastCharacter(fileName));
        System.out.println(FileNameManipulator.getLastCharacterOfFileName(fileName));
        System.out.println(FileNameManipulator.matchExtension(fileName, "jpg"));
        System.out.println(FileNameManipulator.matchExtension(fileName, "jpeg"));
        System.out.println(FileNameManipulator.matchFileNames(fileName, "horses_standing_on_field.png"));
        System.out.println(FileNameManipulator.matchFileNames(fileName, "horses.png"));
        System.out.println(FileNameManipulator.extensionToLowercase(fileName));
        System.out.println(FileNameManipulator.replaceInFilename(fileName, "Standing", "Dancing"));
    }
}

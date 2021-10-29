package stringmethods.filename;

public class FileNameManipulator {
    private FileNameManipulator() {
        throw new IllegalStateException("Utility class");
    }

    public static String getFileName(String str) {
        str = str.trim();
        int i = str.lastIndexOf('.');
        if (i < 1 || i >= str.length() - 1) return str;
        return str.substring(0, i);
    }

    public static String getExtension(String str) {
        str = str.trim();
        int i = str.lastIndexOf('.');
        if (i < 1 || i >= str.length() - 1) return "";
        return str.substring(i + 1);
    }

    public static char getLastCharacter(String str) {
        str = str.trim();
        if (str.length() < 1) return 0;
        return str.charAt(str.length() - 1);
    }

    public static char getLastCharacterOfFileName(String str) {
        str = getFileName(str);
        if (str.length() < 1) return 0;
        return str.charAt(str.length() - 1);
    }

    public static boolean matchExtension(String fileName, String ext) {
        return getExtension(fileName).equalsIgnoreCase(ext.trim());
    }

    public static boolean matchFileNames(String fileName1, String fileName2) {
        return getFileName(fileName1).equalsIgnoreCase(getFileName(fileName2));
    }

    public static String extensionToLowercase(String str) {
        String ext = getExtension(str);
        if (ext.length() == 0) return str;
        return getFileName(str) + '.' + ext.toLowerCase();
    }

    public static String replaceInFilename(String str, String target, String replacement) {
        String ext = getExtension(str);
        String fileName = getFileName(str).replace(target, replacement);
        if (ext.length() == 0) return fileName;
        return fileName + '.' + ext;
    }
}

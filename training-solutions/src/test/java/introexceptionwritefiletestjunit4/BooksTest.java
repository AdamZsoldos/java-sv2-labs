package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BooksTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testWriteFile() throws IOException {
        Path path = tempFolder.newFile("books.txt").toPath();
        Books.writeFile(path, Books.getLinesReadable(Paths.get("src/test/resources/books.txt")));
        assertEquals(Arrays.asList(
                "Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai"
        ), Files.readAllLines(path));
    }
}

package introexceptionwritefiletestjunit5;

import introexceptionwritefiletestjunit4.Books;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempDir;

    @Test
    void testWriteFile() throws IOException {
        Path path = tempDir.toPath().resolve("books.txt");
        introexceptionwritefiletestjunit4.Books.writeFile(path, Books.getLinesReadable(Paths.get("src/test/resources/books.txt")));
        assertEquals(Arrays.asList(
                "Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai"
        ), Files.readAllLines(path));
    }
}

import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    // @Test
    // public void testGetLinks() throws IOException {
    //     ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("test-file1.md")));
    //     assertEquals(List.of("https://something.com", "some-page.html"), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md")));
    //     assertEquals(List.of("https://something.com", "some-page.html"), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md")));
    //     assertEquals(List.of(), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md")));
    //     assertEquals(List.of(), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md")));
    //     assertEquals(List.of(), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md")));
    //     assertEquals(List.of("page.com"), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md")));
    //     assertEquals(List.of(), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md")));
    //     assertEquals(List.of("a link on the first line"), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file9.md")));
    //     assertEquals(List.of("www.name1.com"), links);

    //     links = MarkdownParse.getLinks(Files.readString(Path.of("test-file10.md")));
    //     assertEquals(List.of("(test.com)"), links);
    // }

    @Test
    public void testSnippetOne() throws IOException {
        ArrayList<String> links =
            MarkdownParse.getLinks(Files.readString(Path.of("test-snippet1.md")));
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), links);
    }

    @Test
    public void testSnippetTwo() throws IOException {
        ArrayList<String> links =
            MarkdownParse.getLinks(Files.readString(Path.of("test-snippet2.md")));
        assertEquals(List.of("a.com", "a.com(())", "example.com"), links);
    }

    @Test
    public void testSnippetThree() throws IOException {
        ArrayList<String> links =
            MarkdownParse.getLinks(Files.readString(Path.of("test-snippet3.md")));
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), links);
    }
}

/**
 * Compile: javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
 * Run: java -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
 */
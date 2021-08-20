import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class TestJava {

    public static void main(String[] args) throws IOException {
        Files.writeString(Paths.get("target/test-java-program.txt"), "Hello world");
    }
}

package files;

import static files.FilesHandling.*;

public class TestFiles {
    public static void main(String[] args) {
        var filename = "test.txt";
        // createFile(filename);
        // writeFileAppend(filename, "Hello from Java!");
        // writeFileAppend(filename, "Bye bye!");
        readFile(filename);
    }
}

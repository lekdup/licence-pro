import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) throws IOException {
        TxtFileReader text = new TxtFileReader();
        // System.out.println(text.readProperly());
        text.readProperly();
        text.readReverse();
        text.readPalindrome();
    }
}

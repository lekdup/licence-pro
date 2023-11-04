import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TxtFileReader {
    /*
     * try {
     * File f = new File(
     * "/Users/lekdup/Desktop/licence-pro/cours/JAVA/projet_lecteur_de_fichier/src/fichier.txt"
     * );
     * FileInputStream in = new FileInputStream(f);
     * int i = in.read();
     * while (i != -1) {
     * System.out.println((char) i);
     * i = in.read();
     * }
     * in.close();
     * } catch (Exception e) {
     * e.getStackTrace();
     * }
     */
    public char readProperly() throws IOException {
        try {
            File f = new File("/Users/lekdup/Desktop/licence-pro/cours/JAVA/projet_lecteur_de_fichier/src/fichier.txt");
            FileInputStream in = new FileInputStream(f);
            int i = in.read();
            while (i != -1) {
                System.out.print((char) i);
                i = in.read();
            }
            in.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return 0;
    }

    public void readReverse() throws IOException {
        File file = new File("/Users/lekdup/Desktop/licence-pro/cours/JAVA/projet_lecteur_de_fichier/src/fichier.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            Collections.reverse(lines);

            for (String reversedLine : lines) {
                System.out.println(reversedLine);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void readPalindrome() throws IOException {
        File file = new File("/Users/lekdup/Desktop/licence-pro/cours/JAVA/projet_lecteur_de_fichier/src/fichier.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            String content = new String(data, "UTF-8");

            String reverseContent = new StringBuilder(content).reverse().toString();

            System.out.println(reverseContent);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
}

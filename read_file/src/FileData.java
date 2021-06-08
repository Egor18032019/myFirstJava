import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class FileData {
    private String path_to_file;

    public FileData (String path) {
        path_to_file = path;
    }

    int numStrings() throws IOException {

        FileReader text = new FileReader(path_to_file);
        BufferedReader y = new BufferedReader(text);

        String one;
        int num = 0;

        while ((one = y.readLine()) != null) {
            num++;
        }
        y.close();

        return num;
    }

    public String[] OpenAndRead() throws IOException{
        FileReader x = new FileReader(path_to_file); // читает символы
        BufferedReader varRead = new BufferedReader(x); // читает строки

        int num = numStrings(); // кол-во строк
        String[] lines = new String[num];

        int i;
        for (i = 0; i < num; i++) {
            lines[i] = varRead.readLine();
        }

        varRead.close();
        return lines;
    }
}

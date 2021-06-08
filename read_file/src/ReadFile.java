import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
// *Мы говорим Java, что метод main вызовет ошибку IOException, и что ее необходимо устранить
        String new_path = "C:/Users/Teacher/IdeaProjects/myFirstJava/read_file/test.txt";
        try {
            FileData new_file = new FileData(new_path);
            String[] aryStrings = new_file.OpenAndRead();

            int i;
            for (i = 0; i < aryStrings.length; i++) {
                System.out.println(aryStrings[i]);
            }
        }
        catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }
}
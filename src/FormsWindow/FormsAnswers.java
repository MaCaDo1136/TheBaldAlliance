package FormsWindow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class FormsAnswers {
    private String id;
    private String answer1;
    private String answer2;
    private String answer3;

    public FormsAnswers(String id, String answer1, String answer2, String answer3) {
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public String getId() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\Mario\\TheBaldAlliance\\src\\UserStuff\\UserLogFile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                String logFileID = data[0];
                this.id = logFileID;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: Reading from file failed." + e.getMessage());
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

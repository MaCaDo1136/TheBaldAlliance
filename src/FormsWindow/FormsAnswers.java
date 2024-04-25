package FormsWindow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class FormsAnswers {
    private String id;
    private String teamNum;
    private String matchNum;
    private String auto_Speaker;
    private String auto_Amp;
    private String teleOp_Speaker;
    private String teleOp_Amp;
    private boolean trap;
    private boolean climb;
    private String personalComments;

    public FormsAnswers(String id, String teamNum, String matchNum, String auto_Speaker, String auto_Amp,
            String teleOp_Speaker, String teleOp_Amp, boolean trap, boolean climb, String personalComments) {
        this.teamNum = teamNum;
        this.matchNum = matchNum;
        this.auto_Speaker = auto_Speaker;
        this.auto_Amp = auto_Amp;
        this.teleOp_Speaker = teleOp_Speaker;
        this.teleOp_Amp = teleOp_Amp;
        this.trap = trap;
        this.climb = climb;
        this.personalComments = personalComments;
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

    public String getTeamNum() {
        return teamNum;
    }

    public String getMatchNum() {
        return matchNum;
    }

    public String getAuto_Speaker() {
        return auto_Speaker;
    }

    public String getAuto_Amp() {
        return auto_Amp;
    }

    public String getTeleOp_Speaker() {
        return teleOp_Speaker;
    }

    public String getTeleOp_Amp() {
        return teleOp_Amp;
    }

    public String getTrap() {
        if (trap) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String getClimb() {
        if (climb) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String getPersonalComments() {
        return personalComments;
    }
}

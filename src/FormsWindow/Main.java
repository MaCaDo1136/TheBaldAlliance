package FormsWindow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FormsAnswers form = new FormsAnswers(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                false,
                false,
                null);

        String idString = form.getId();

        form.setId(idString);

        ArrayList<FormsAnswers> answer = new ArrayList<>();
        answer.add(form);

        addAnswer(answer);
    }

    public static void addAnswer(ArrayList<FormsAnswers> answer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\Mario\\TheBaldAlliance\\src\\FirstWindow\\Database\\Db_Users.txt", true));
            for (FormsAnswers form : answer) {
                writer.write(
                        form.getId() + "|" + form.getTeamNum() + "|" + form.getMatchNum() + "|" + form.getAuto_Speaker()
                                + "|" + form.getAuto_Amp() + "|" + form.getTeleOp_Speaker() + "|" + form.getTeleOp_Amp()
                                + "|" + form.getTrap() + "|" + form.getClimb() + "|" + form.getPersonalComments());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Writing to file failed." + e.getMessage());
        }
    }

}

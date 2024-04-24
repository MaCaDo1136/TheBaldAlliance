package FirstWindow.LogIn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import UserStuff.User;

public class Main {
    public static void main(String[] args) {
        logInVerifier("Jose", "J3456");
    }

    public static boolean logInVerifier(String username, String password) {
        boolean UserValidation = false;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\Mario\\TheBaldAlliance\\src\\FirstWindow\\Database\\Db_Users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                String dB_username = data[0];
                String dB_password = data[1];
                String dB_id = data[2];

                if (username.equals(dB_username) && password.equals(dB_password)) {
                    System.out.println("Log in successful.");

                    User user = new User(dB_username, dB_password, Integer.parseInt(dB_id));

                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(
                                "C:\\Users\\Mario\\TheBaldAlliance\\src\\UserStuff\\UserLogFile.txt", true));
                        writer.write(String.valueOf(user.getId()));
                        writer.newLine();
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Error: Writing to file failed." + e.getMessage());
                    }
                    UserValidation = true;
                    reader.close();
                    return UserValidation;

                }

            }
            reader.close();
            if (!UserValidation) {
                System.out.println("Log in failed.");
                return UserValidation;
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return UserValidation;

    }
}

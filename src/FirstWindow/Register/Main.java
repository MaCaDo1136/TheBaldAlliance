package FirstWindow.Register;

import java.util.ArrayList;

import FirstWindow.Register.Methods.UserRegistration;
import UserStuff.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArrayList<UserRegistration> userList = new ArrayList<>();
        userList.add(new UserRegistration("Edu", "12345"));

        addUser(userList);

        logInVerifier("Edu", "12345");
    }

    private static void addUser(ArrayList<UserRegistration> userlist) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\Mario\\TheBaldAlliance\\src\\FirstWindow\\Database\\Db_Users.txt", true));
            for (UserRegistration user : userlist) {
                writer.write(user.getUsername() + "|" + user.getPassword() + "|" + user.getId());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Writing to file failed." + e.getMessage());
        }
    }

    public static void logInVerifier(String username, String password) {
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
                }

            }
            reader.close();
            if (!UserValidation) {
                System.out.println("Log in failed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package FirstWindow.Register;

import java.util.ArrayList;

import FirstWindow.Register.Methods.UserRegistration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        ArrayList<UserRegistration> userList = new ArrayList<>();
        userList.add(new UserRegistration("Albertus", "1234MCD"));

        SaveFile(userList);
    }

    private static void SaveFile(ArrayList<UserRegistration> userlist) {
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
}
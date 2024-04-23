package FirstWindow.Register.Methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserRegistration {
    private String username;
    private String password;
    private String idString;

    public UserRegistration(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getId() {
        String lastLine = "";
        try {
            BufferedReader lector = new BufferedReader(
                    new FileReader("C:\\Users\\Mario\\TheBaldAlliance\\src\\FirstWindow\\Database\\Db_Users.txt"));
            String line;
            while ((line = lector.readLine()) != null) {
                lastLine = line;
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        String[] parts = lastLine.split("\\|");

        int id = Integer.parseInt(parts[2]);
        id += 1;
        String idString = Integer.toString(id);

        return idString;
    }
}

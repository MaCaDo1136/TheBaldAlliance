package FirstWindow.LogIn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        logInVerifier("Rafael", "R789");
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

                if (username.equals(dB_username) && password.equals(dB_password)) {
                    System.out.println("Log in successful.");
                    UserValidation = true;
                    
                }

            }
            reader.close();
            if (!UserValidation) {
                //System.out.println("Log in failed.");
            	
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
		
    }
}

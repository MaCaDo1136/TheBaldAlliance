package FirstWindow.Methods;

public class UserRegistration {
    private String username;
    private String password;

    public UserRegistration(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static String initUsername(String username) {
        return username;
    }

    public static String initPassword(String password) {
        return password;
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
}

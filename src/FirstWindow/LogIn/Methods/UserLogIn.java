package FirstWindow.LogIn.Methods;

public class UserLogIn {
    private String username;
    private String password;

    public UserLogIn(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}

package pojo;

/**
 * @author shipengfei
 * @data 20-1-8
 */
public class Users {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

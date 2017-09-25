package comp.jsf;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Validate_Login {

    private String username;
    private String password;
    private String output;

    public Validate_Login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String logincheck() {

        if (username.equals("user") && password.equals("password")) {
            output = "successful";
            return output;
        } else{
            output = "Try_again";
            return output;
        }
        
    }
}
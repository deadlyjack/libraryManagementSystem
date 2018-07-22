package server;

/**
 *
 * @author delle
 */
public class Session {
    private String username, name, email, phone;
    private Session(String username, String name, String email, String phone){
        this.username = username;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }    
}

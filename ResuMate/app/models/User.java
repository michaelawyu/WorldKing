package models;

import javax.persistence.*;
import com.avaje.ebean.*;
import com.sun.javafx.beans.IDProperty;

@Entity
public class User extends Model {
    @Id
    public String email;
    public String password;

    public User(String email, String password) {
        this.email=email;
        this.password=password;
    }
    public static Finder<String,User> find = new Finder<String,User>(
            String.class,User.class
    );


}

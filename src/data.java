import javax.swing.*;
import java.sql.*;

public class data extends Login {

    public static String username;
    public static String password;

    data(String username, String password) {
        this.username = username;
        this.password = password;

    }


    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;

    }




}




import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public  class Login implements ActionListener {


    static JFrame frame;
    static JButton button;
    static JPanel panel;
    static JTextField userText;
    static JPasswordField passwordText;
    static JLabel result;
    public static ArrayList<data> userList;

    public static void main(String[] args) {
        Myframe myframe = new Myframe();
        Login login = new Login();

        userList = new ArrayList<>();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                data user = new data(username, password);
                userList.add(user);

                // Print stored user information in the console
                for (data storedUser : userList) {
                    System.out.println("Username: " + storedUser.getUsername());
                    System.out.println("Password: " + storedUser.getPassword());
                }

                // Clear fields
                userText.setText("");
                passwordText.setText("");
            }


        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Myframe extends Login {
    public static   JMenu menu,help,about;
    public static JMenuBar menuBar;
    Myframe() {
//dark mode


// frame customization
        button = new JButton();
        button.setText("Login");
        button.setBounds(140, 80, 80, 25);
        panel = new JPanel();
        //panel.setLayout(null);
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //frame.setSize(400,400);
        frame.setResizable(true);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);






//user text and password feild
        userText = new JTextField(8);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        JLabel username = new JLabel("   username :");
        username.setBounds(10, 20, 80, 25);
        panel.add(username);

        passwordText = new JPasswordField(8);
        panel.add(passwordText);
        passwordText.setBounds(100, 50, 165, 25);
        JLabel password = new JLabel("   password :");
        password.setBounds(10, 50, 80, 25);
        panel.add(password);
        panel.add(button);











        userText.requestFocusInWindow();
// dark theme
        button.addActionListener(new Login());
        UIManager.put("Button.background", button);
        UIManager.put("Button.foreground", button);
        UIManager.put("Label.foreground", userText);
        UIManager.put("Label.foreground", passwordText);


        result = new JLabel();
        result.setBounds(10, 110, 300, 25);
        panel.add(result);


        frame.setVisible(true);
        frame.pack();


    }



    private static void customizeUI() {
        Color backgroundColor = Color.BLACK;
        Color foregroundColor = Color.WHITE;
        Color buttonBackgroundColor = new Color(44, 146, 200);
        Map<Object, Object> uiDefaults = new HashMap<>();
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.ColorUIResource) {
                uiDefaults.put(key, new ColorUIResource(backgroundColor));
            }
        }
    }


}





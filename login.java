import javax.swing.*;

public class login {

    login() {

        JFrame f = new JFrame("Login GUI");
        JLabel l = new JLabel("LOGIN PAGE");
        JLabel l1 = new JLabel("Username:");
        JTextField t = new JTextField();
        JLabel l2 = new JLabel("Password:");
        JPasswordField p = new JPasswordField();
        l.setBounds(200, 30, 100, 40);
        l1.setBounds(100, 100, 100, 30);
        l2.setBounds(100, 140, 100, 30);
        t.setBounds(200, 100, 180, 30);
        p.setBounds(200, 140, 180, 30);
        p.setEchoChar('$');
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(t);
        f.add(p);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new login();
            }
}


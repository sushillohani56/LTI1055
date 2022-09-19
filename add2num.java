import java.awt.*;
import java.awt.event.*;

public class add2num implements ActionListener {

    Frame f;

    TextField t1;
    TextField t2;
    TextField t3;
    Label l;
    Label l1;
    Label l2;
    Label l3;
    Button b;

    add2num() {

        f = new Frame("Addition of two numbers");
        l = new Label("Sushil Lohani-01021402019");
        l1 = new Label("Enter 1st no.");
        l2 = new Label("Enter 2nd no.");
        l3 = new Label("Result");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b = new Button("ADD");
        b.addActionListener(this);
        f.add(l);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b);
        l.setBounds(165, 70, 200, 40);
        l1.setBounds(150,120 , 80, 30);
        l2.setBounds(150, 160, 80, 30);
        l3.setBounds(150, 200, 70, 30);
        b.setBounds(200, 240, 50, 30);
        t1.setBounds(250, 120, 100, 30);
        t2.setBounds(250, 160, 100, 30);
        t3.setBounds(250, 200, 100, 30);
        f.setBackground(Color.ORANGE);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new add2num();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" " + (n1 + n2));
        }
    }
}

package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;
import javax.swing.*;


public class signup extends JFrame {
    JLabel label1;
    Random random = new Random();
    long first4= (random.nextLong() % 9000L) + 1000L; // Generates a random 4-digit number
    String first = "" + Math.abs(first4); // Converts it to a positive string

    signup(){
      super("Application Form");
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel j1 = new JLabel(i3);
        j1.setBounds(25, 10, 100, 100);
        add(j1);

        label1 = new JLabel ("Application form No");
        label1.setBounds(260, 20, 600, 40);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        add(label1);

        getContentPane().setBackground(new Color(222,255,228));
        setSize(700,500);
       setLocation(300,40);
       setVisible(true);
       setLayout(null);

    }


    public static void main(String[] args) {
       new signup();
    }
}


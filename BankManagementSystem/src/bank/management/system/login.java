package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textfield1, textfield2;
    JPasswordField textpass1;

    JButton btn1, btn2, btn3;

    public login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel j1 = new JLabel(i3);
        j1.setBounds(350, 10, 100, 100);
        add(j1);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel jj1 = new JLabel(ii3);
        jj1.setBounds(630, 350, 100, 100);
        add(jj1);

        //Jalabel 
        JLabel label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setBounds(230, 125, 450, 40);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        add(label1);

        JLabel lable2 = new JLabel("Card No :");
        lable2.setForeground(Color.white);
        lable2.setBounds(150, 190, 375, 30);
        lable2.setFont(new Font("Railway", Font.BOLD, 25));
        add(lable2);

        //textfield
        textfield1 = new JTextField(15);
        textfield1.setBounds(350, 193, 200, 30);
        textfield1.setFont(new Font("arial", Font.BOLD, 20));
        add(textfield1);

        JLabel lable3 = new JLabel("Pin : ");
        lable3.setForeground(Color.white);
        lable3.setBounds(150, 250, 375, 30);
        lable3.setFont(new Font("Railway", Font.BOLD, 25));
        add(lable3);

        textpass1 = new JPasswordField(15);
        textpass1.setBounds(350, 250, 200, 30);
        textpass1.setFont(new Font("arial", Font.BOLD, 20));
        add(textpass1);
        //Button
        btn1 = new JButton("Sign In");
        btn1.setFont(new Font("arial", Font.BOLD, 20));
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        btn1.setBounds(260, 350, 130, 30);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("clear");
        btn2.setFont(new Font("arial", Font.BOLD, 20));
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLACK);
        btn2.setBounds(400, 350, 130, 30);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton("sign up");
        btn3.setFont(new Font("arial", Font.BOLD, 20));
        btn3.setForeground(Color.white);
        btn3.setBounds(290, 400, 200, 30);
        btn3.setBackground(Color.BLACK);
        btn3.addActionListener(this);
        add(btn3);

        //Background image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel jjj1 = new JLabel(iii3);
        jjj1.setBounds(0, 0, 850, 480);
        add(jjj1);

        setLayout(null);
        setSize(850, 480);
        setVisible(true);
        setLocation(200, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()== btn1){

            }
            else if(e.getSource()== btn2){
                textfield1.setText("");
                textpass1.setText("");
            }
            else if(e.getSource()==btn3){

            } 

            

        } catch(Exception E){
            E.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        new login();
    }
}

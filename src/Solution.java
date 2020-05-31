import javax.swing.*;
import java.awt.*;

public class Solution {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

    static class MyFrame extends JFrame {

        MyPanel panel = new MyPanel();

        public MyFrame() throws HeadlessException {

            add(panel);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(400,200,600,400);
            setResizable(false);
            setVisible(true);
        }
    }

    static class MyPanel extends JPanel{

        private JLabel name = new JLabel("Name: ");
        private JTextField c_name = new JTextField();
        private JLabel secName = new JLabel("Second Name: ");
        private JTextField c_secName = new JTextField();
        private JLabel age = new JLabel("Age: ");
        private JTextField c_age = new JTextField();
        private JLabel phone = new JLabel("Phone Number: ");
        private JTextField c_phone = new JTextField();
        private JButton sendButton = new JButton("Send");

        public MyPanel() {

            setLayout(new MyManagerLayout()); //setLayout(null) for Neutral Layout

     /*       user.setBounds(20,20,130,15);
            userField.setBounds(150,20,130,15);
            password.setBounds(20,40,130,15);
            passField.setBounds(150,40,130,15);
            sendButton.setBounds(150,70,80,30);*/

            add(name);
            add(c_name);
            add(secName);
            add(c_secName);
            add(age);
            add(c_age);
            add(phone);
            add(c_phone);
            add(sendButton);


        }
    }

    static class MyManagerLayout implements LayoutManager{

        @Override
        public void addLayoutComponent(String s, Component component) {

        }

        @Override
        public void removeLayoutComponent(Component component) {

        }

        @Override
        public Dimension preferredLayoutSize(Container container) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container container) {
            return null;
        }

        @Override
        public void layoutContainer(Container container) {

            int count = 0;
            int c_width = container.getWidth();
            int total = container.getComponentCount();

            int x =c_width/2;
            int y = 20;

            for (int i = 0; i < total; i++) {
                count++;
                Component component = container.getComponent(i);
                component.setBounds(x-100,y,115,15);

                if(count%2==0) {
                    x = c_width/2;
                    y += 30;
                }else x+=115;
            }

        }
    }
}

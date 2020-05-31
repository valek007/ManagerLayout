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

        private JLabel user = new JLabel("User: ");
        private JTextField userField = new JTextField();
        private JLabel password = new JLabel("Password: ");
        private JTextField passField = new JTextField();
        private JButton sendButton = new JButton("Send");

        public MyPanel() {

            setLayout(new MyManagerLayout()); //setLayout(null) for Neutral Layout

     /*       user.setBounds(20,20,130,15);
            userField.setBounds(150,20,130,15);
            password.setBounds(20,40,130,15);
            passField.setBounds(150,40,130,15);
            sendButton.setBounds(150,70,80,30);*/

            add(user);
            add(userField);
            add(password);
            add(passField);
            add(sendButton);


        }
    }

    static class MyManagerLayout implements LayoutManager{

        private int x = 20;
        private int y = 20;

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
            int total = container.getComponentCount();

            for (int i = 0; i < total; i++) {
                count++;
                Component component = container.getComponent(i);
                component.setBounds(x,y,100,15);

                if(count%2==0) {
                    x = 20;
                    y += 40;
                }else x+=100;
            }

        }
    }
}

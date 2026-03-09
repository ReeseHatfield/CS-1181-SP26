import javax.swing.*;
import java.awt.*;

public class Driver {


    // Declare component
    // Set up the component
    // Render component
    public static void main(String[] args){
        JFrame frame = new JFrame();

        JPanel root = new JPanel();


        JTextArea input = new JTextArea();
        root.add(input);

        JLabel helloLabel = new JLabel();
        helloLabel.setText("Hello world");
        root.add(helloLabel);


        JLabel welcomeLabel = new JLabel("Welcome to my first GUI app");
        root.add(welcomeLabel);


        frame.setContentPane(root);

        frame.setSize(500, 500);
        frame.setTitle("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
}
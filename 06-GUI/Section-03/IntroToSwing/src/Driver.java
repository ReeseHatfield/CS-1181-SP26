import javax.swing.*;
import java.awt.*;

public class Driver {
    // Declaration
    // Setup initialization of the component
    // Rendering of the component
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel root = new JPanel();

        JLabel helloLabel = new JLabel();
        helloLabel.setText("Hello world!");
        root.add(helloLabel);

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setText("Welcome to my first GUI");
        root.add(welcomeLabel);

        JTextArea input = new JTextArea(5, 100);
        root.add(input);


        frame.setContentPane(root);
        frame.setSize(500, 500);
        frame.setTitle("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }


    public static void foo(JComponent jc){
        
    }
}
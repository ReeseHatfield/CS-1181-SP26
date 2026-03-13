import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Driver {


    // Declare component
    // Set up the component
    // Render component

    public static void main(String[] args){

        FontAdjuster.adjustFontSize(20);



        JFrame frame = new JFrame();

        JPanel root = new JPanel();


        JTextArea input = new JTextArea(5, 5);
        
        root.add(input);


        JLabel helloLabel = new JLabel();
        helloLabel.setText("Hello world");
        root.add(helloLabel);


        JLabel welcomeLabel = new JLabel("Welcome to my first GUI app");
        root.add(welcomeLabel);


        JColorChooser chooser = new JColorChooser();
        root.add(chooser);


        JButton btn = new JButton("My First JButton");
        // btn.addActionListener(new ButtonPressedAction());
        btn.addActionListener((e) -> {



            
            System.out.println("I was called from a lambda");
            String userInput = input.getText();

            JLabel l = new JLabel("You said: " + userInput);
            root.add(l);

            // root.repaint();
            root.revalidate();

            // closes the jframe
            // frame.dispose();


            // spawns new jframes

            // increase this number to crash your system
            for(int i = 0; i < 10; i ++){
                
                JFrame f = new JFrame();

                JButton backgroundBtn = new JButton();

                Color selected = chooser.getColor();

                backgroundBtn.setBackground(selected);
                f.add(backgroundBtn);
                
                Random rng = new Random();
    
                f.setLocation(rng.nextInt(0, 1000), rng.nextInt(0, 1000));
                f.setSize(250,250);
                f.setVisible(true);
            }


        });

        
        root.add(btn);
        
        
        
        


        frame.setContentPane(root);

        frame.setSize(500, 500);
        frame.setTitle("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Driver {
    // Declaration
    // Setup initialization of the component
    // Rendering of the component

    public static void main(String[] args) {


        FontAdjuster.adjustFontSize(20);

        JFrame frame = new JFrame();

        JPanel root = new JPanel();


        JTextArea input = new JTextArea(5, 5);
        root.add(input);


        JLabel helloLabel = new JLabel();
        helloLabel.setText("Hello world!");
        root.add(helloLabel);

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setText("Welcome to my first GUI");
        root.add(welcomeLabel);

        JButton btn = new JButton("My first btn");
        // btn.addActionListener(new ButtonPressedAction());

        // (e) -> {

        // }

        root.add(btn);
        
        JColorChooser chooser = new JColorChooser();
        root.add(chooser);
        btn.addActionListener((e) -> {
            System.out.println("Hello! I was pressed");

            root.add(new JLabel("Button was pressed!"));

            root.revalidate();

            // frame.pack();

            Random rng = new Random();
            for(int i = 0; i < 10; i ++){
                JFrame f = new JFrame();

                Color chosenColor = chooser.getColor();

                JButton temp = new JButton();
                temp.addActionListener((e2) -> {
                    System.out.println(chosenColor);
                });
                temp.setBackground(chosenColor);

                f.add(temp);

                f.setSize(250,250);
                f.setLocation(rng.nextInt(0,1000), rng.nextInt(0, 1000));
                f.setVisible(true);


            }
            // root.repaint();
        });

        frame.setContentPane(root);
        frame.setSize(500, 500);
        frame.setTitle("My first GUI");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }


    public static void foo(JComponent jc){
        
    }
}
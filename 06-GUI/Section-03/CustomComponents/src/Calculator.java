import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Calculator extends JFrame {
    
    private JPanel root = new JPanel();

    public Calculator(String title){

        super(title);


        // this.root.setLayout(new FlowLayout());
        this.root.setLayout(new BorderLayout());
        // this.root.setLayout(new GridLayout(4, 4));
        // this.root.setLayout(new BoxLayout(this.root, BoxLayout.Y_AXIS));
        // this.root.setLayout(new BoxLayout(this.root, BoxLayout.X_AXIS));

        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.root);
        this.initComponents();

        this.setVisible(true);

    }

    private void initComponents(){

        JTextArea textbox = new JTextArea(2, 5);
        // this.root.add(textbox, BorderLayout.NORTH);

        this.root.add(textbox, BorderLayout.NORTH);

        JButton equals = new JButton("=");
        equals.addActionListener((e) -> {
            try {
                // SwingWorker
                Thread.sleep(5000);
            } catch (InterruptedException ie) {

            }
        });
        this.root.add(equals, BorderLayout.SOUTH);

        this.root.add(new JButton("+"), BorderLayout.EAST);
        this.root.add(new JButton("-"), BorderLayout.WEST);

        // CustomNumberBtn btn0 = new CustomNumberBtn(0);
        // btn0.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });
        // this.root.add(btn0);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(3,3));
        for(int i = 1; i < 10; i ++){
            btnPanel.add(new CustomNumberBtn(i, textbox));
        }
        this.root.add(btnPanel, BorderLayout.CENTER);


        // CustomNumberBtn btn0 = new CustomNumberBtn(0, textbox);
        // this.root.add(btn0, BorderLayout.WEST);

        // CustomNumberBtn btn1 = new CustomNumberBtn(1, textbox);
        // this.root.add(btn1, BorderLayout.CENTER);

        // CustomNumberBtn btn2 = new CustomNumberBtn(2, textbox);
        // this.root.add(btn2, BorderLayout.EAST);

        // CustomNumberBtn btn3 = new CustomNumberBtn(3, textbox);
        // this.root.add(btn3, BorderLayout.SOUTH);




        
    }
}

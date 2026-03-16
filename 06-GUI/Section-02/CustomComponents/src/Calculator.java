import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Calculator extends JFrame {

    private JPanel root = new JPanel();

    public Calculator(String title){
        super(title);


        this.root.setLayout(new BorderLayout());
        // this.root.setLayout(new GridLayout(4, 4));
        // root.setLayout(new BoxLayout(this.root, BoxLayout.X_AXIS));


        

            
        this.setContentPane(root);
        initializeSubComponents();


        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initializeSubComponents(){
        // CustomNumberButton btn0 = new CustomNumberButton(0);
        // btn0.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });
        // this.root.add(btn0);

        JTextArea textBox = new JTextArea(2, 5);
        // textBox.setBound
        this.root.add(textBox, BorderLayout.NORTH);


        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i ++){
            btnPanel.add(new CustomNumberButton(i, textBox));
        }
        this.root.add(btnPanel, BorderLayout.CENTER);

        this.root.add(new JButton("+"), BorderLayout.EAST);
        this.root.add(new JButton("-"), BorderLayout.WEST);

        JButton equalsBtn = new JButton("=");
        equalsBtn.addActionListener((e) -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        });
        this.root.add(equalsBtn, BorderLayout.SOUTH);


        // CustomNumberButton btn1 = new CustomNumberButton(1, textBox);
        // this.root.add(btn1, BorderLayout.NORTH);

        // CustomNumberButton btn2 = new CustomNumberButton(2, textBox);
        // this.root.add(btn2, BorderLayout.CENTER);

        // CustomNumberButton btn3 = new CustomNumberButton(3, textBox);
        // this.root.add(btn3, BorderLayout.SOUTH);

        // CustomNumberButton btn4 = new CustomNumberButton(4, textBox);
        // this.root.add(btn4, BorderLayout.EAST);

        

        // this.root.add(new CustomNumberButton(1, textBox));
        // this.root.add(new CustomNumberButton(2, textBox));
        // this.root.add(new CustomNumberButton(3, textBox));
        // this.root.add(new CustomNumberButton(4, textBox));
        // this.root.add(new CustomNumberButton(5, textBox));
    }
}

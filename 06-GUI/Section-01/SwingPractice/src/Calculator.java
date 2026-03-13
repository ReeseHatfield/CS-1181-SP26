import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Calculator extends JFrame {

    private JPanel root = new JPanel();

    public Calculator(String title){
        super(title);

        this.root.setLayout(new BorderLayout());

        // root.setLay

        
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.root);
        initComponents();
        
        this.setVisible(true);
    }

    private void initComponents(){
        // CustomNumberButton btn0 = new CustomNumberButton(0);
        // btn0.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });
        // this.root.add(btn0);

        JTextArea textBox = new JTextArea(2, 5);
        this.root.add(textBox, BorderLayout.NORTH);

        // JColorChooser chooser = new JColorChooser();
        // this.root.add(chooser);


        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(3, 3));


        for(int i = 1; i < 10; i ++){
            btnPanel.add(new CustomNumberButton(i, textBox));
        }
        
        this.root.add(btnPanel, BorderLayout.CENTER);
    }
    
}

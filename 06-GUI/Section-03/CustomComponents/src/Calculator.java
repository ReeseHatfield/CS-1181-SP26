import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    
    private JPanel root = new JPanel();

    public Calculator(String title){

        super(title);

        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.root);
        this.initComponents();

        this.setVisible(true);

    }

    private void initComponents(){

        JTextArea textbox = new JTextArea(2, 5);
        this.root.add(textbox);

        // CustomNumberBtn btn0 = new CustomNumberBtn(0);
        // btn0.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });
        // this.root.add(btn0);
        for(int i = 1; i < 10; i ++){
            this.root.add(new CustomNumberBtn(i, textbox));
        }
    }
}

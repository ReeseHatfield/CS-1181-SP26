import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private JPanel root = new JPanel();

    public Calculator(String title){
        super(title);

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
        this.add(textBox);

        for (int i = 0; i < 10; i ++){
            this.root.add(new CustomNumberButton(i, textBox));
        }

        // this.root.add(new CustomNumberButton(1, textBox));
        // this.root.add(new CustomNumberButton(2, textBox));
        // this.root.add(new CustomNumberButton(3, textBox));
        // this.root.add(new CustomNumberButton(4, textBox));
        // this.root.add(new CustomNumberButton(5, textBox));
    }
}

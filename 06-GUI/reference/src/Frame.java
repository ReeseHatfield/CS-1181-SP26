import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame{
    private JPanel root = new JPanel();

    public Frame(){
        super("Ball");


        // do not forget to set the layout
        this.root.setLayout(new BorderLayout());


        init();


        this.setContentPane(root);
        this.setSize(500,500);
        this.setVisible(true);
    }

    private void init(){
        Ball b = new Ball();

        this.root.add(b);
    }
}
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    private JPanel root = new JPanel();
    private int width = 600; 
    private int height = 600; 

    public Frame(){
        super("My Frame");

        this.setSize(width, height);

        JOptionPane.showMessageDialog(null, "these are the instructions for me gui game!");

        this.root.setLayout(new BorderLayout());
        this.setContentPane(this.root);
        this.init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void init(){
        Ball b = new Ball(this.width, this.height);

        this.root.add(b);
        // b.repaint




    }
} 
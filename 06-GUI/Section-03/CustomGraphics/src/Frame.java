import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private JPanel root = new JPanel();

    private int width = 600;
    private int height = 600;

    public Frame(){
        super("custom graphics");

        JOptionPane.showMessageDialog(this, "These are the instruction for my game!");
        this.root.setLayout(new BorderLayout());
        this.setContentPane(root);
        this.init();


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.width, this.height);
        this.setVisible(rootPaneCheckingEnabled);
    }

    private void init(){
        Ball b = new Ball(this.width, this.height);

        this.root.add(b);

        // b.x += 50;
        // b.repaint();
    }
}

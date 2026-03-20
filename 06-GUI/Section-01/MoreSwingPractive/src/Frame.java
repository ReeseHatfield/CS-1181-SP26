import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private JPanel root = new JPanel();

    public Frame(){
        super("Moving Ball");

        JOptionPane.showMessageDialog(this, "These are the instructions for me game");

        this.root.setLayout(new BorderLayout());
        this.setContentPane(root);
        
        this.init();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
    }

    private void init(){
        Ball b = new Ball();

        this.root.add(b);

        JButton btn = new JButton();

        btn.setIcon(new ImageIcon("cookie.png"));
        btn.addActionListener(e -> {
            System.out.println("Button was pressed");
        });

        this.root.add(btn, BorderLayout.SOUTH);

    }
}

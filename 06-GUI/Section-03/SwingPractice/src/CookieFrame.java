import javax.swing.*;
import java.awt.*;

public class CookieFrame extends JFrame {


    private JPanel root = new JPanel();
    private JLabel cookieLabel = new CookieLabel();

    public static Integer cookiesAcquired = 0;

    public CookieFrame(){

        this.setTitle("Cookie Clicker");

        
        this.root.setLayout(new BorderLayout());
        this.setContentPane(root);
        
        initComponent();

        this.setLocationRelativeTo(null);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



    private void initComponent(){
        this.root.add(this.cookieLabel, BorderLayout.NORTH);

        this.root.add(new CookieButton(), BorderLayout.CENTER);

        this.root.add(new UpgradePanel(), BorderLayout.SOUTH);
    }
}

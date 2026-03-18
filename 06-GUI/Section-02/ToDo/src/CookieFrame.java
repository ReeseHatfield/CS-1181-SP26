import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class CookieFrame extends JFrame{

    private JPanel root = new JPanel();

    // pass a reference around
    public static Integer cookiesAcquired = 0;

    // global mutable reference (usually bad)
    public static Integer numCookiesPerClick = 1;

    public CookieFrame(){
        super("Cookie Clicker");

        this.root.setLayout(new BorderLayout());
        this.initComponents();


        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(this.root);

        this.setVisible(true);
    }

    public static JLabel cookieLabel;

    private void initComponents(){
        this.cookieLabel = new JLabel("Cookies: 0");
        this.root.add(cookieLabel, BorderLayout.NORTH);


        CookieButton cookieBtn = new CookieButton();
        cookieBtn.addActionListener((e) -> {
        cookiesAcquired += this.numCookiesPerClick;

            // System.out.println(cookiesAcquired);
            cookieLabel.setText("Cookies: " + cookiesAcquired);

        });
        this.root.add(cookieBtn, BorderLayout.CENTER);

        UpgradePanel up = new UpgradePanel();
        this.root.add(up, BorderLayout.SOUTH);
    }
}

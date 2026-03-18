import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;


public class UpgradePanel extends JPanel {


    
    public UpgradePanel(){

        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));


        JButton upgrade0 = new JButton("+");
        upgrade0.addActionListener(e -> {
            CookieFrame.numCookiesPerClick++;
        });
        this.add(upgrade0);


        JButton upgrade1 = new JButton("Purchase AutoClicker (100 cookies)");
        upgrade1.addActionListener(e -> {

            if(CookieFrame.cookiesAcquired < 100){
                return;
            }
    
            ActionListener task = new ActionListener() {
    
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    // System.out.println(cookiesAcquired);
                    CookieFrame.cookiesAcquired++;

                    CookieFrame.cookieLabel.setText("Cookies: " + CookieFrame.cookiesAcquired);

                    System.out.println("cookies" + CookieFrame.cookiesAcquired);

                    // CookieFrame.numCookiesPerClick++;
                }
                
            };
    
            Timer timer = new Timer(1000, task);
    
            timer.setRepeats(true);
    
            timer.start();

        });

        this.add(upgrade1);


    }
}

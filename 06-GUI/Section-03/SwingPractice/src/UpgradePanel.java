import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpgradePanel extends JPanel {
    
    public UpgradePanel(){

        JButton upgrade0 = new JButton("+");
        upgrade0.addActionListener((e) -> {
            CookieButton.numCookiesPerClick++;
        });
        this.add(upgrade0);


        JButton upgrade1 = new JButton("Auto Click (100 cookies)");
        upgrade1.addActionListener((e) -> {

            if (CookieFrame.cookiesAcquired < 100){
                System.out.println("not enough money");
                return;
            }

            CookieFrame.cookiesAcquired -= 100;


            Timer cookieUpdater = new Timer(1000, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    CookieFrame.cookiesAcquired++;

                    // System.out.println("Click");
                }
                
            });

            cookieUpdater.setRepeats(true);
            cookieUpdater.start();

        });
        this.add(upgrade1);

        // on click
        // automatically generating cookies

    }
}

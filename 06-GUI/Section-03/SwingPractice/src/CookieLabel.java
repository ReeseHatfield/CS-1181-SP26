import javax.swing.*;
import java.awt.*;


public class CookieLabel extends JLabel {
    public CookieLabel(){
        this.setText("Cookies: 0");


        Timer timer = new Timer(250, e -> {
            this.setText("Cookies: " + CookieFrame.cookiesAcquired);
            this.repaint();
        });

        timer.setRepeats(true);
        timer.start();
    }
}

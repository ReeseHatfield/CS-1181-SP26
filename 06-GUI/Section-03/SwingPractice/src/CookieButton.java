import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieButton extends JButton implements ActionListener {

    // bad practice
    public static Integer numCookiesPerClick = 1;
    
    public CookieButton(){
        this.setIcon(new ImageIcon("cookie.png"));

        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        CookieFrame.cookiesAcquired += numCookiesPerClick;
        System.out.println(CookieFrame.cookiesAcquired);

    }
}

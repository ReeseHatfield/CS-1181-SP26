import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiButton extends JButton implements Runnable, ActionListener
{
    private JLabel hiLabel;

    public HiButton(JLabel label)
    {
        super("???");
        hiLabel = label;
        this.addActionListener(this);
    }

    public void run()
    {
        hiLabel.setText(hiLabel.getText() + "hi!");
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException ex)
        {
            System.out.println("oops");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Thread t = new Thread(this);
        t.start();
    }
}

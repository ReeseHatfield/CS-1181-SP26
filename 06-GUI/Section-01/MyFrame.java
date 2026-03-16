import javax.swing.*;
import java.awt.*;


// practice with keylisteners
// practice putting images on buttons
// pop-up windows
public class MyFrame extends JFrame
{
    private int clickCount = 0;
    private JPanel contentPanel = new JPanel();

    public MyFrame(String frameTitle)
    {
        super(frameTitle);

        JButton clickMe = new JButton("Click me!");
        clickMe.setSize(100, 100);
        //clickMe.setPreferredSize(new Dimension(100, 100));
        clickMe.addActionListener(e -> {
            System.out.println("I have been clicked " + ++clickCount + " number of times!");
        });
        contentPanel.add(clickMe);

        JButton newButton = new JButton("I am a new button!!!");
        newButton.addActionListener(e -> {
            try
            {
                for (int i = 0; i < 10; i++)
                {
                    Thread.sleep(1000);
                    ((JButton) e.getSource()).setText("#" + i);
                }
            }
            catch (InterruptedException ie)
            {
                System.out.println(ie.getStackTrace());
            }
        });
        contentPanel.add(newButton);

        addTenButtons();

        this.add(contentPanel);
    }

    public void addTenButtons()
    {
        for (int i = 1; i <= 10; i++)
        {
            JButton button = new JButton("Button #" + i);
            contentPanel.add(button);
        }
    }
}

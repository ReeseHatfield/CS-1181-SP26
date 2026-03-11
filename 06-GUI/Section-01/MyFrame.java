import javax.swing.*;
import java.awt.*;

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

import javax.swing.*;
import java.awt.*;


// practice with keylisteners
// practice putting images on buttons
// pop-up windows
public class MyFrame extends JFrame
{
    private int clickCount = 0;
    private DrawingPanel contentPanel = new DrawingPanel();
    private Timer newButtonTimer;
    private JButton newButton;
    private JButton clickMe;
    private int i = 1;

    public MyFrame(String frameTitle)
    {
        super(frameTitle);

        clickMe = new JButton("Click me!");
        clickMe.setSize(100, 100);

        class MyListener implements ActionListener{

        }

        //clickMe.setPreferredSize(new Dimension(100, 100));
        clickMe.addActionListener(e -> {
            System.out.println("I have been clicked " + ++clickCount + " number of times!");
        });
        contentPanel.add(clickMe);

        newButton = new JButton("I am a new button!!!");
        newButton.addActionListener(e -> {
            newButtonTimer = new Timer(1000, timedEvent -> {
                if (i <= 10)
                {
                    ((JButton) e.getSource()).setText("#" + i);
                    i++;
                    ((JButton) e.getSource()).setEnabled(false);
                }
                else
                {
                    newButtonTimer.stop();
                    i = 1;
                    ((JButton) e.getSource()).setEnabled(true);
                }
            });
            newButtonTimer.start();
//            try
//            {
//                for (int i = 1; i <= 10; i++)
//                {
//                    Thread.sleep(1000);
//                    ((JButton) e.getSource()).setText("#" + i);
//                }
//            }
//            catch (InterruptedException ie)
//            {
//                System.out.println(ie.getStackTrace());
//            }
        });
        contentPanel.add(newButton);

        addTenButtons();

        this.add(contentPanel);
    }

    public void animate()
    {
        contentPanel.animate();
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

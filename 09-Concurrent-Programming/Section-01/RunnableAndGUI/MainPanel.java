import javax.swing.*;

public class MainPanel extends JPanel
{
    private JLabel countdown = new JLabel("10");
    private JLabel hiLabel = new JLabel("???");
    private JButton startCountButton = new JButton("Start Countdown");
    private HiButton sayHiButton = new HiButton(hiLabel);
    private int count = 10;

    public MainPanel()
    {
         startCountButton.addActionListener(e -> {
             count = 10;
             Timer t = new Timer(1000, te -> {
                 countdown.setText(count + "!");
                 count--;
             });

             t.start();
         });

         this.add(startCountButton);
         this.add(countdown);
         this.add(sayHiButton);
         this.add(hiLabel);
    }
}

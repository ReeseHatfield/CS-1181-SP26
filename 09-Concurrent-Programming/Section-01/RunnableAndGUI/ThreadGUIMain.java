import javax.swing.*;
import java.awt.*;

public class ThreadGUIMain
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Runnable Example");
        window.setContentPane(new MainPanel());
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(new Dimension(500, 500));
        window.setVisible(true);
    }
}

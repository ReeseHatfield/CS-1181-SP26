import javax.swing.*;

public class FirstGUI
{
    public static void main(String[] args)
    {
        MyFrame mainWindow = new MyFrame("My first GUI!!!");
        mainWindow.setVisible(true);
        mainWindow.setSize(300, 500);
        mainWindow.setLocation(500, 300);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.animate();
//        while (true)
//        {
//            System.out.println("All done!!");
//        }
    }
}

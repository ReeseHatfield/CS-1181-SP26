import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel
{
    private int circleX = 50;
    private int circleY = 50;
    private int circleWidth = 100;
    private int circleHeight = 100;
    private int rightSide = circleX + circleWidth;
    private int bottomSide = circleY + circleHeight;
    private int xSpeed = 2;
    private int ySpeed = 3;
    private Timer animationTimer;

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(new Color(100, 50, 22));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(new Color(50, 100, 50));
        g.fillOval(circleX, circleY, circleWidth, circleHeight);
    }

    public void animate()
    {
        animationTimer = new Timer(5, event -> {

            if (this.getHeight() <= bottomSide)
            {
                ySpeed *= -1;
            }
            if (this.getWidth() <= rightSide)
            {
                xSpeed *= -1;
            }
            if (0 >= circleY)
            {
                ySpeed *= -1;
            }
            if (0 >= circleX)
            {
                xSpeed *= -1;
            }
            circleX = circleX + xSpeed;
            circleY = circleY + ySpeed;
            rightSide = circleX + circleWidth;
            bottomSide = circleY + circleHeight;
            invalidate();
            repaint();
        });

        animationTimer.start();
    }
}

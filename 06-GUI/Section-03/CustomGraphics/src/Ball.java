import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ball extends JComponent implements KeyListener{
    private int x = 251;
    private int y = 37;

    private int maxWidth = 600;
    private int maxHeight = 600;

    private int deltaX = 10;
    private int deltaY = 10;

    private int ballWidth = 50;
    private int ballHeight = 50;


    public Ball(int width, int height){
        this.maxWidth = width;
        this.maxHeight = height;


        // animate();
        // focus
        this.setFocusable(true);
        this.addKeyListener(this);
        this.requestFocus();
    }

    public void animate(){

        Timer t = new Timer(100, e -> {
            this.x += deltaX;
            this.y += deltaY;

            if(this.x < 0 || this.x > this.maxWidth - this.ballWidth){
                this.deltaX *= -1;
            }

            if(this.y < 0 || this.y > this.maxHeight - this.ballHeight){
                this.deltaY *= -1;
            } 


            this.repaint();
        });

        t.setRepeats(true);
        t.start();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.RED);

        g.fillOval(this.x, this.y, this.ballWidth, this.ballHeight);

        g.setColor(Color.GREEN);

        g.fillRect(this.x, this.y + 50, 50, 50);
        // g.drawString("Hello", 50, 50);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        // System.out.println("A key was pressed");

        if(e.getKeyCode() == KeyEvent.VK_A){
            // System.out.println("A was pressed");
            this.x -= 10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_D){
            this.x += 10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_W){
            this.y -= 10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_S){
            this.y += 10;
        }

        this.repaint();


    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

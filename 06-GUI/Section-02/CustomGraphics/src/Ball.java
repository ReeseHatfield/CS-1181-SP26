import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ball extends JComponent implements KeyListener{

    private int x = 33;
    private int y = 52;

    private int deltaX = +10;
    private int deltaY = +10;

    private int width = 50;
    private int height = 50;


    private int parentHeight;
    private int parentWidth;

    public Ball(int parentWidth, int parentHeight){

        this.parentHeight = parentHeight;
        this.parentWidth = parentWidth;

        this.setFocusable(true);
        this.addKeyListener(this);
        this.requestFocus();
        this.animate();
    }

    public void animate(){

        Timer t = new Timer(15, (e) -> {
            this.x += this.deltaX;
            this.y += this.deltaY;

            this.repaint();

            if(this.x > this.parentWidth - this.width || this.x < 0){
                this.deltaX *= -1;
            }

            if(this.y > this.parentHeight - this.height || this.y < 0){
                this.deltaY *= -1;
            }
        });

        t.setRepeats(true);
        t.start();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.RED);

        g.fillOval(this.x, this.y, this.width, this.height);

        // g.setColor(Color.GREEN);
        // g.fillRect(0, 50, this.x + 40, this.y + 200);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        // System.out.println("key pressed");

        if(e.getKeyCode() == KeyEvent.VK_D){
            System.out.println("D key was pressed");
            this.x += deltaX;
        }
        else if(e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A key was pressed");

            this.x -= deltaX;
        }
        else if(e.getKeyCode() == KeyEvent.VK_S){
            this.y += deltaY;
        }
        else if(e.getKeyCode() == KeyEvent.VK_W){
            this.y -= deltaY;
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }
}

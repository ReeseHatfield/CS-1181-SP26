import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;

public class Ball extends JComponent implements KeyListener {


    private int x = 50;
    private int y = 50;

    public Ball(){
        this.setFocusable(true);
        this.addKeyListener(this);
        this.requestFocus();
        // focus
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.RED);

        g.fillOval(this.x, this.y, 50, 50);

        g.setColor(Color.GREEN);

        g.fillRect(this.x, this.y + 50, 50, 50);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println("key typed");
        // A => left
        // D => right

        if(e.getKeyCode() == KeyEvent.VK_A){
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



        // this.y += 10;

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// make sure the layout is set of the parent component
public class Ball extends JComponent implements KeyListener{

    public Ball(){
        // this.animate();


        // discuss focus issues
        // ensure you add the key listener
        this.setFocusable(true);
        this.addKeyListener(this);
        this.requestFocus();
        
    }

    private int x = 30;
    private int y = 30;
    
    public void animate(){
        Timer t = new Timer(100, (e) -> {
            this.x += 10;


            this.repaint();
        });
        t.setRepeats(true);
        t.start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawOval(this.x, 50, 50, 50);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("got keypress");

        if(e.getKeyCode() == KeyEvent.VK_D){
            this.x += 100;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressedAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello! I was pressed");
    }
    
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class CustomNumberButton extends JButton implements ActionListener {
    private Integer value;
    private JTextArea textbox;

    public CustomNumberButton(Integer value, JTextArea textbox){
        this.value = value;
        this.textbox = textbox;

        // this.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });

        this.addActionListener(this);

        this.setText(value.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Btn " + this.value + " was pressed");

        this.textbox.setText(this.value.toString());

        // this.textbox.append(this.value.toString());
    }
}
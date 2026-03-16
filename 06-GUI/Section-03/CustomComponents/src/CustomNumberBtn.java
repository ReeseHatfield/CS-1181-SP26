import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class CustomNumberBtn extends JButton implements ActionListener {
    private Integer value;

    private JTextArea textbox;

    public CustomNumberBtn(Integer value, JTextArea textbox){

        this.textbox = textbox;
        this.value = value;

        this.setText(value.toString());


        // this.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });


        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e.getSource());

        this.textbox.setText(this.value.toString());

        System.out.println("btn " + this.value + " was pressed");
    }
}

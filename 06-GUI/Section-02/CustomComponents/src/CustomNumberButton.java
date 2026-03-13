import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CustomNumberButton extends JButton implements ActionListener{

    private Integer value;
    private JTextArea textBox;

    public Integer getValue() {
        return value;
    }

    public CustomNumberButton(Integer number, JTextArea textBox){
        this.value = number;
        this.textBox = textBox;

        // this.addActionListener((e) -> {
        //     System.out.println("btn was pressed");
        // });

        this.addActionListener(this);


        this.setText(number.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Btn " + this.value + " was pressed");


        this.textBox.setText(this.value.toString());
    }


}

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChatBot extends JFrame {

    private Predictor bot;
    private JPanel root = new JPanel();
    private JPanel responses = new JPanel();
    

    public ChatBot(String title){
        super(title);
        this.setSize(2000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            String book = Files.readString(
                Path.of("cleaned_RnJ.txt")
            ).replace("‘", "");

            this.bot = new Predictor(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.root.setLayout(new BorderLayout());
        this.root.add(this.responses);
        
        this.initComponents();
        this.setContentPane(this.root);
        this.setVisible(true);
    }

    private void initComponents(){
        // this.responses.add(this.getResponsePanel("juliet"), BorderLayout.CENTER);
        // this.responses.add(this.getResponsePanel("romeo"), BorderLayout.CENTER);

        // this.responses.repaint();

        JPanel submitPanel = new JPanel();

        JTextArea inputField = new JTextArea(2, 30);
        submitPanel.add(inputField);

        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> {
            JPanel response = getResponsePanel(inputField.getText());
            inputField.setText("");

            this.responses.add(response);
            this.responses.repaint();
        });

        submitPanel.add(submitBtn);
        this.root.add(submitPanel, BorderLayout.SOUTH);

    }

    private JPanel getResponsePanel(String input){
        JPanel panel = new JPanel();

        JLabel label = new JLabel();
        String response = this.bot.getResponse(input);
        label.setText(response);
        panel.add(label);

        return panel;
    }
}

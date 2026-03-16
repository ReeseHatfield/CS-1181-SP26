import java.awt.Font;

import javax.swing.JFrame;

public class Driver {

    public static void main(String[] args) {

        FontAdjuster.adjustFontSize(20);

        
        Calculator c = new Calculator("My GUI Calculator");

        System.out.println("Reached end of main!");

    }
}

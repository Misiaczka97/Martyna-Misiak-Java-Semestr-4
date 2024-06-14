package r03.r03_04;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ButtonDemo {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new JFrame();
            var button = new JButton("Kliknij mnie!");
            button.addActionListener(event -> 
                System.out.println("Dzięki za kliknięcie!"));
            frame.add(button);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });       
    }
}

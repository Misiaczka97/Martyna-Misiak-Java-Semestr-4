package r03.r03_03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ButtonDemo
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var frame = new JFrame();
            var button = new JButton("Kliknij mnie!");
            button.addActionListener(new ClickAction());
            frame.add(button);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class ClickAction implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("Dzięki za kliknięcie!");
    }
}

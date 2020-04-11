package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// mostenim clasa JFrame pentru a indica faptul ca Fereastra1 reprezinta o
// fereastra grafica
public class Fereastra1 extends JFrame {

    private JButton button;
    private JLabel label;

    public Fereastra1() {
        setTitle("Fereastra mea");

        button = new JButton();

        button.setText("Apasa-ma");

        this.add(button);

        label = new JLabel("0");

        this.add(label, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // la un click pe button, va fi apelata metoda actionPerformed

                String text = label.getText();
                Integer i = Integer.parseInt(text);

                i++;

                if (i == 10) {
                    dispose(); // inchide fereastra
                }

                label.setText(String.valueOf(i));
            }
        });

        setSize(400, 500);
        setLocationRelativeTo(null); // pozitionam fereastra pe centru
        setVisible(true); // o fereastra este implicit invizibila
    }
}

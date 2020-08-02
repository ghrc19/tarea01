package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class ValidarNumeros {

    java.awt.event.KeyEvent evt;

    public void sLetras(JTextField field) {
        field.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        });
    }
}

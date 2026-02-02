/*
Exercise: BE the Compiler
    The Java file on this page represents a complete source file. Your job is to play
    compiler and determine whether this file will compile. If it won’t compile, how
    would you fix it, and if it does compile, what would it do?

    provided code would not compile because we had
-----------        class ButtonListener extends ActionListener -----------
    Which is invalid, ButtonListener IS not ActionListener and it could not implement, 
    ActionListener is a functional interface so it has to be implemented
    and later instance of this class need to be passed as argument to method addActionListener(here)
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InnerButton {
    private JButton button;

    public static void main(String[] args) {
         InnerButton gui = new InnerButton();
         gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("A");
        button.addActionListener(new ButtonListener());

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
}

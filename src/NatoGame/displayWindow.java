package NatoGame;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * Created by Dillon Domnick. @since 1/27/2020
 *
 * User: Dillon
 * Time: 1:25 PM
 * Version: 1.0
 *
 * displays the window obv
 */
public class displayWindow extends JFrame implements DocumentListener {

    /**
     * Fields
     */
    private JTextField field;
    private JLabel label;

    /**
     * Constructor
     */
    public displayWindow() {
        init();
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new displayWindow();
            }
        });
    }

    /**
     * Methods
     */

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Nato Game");
        setLocationRelativeTo(null);

        field = new JTextField(20);
        label = new JLabel("1");
        label.setFont(new Font("Serif", Font.PLAIN, 72));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(field, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)

        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(label, 50, 100, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(field, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}

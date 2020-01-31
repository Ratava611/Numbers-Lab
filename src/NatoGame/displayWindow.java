package NatoGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Dillon Domnick. @since 1/27/2020
 *
 * User: Dillon
 * Time: 1:25 PM
 * Version: 1.0
 *
 * displays the window obv
 */
public class displayWindow extends JFrame implements ActionListener {

    /**
     * Fields
     */
    private JFrame frame;
    private JTextField field;
    private JButton quitButton;
    private JPanel panel;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private static displayText text;
    private static List<Character> chars = new ArrayList<>();

    private static int index;
    private static int removed = 0;
    private static int correct = 0;

    /**
     * Constructor
     */
    public static void main(String[] args) {
        text = new displayText();
        chars = text.getAbc();
        new displayWindow().init();
    }

    public displayWindow() {
    }

    /**
     * Methods
     */
    public void init() {
        frame = new JFrame("Nato Game");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //panel.setAlignmentX(Component.LEFT_ALIGNMENT);

        quitButton.setText("Quit");
        quitButton.addActionListener(this);
        //panel.add(quitButton);

        field.setColumns(20);
        field.addActionListener(this);
        //panel.add(field);

        this.setLabelText();
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Ariel", Font.PLAIN, 32));
        //label.setPreferredSize(new Dimension(250, 100));
        //panel.add(label);

        label2.setText(" ");
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setFont(new Font("Ariel", Font.PLAIN, 16));
        //panel.add(label2);

        label3.setText(" ");
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setFont(new Font("Ariel", Font.PLAIN, 16));
        label3.setForeground(Color.RED);
        //panel.add(label3);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(quitButton)) {
            System.exit(0);
        } else if (e.getSource().equals(field)) {
            if (chars.size() == 0) {
                setLabelText();
                return;
            }
            String target = null;
            for (int i = 0; i < text.getNato().length; i++) {
                if ((text.getNato())[i].startsWith(label.getText().toLowerCase())) {
                    target = text.getNato()[i];
                }
            }
            if (field.getText().toLowerCase().equals(target.toLowerCase())) {
                correct++;
                label3.setText("");
            } else {
                label3.setText(target);
            }
            float percent = (float) correct / (float) removed;
            label2.setText(String.format("%.2f", percent * 100.0f) + " percent");
            this.setLabelText();
            field.setText("");
            frame.repaint();
        }
    }

    public void setLabelText() {
        if (chars.size() > 0) {
            Random rng = new Random();
            index = rng.nextInt(chars.size());
            label.setText(chars.remove(index).toString());
            label.setForeground(Color.BLACK);
            removed++;
        } else {
            label.setFont(new Font("Ariel", Font.PLAIN, 16));
            label.setText("You scored " + correct + "/" + removed);
        }
    }
}

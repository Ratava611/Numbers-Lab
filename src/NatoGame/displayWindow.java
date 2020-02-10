package NatoGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
    private JTextField textField;
    private JButton quitButton;
    private JPanel panel;
    private JLabel displayChar;
    private JLabel displayPercent;
    private JLabel displayAnswer;
    private Timer timer;
    private static List<Character> charList;
    private static String[] stringArray;
    private static int removed = 0;
    private static int correct = 0;

    /**
     * Constructor
     */
    public static void main(String[] args) {
        displayText display = new displayText();
        charList = display.getAbc();
        stringArray = display.getNato();
        new displayWindow().init();
    }

    /**
     * Methods
     */
    public void init() {
        frame = new JFrame("Nato Game");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        quitButton.setText("Quit");
        quitButton.addActionListener(this);

        textField.setColumns(20);
        textField.addActionListener(this);

        this.setLabelText();
        displayChar.setVerticalAlignment(JLabel.CENTER);
        displayChar.setHorizontalAlignment(JLabel.CENTER);
        displayChar.setFont(new Font("Ariel", Font.PLAIN, 32));

        displayPercent.setText("Percent correct: ");
        displayPercent.setHorizontalAlignment(JLabel.CENTER);
        displayPercent.setFont(new Font("Ariel", Font.PLAIN, 12));

        displayAnswer.setText(" ");
        displayAnswer.setHorizontalAlignment(JLabel.CENTER);
        displayAnswer.setFont(new Font("Ariel", Font.PLAIN, 12));
        displayAnswer.setForeground(Color.RED);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void setLabelText() {
        if (charList.size() > 0) {
            displayChar.setText(charList.remove(0).toString());
            displayChar.setForeground(Color.BLACK);
            removed++;

        } else {
            displayChar.setFont(new Font("Ariel", Font.PLAIN, 16));
            displayChar.setText("You scored " + correct + "/" + removed);
            displayAnswer.setText("");
        }
    }

    ActionListener waitTest = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            timer.stop();
            displayAnswer.setText("You took too long!");
            frame.repaint();
            correct--;
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(quitButton)) {
            System.exit(0);
        } else if (e.getSource().equals(textField)) {
            if (charList.size() == 25) {
                timer = new Timer(5 * 1000, waitTest);
            } else {
                timer.stop();
            }
            if (charList.size() == 0) {
                setLabelText();
                return;
            }

            String target = null;
            for (int i = 0; i < stringArray.length; i++) {
                if ((stringArray)[i].startsWith(displayChar.getText().toLowerCase())) {
                    target = stringArray[i];
                }
            }

            if (StringMatch.isCorrect(textField.getText().toLowerCase(), target, 10)) {
                correct++;
                displayAnswer.setText("");
            } else {
                displayAnswer.setText(target);
            }

            float percent = (float) correct / (float) removed;
            displayPercent.setText("Percent correct: " + String.format("%.2f", percent * 100.0f) + "%");
            this.setLabelText();
            textField.setText("");
            timer.setInitialDelay(5 * 1000);
            timer.start();
            frame.repaint();

        }
    }

}

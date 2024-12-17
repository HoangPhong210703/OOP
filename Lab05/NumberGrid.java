import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDelete, btnReset;
    private JTextField tfDisplay;

    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);
    }

    private void addButtons(JPanel panelButtons) {
        for (int i = 0; i < 10; i++) {
            btnNumbers[i] = new JButton(String.valueOf(i));
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(new ButtonListener());
        }

        btnDelete = new JButton("Del");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(new ButtonListener());

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("C".equals(command)) {
                tfDisplay.setText("");
            } else if ("Del".equals(command)) {
                String currentText = tfDisplay.getText();
                if (!currentText.isEmpty()) {
                    tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                }
            } else {
                tfDisplay.setText(tfDisplay.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}

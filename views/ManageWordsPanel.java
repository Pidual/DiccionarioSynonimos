package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

public class ManageWordsPanel extends JPanel {
    // Botones text box y un boton

    private JButton leftArrows;
    private JTextField wordShowcaser;
    private JButton rigthArrows;
    private JLabel synonymCounter;

    public ManageWordsPanel(ActionListener listener) {
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) { // Componentes del panel de busqueda
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        leftArrows = new JButton("<<");
        leftArrows.setActionCommand("leftButtonPressed");
        leftArrows.addActionListener(listener);
        add(leftArrows, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        wordShowcaser = new JTextField(15);
        add(wordShowcaser, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        rigthArrows = new JButton(">>");
        rigthArrows.setActionCommand("rigthButtonPressed");
        rigthArrows.addActionListener(listener);
        add(rigthArrows, gbc); // Gbc con valores default

        gbc.gridx = 2;
        gbc.gridy = 3;
        synonymCounter = new JLabel("synonymCounter"); // TODO implementar lo de los numeros
        add(synonymCounter, gbc);

    }
}

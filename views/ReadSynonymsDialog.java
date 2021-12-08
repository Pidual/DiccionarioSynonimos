package views;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

public class ReadSynonymsDialog extends JDialog {

    JTextField txtWord;
    JButton btnAddSynonym;
    JLabel message;

    public ReadSynonymsDialog(ActionListener listener) {
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        message = new JLabel("Type the synonym to add");
        add(message, gbc);

        gbc.gridy = 1;
        txtWord = new JTextField(15);
        add(txtWord, gbc);

        gbc.gridy = 2;
        btnAddSynonym = new JButton("Add Synonym");
        btnAddSynonym.setActionCommand("addSynonym");
        btnAddSynonym.addActionListener(listener);
        add(btnAddSynonym, gbc);
    }

    public String getText() {
        return txtWord.getText();
    }

    public void setText(String text) {
        message.setText(text);
    }
}
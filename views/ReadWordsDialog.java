package views;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

public class ReadWordsDialog extends JDialog {

    JTextField txtWord;
    JButton btnAddWord;
    JLabel message;

    public ReadWordsDialog(ActionListener listener) {
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        GridBagConstraints gbc = new GridBagConstraints();

        message = new JLabel("Type the words to add");
        add(message, gbc);

        gbc.gridy = 1;
        txtWord = new JTextField(15);
        add(txtWord, gbc);

        gbc.gridy = 2;
        btnAddWord = new JButton("Add Word");
        btnAddWord.setActionCommand("addWord");
        btnAddWord.addActionListener(listener);
        add(btnAddWord, gbc);
    }

    public String getText() {
        return txtWord.getText();
    }

    public void setText(String text) {
        message.setText(text);
    }
}
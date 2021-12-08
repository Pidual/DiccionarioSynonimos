package views;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReadWordsDialog extends JDialog{
    
    JTextField txtWord;
    JButton btnFunction;

    public ReadWordsDialog(ActionListener listener){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public void initComponents(ActionListener listener){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 1;
        gbc.gridy = 0;
        txtWord = new JTextField(15);
        add(txtWord, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        btnFunction = new JButton("Find Synonyms");
        btnFunction.setActionCommand("findTheSynonym");
        btnFunction.addActionListener(listener);
        btnFunction.setBackground(new Color(85, 140, 140));  //LE DA EL COLOR ROSADO AL BOTON
        add(btnFunction, gbc); // Gbc con valores default
    }

    public String getText() {
        return txtWord.getText();
    }

}
package views;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ReadWordsDialog extends JDialog{
    
    JTextField txtWord;
    JButton btnFunction;
    JLabel message;

    public ReadWordsDialog(){
        initComponents();
    }

    public void initComponents(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        message = new JLabel("Ingrese la palabra que quiere agregar");
        add(message,gbc);

        gbc.gridy=1;
        txtWord = new JTextField(15);
        add(txtWord,gbc);

        gbc.gridy=2;
        btnFunction = new JButton("Add Word");
        btnFunction.setActionCommand("sendTextField");
        add(btnFunction,gbc);
    }

    public String getText() {
        return txtWord.getText();
    }
}
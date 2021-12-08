package views;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class ReadWordsDialog extends JDialog{
    
    JTextField txtWord;
    JButton btnFunction;

    public ReadWordsDialog(){
        initComponents();
    }

    public void initComponents(){
        txtWord = new JTextField(15);
        add(txtWord);
        btnFunction = new JButton("Add Word");
        add(btnFunction);
    }

    public String getText() {
        return txtWord.getText();
    }

}
package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;

public class SearchPanel extends JPanel {

    private JLabel textWord;
    private JTextField txtSynonym;
    private JButton btnSearch;
    

    public SearchPanel(ActionListener listener){
        initComponents(listener);
    }

    private void initComponents(ActionListener listener){ //Componentes del panel de busqueda
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        textWord = new JLabel("Word:");
        textWord.setBackground(new Color(7, 30, 34));
        add(textWord, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        txtSynonym = new JTextField(15);
        add(txtSynonym,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        btnSearch = new JButton("Find Synonyms");
        btnSearch.setActionCommand("findTheSynonym");
        btnSearch.addActionListener(listener);
        btnSearch.setBackground(new Color(85, 140, 140));  //LE DA EL COLOR ROSADO AL BOTON
        add(btnSearch, gbc); // Gbc con valores default
    }

    public String getText() {
        return txtSynonym.getText();
    }

}
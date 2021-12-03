package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.util.*;

public class SearchPanel extends JPanel {

    private JLabel textWord;
    private JTextField txtPropertyNumber;
    private JButton btnSearch;
    

    public SearchPanel( ){
        initComponents();
    }

    public void initComponents( ){ //Componentes del panel de busqueda
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        textWord = new JLabel("Word:");
        textWord.setBackground(new Color(0, 248, 0));
        add(textWord, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        txtPropertyNumber = new JTextField(15);
        add(txtPropertyNumber,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        btnSearch = new JButton("Find Synonyms");
        btnSearch.setBackground(new Color(255, 248, 240));  //LE DA EL COLOR ROSADO AL BOTON
        add(btnSearch, gbc); // Gbc con valores default
        // gbc.gridx = 1; // Grid x a 0
        // gbc.gridy = 0; // Grid Y a 0
        
    }

}
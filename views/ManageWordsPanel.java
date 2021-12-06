package views;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ManageWordsPanel extends JPanel{
    // Botones text box y un boton

    private JButton leftArrows;
    private JTextField wordShowcaser;
    private JButton rigthArrows;
    private JLabel panelTitle;
    private JSeparator separador;
    
    public ManageWordsPanel(){
        initComponents();
    }

    private void initComponents( ){ //Componentes del panel de busqueda
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        panelTitle = new JLabel("Synonyms");
        add(panelTitle,gbc);

        gbc.gridy = 1;
        leftArrows = new JButton("<<");
        add(leftArrows, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        wordShowcaser = new JTextField(15);
        add(wordShowcaser,gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        rigthArrows = new JButton(">>");
        add(rigthArrows, gbc); // Gbc con valores default
        // gbc.gridx = 1; // Grid x a 0
        // gbc.gridy = 0; // Grid Y a 0
        
    }
}

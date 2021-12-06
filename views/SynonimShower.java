package views;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class SynonimShower extends JPanel {
    
    private JButton addWord;
    private JButton addSynonym;

    public SynonimShower(){
        initComponents();
    }

    private void initComponents() {
      

        addWord = new JButton("add Word");
        add(addWord);

        addSynonym = new JButton("add Synonym");
        add(addSynonym);
    }
    

}

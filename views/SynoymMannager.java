package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SynoymMannager extends JPanel {
    
    private JButton addWord;
    private JButton addSynonym;

    public SynoymMannager(){
        initComponents();
    }

    private void initComponents() {
      

        addWord = new JButton("add Word");
        add(addWord);

        addSynonym = new JButton("add Synonym");
        add(addSynonym);
    }
    

}

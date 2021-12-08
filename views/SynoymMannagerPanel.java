package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;


public class SynoymMannagerPanel extends JPanel {
    
    private JButton addWord;
    private JButton addSynonym;
    private JButton save;

    public SynoymMannagerPanel(ActionListener listener){
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        addWord = new JButton("add Word");
        addWord.setActionCommand("ShowAddWord");
        addWord.addActionListener(listener);
        add(addWord);
        addSynonym = new JButton("add Synonym");
        addSynonym.setActionCommand("ShowAddSynonym");
        addSynonym.addActionListener(listener);
        add(addSynonym);

        save = new JButton("Save");
        save.setActionCommand("save");
        save.addActionListener(listener);
        add(save);
    }
}
package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SynoymMannagerPanel extends JPanel {
    
    private JButton addWord;
    private JButton addSynonym;

    public SynoymMannagerPanel(ActionListener listener){
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        addWord = new JButton("add Word");
        addWord.setActionCommand("addWord");
        addWord.addActionListener(listener);
        add(addWord);
        addSynonym = new JButton("add Synonym");
        addSynonym.setActionCommand("addSynonym");
        addSynonym.addActionListener(listener);
        add(addSynonym);
    }

    private void ActionPerformed(ActionEvent evt){
        ReadWordPanel rwp = new ReadWordPanel();
        rwp.setTitle("Add Word");
        rwp.setLocationRelativeTo(null);
        rwp.setSize(500,200);
        rwp.setVisible(true);
    }

}
package views;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.GridLayout; 
public class DiccionaryView extends JFrame {


    private SearchPanel sp;
    private SynonimShower ss;
    private ManageWordsPanel mwp;

    public DiccionaryView(){
        super("Synonims Diccionary");
        initComponents();
        setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        this.setLayout(new GridLayout(4,1));

        sp = new SearchPanel();
        sp.setBackground(new Color( 46, 94, 170)); 
        add(sp);

        ss = new SynonimShower();
        ss.setBackground(new Color(188, 128, 52)); //cOLOR para puntos de stylo
        add(ss);
        
    }
    

}
package views;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.GridLayout;

public class DiccionaryView extends JFrame {

    private SearchPanel sp;
    private SynonimShower ss;
    private ManageWordsPanel mwp;

    public DiccionaryView() {
        super("Synonims Diccionary");
        initComponents();
        setSize(500, 300); // width and height
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() { // inicia el FRAME
        this.setLayout(new GridLayout(3, 1));

        sp = new SearchPanel(); // INICIA EL PANEL de busqueda
        sp.setBackground(new Color(46, 94, 170));
        add(sp);

        mwp = new ManageWordsPanel();
        mwp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Synonyms"));
        add(mwp);

        ss = new SynonimShower(); // Inicia el panel que muestra los sinonimos
        ss.setBackground(new Color(254, 204, 102)); // cOLOR para puntos de stylo
        add(ss);

    }

}
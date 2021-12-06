package views;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class DiccionaryView extends JFrame {

    private SearchPanel sp;
    private SynonimShower ss;
    private ManageWordsPanel mwp;

    public DiccionaryView() {
        super("Synonims Diccionary");
        initComponents();
        setSize(500, 200); // width and height
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() { // inicia el FRAME
        this.setLayout(new BorderLayout());

        sp = new SearchPanel(); // INICIA EL PANEL de busqueda
        sp.setBackground(new Color(46, 94, 170));
        sp.setPreferredSize(sp.getPreferredSize());
        add(sp,BorderLayout.NORTH);

        mwp = new ManageWordsPanel();
        mwp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Synonyms"));
        mwp.setPreferredSize(mwp.getPreferredSize());
        add(mwp,BorderLayout.CENTER);

        ss = new SynonimShower(); // Inicia el panel que muestra los sinonimos
        ss.setBackground(new Color(254, 204, 102)); // cOLOR para puntos de stylo
        ss.setPreferredSize(ss.getPreferredSize());
        add(ss, BorderLayout.SOUTH);

    }

}
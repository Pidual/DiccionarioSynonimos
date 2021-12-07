package views;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class DiccionaryView extends JFrame {

    private SearchPanel sp;
    private SynoymMannagerPanel ss;
    private WordsShowcaserPanel wsp;

    public DiccionaryView(ActionListener listener) {
        super("Synonims Diccionary");
        initComponents(listener);
        setSize(500, 200); // width and height
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents(ActionListener listener) { // inicia el FRAME
        this.setLayout(new BorderLayout());

        sp = new SearchPanel(listener); // INICIA EL PANEL de busqueda ademas se pone su action liste
        sp.setBackground(new Color(46, 94, 170));
        sp.setPreferredSize(sp.getPreferredSize());
        add(sp, BorderLayout.NORTH);

        wsp = new WordsShowcaserPanel(listener);
        wsp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Synonyms"));
        wsp.setPreferredSize(wsp.getPreferredSize());
        add(wsp, BorderLayout.CENTER);

        ss = new SynoymMannagerPanel(listener); // Inicia el panel que muestra los sinonimos
        ss.setBackground(new Color(254, 204, 102)); // cOLOR para puntos de stylo
        ss.setPreferredSize(ss.getPreferredSize());
        add(ss, BorderLayout.SOUTH);

    }

    public String getText(){
        return sp.getText();
    }

    public void actualizeWordShowCaser(String text , int counter){
        wsp.actualizeWordShowCaser(text,counter);
    }

}
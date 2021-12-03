package views;

import javax.swing.JFrame;

public class DiccionaryView extends JFrame {


    private SearchPanel sp;
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
    }
    

}
package presenter;

import models.Dictionary;
import views.DiccionaryView;
import persitence.FileOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Presenter implements ActionListener {

    private DiccionaryView view;
    private Dictionary wikipedia;
    private FileOperation fileOperation;
    private ArrayList<String> wordAndSynonymsList;

    public void run() {
        wikipedia = new Dictionary();
        view = new DiccionaryView(this);
        fileOperation = new FileOperation();
        load();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        switch (command) {
            case "findTheSynonym":
                String text = view.getText();
                int counter;
                if (text.isBlank() == true) {
                    view.wordNotFound();
                } else {
                    counter = wikipedia.searchWord(text).getSynonymCount();
                    view.actualizeWordShowCaser(wikipedia.searchWord(text).getFirtsSynonym(), counter);
                }
                break;
            case "leftButtonPressed":
                System.out.println("El boton << presionado");
                break;
            case "rigthButtonPressed":
                System.out.println("El boton >> presionado");
                break;
            case "addWord":
                System.out.println("Palabra activada");
                break;
            case "addSynonym":
                System.out.println("Sinonimo activado");
                break;

            default:
                break;
        }
    }

    /**
     * Este metodo carga los archivos de texto
     */
    public void load() {
        wordAndSynonymsList = fileOperation.loadTextFile("diccionarioDePalabras.txt");
        for (int i = 0; i < wordAndSynonymsList.size(); i++) {
            String[] partes = wordAndSynonymsList.get(i).split("\t");
            wikipedia.addWord(partes);
        }
    }
}
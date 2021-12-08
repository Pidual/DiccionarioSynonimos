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
    private int i;
    private int counter;

    public void run() {
        wikipedia = new Dictionary();
        view = new DiccionaryView(this, null);
        fileOperation = new FileOperation();
        load();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        String  text = view.getText();
        switch (command) {
            case "findTheSynonym":
                if (wikipedia.searchWord(text) == null) {
                    view.wordNotFound();
                } else if(wikipedia.searchWord(text).getSynonymCount() == 0){
                    counter = wikipedia.searchWord(text).getSynonymCount();
                view.actualizeWordShowCaser("Word has not synonyms",counter);
                } else {
                    counter = wikipedia.searchWord(text).getSynonymCount();
                    view.actualizeWordShowCaser(wikipedia.searchWord(text).getSynonymsList().get(i),counter);
                }
                break;
            case "leftButtonPressed":
                    i--;
                    if(i < 0) {
                        i = counter-1;
                    }
                    view.actualizeWordShowCaserSynonyms(wikipedia.searchWord(text).getSynonymsList().get(i));
                break;
            case "rigthButtonPressed":
                    i++;
                    if(i > counter-1) {
                        i = 0;
                    }
                    view.actualizeWordShowCaserSynonyms(wikipedia.searchWord(text).getSynonymsList().get(i));
                break;
            case "ShowAddWord": 
                    view.setJDialogVisibility(true);
                break;

            case "addWord":
                    wikipedia.addWord(view.getJDialogText());
                    System.out.println(wikipedia.getWordList());
                    view.setJDialogVisibility(false);
                break;
            case "addSynonym":
                   

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
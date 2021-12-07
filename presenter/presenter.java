package presenter;

import models.Dictionary;
import views.DiccionaryView;
import persitence.FileOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;


public class Presenter implements ActionListener{
    
    private DiccionaryView view;
    private Dictionary wikipedia;
    private FileOperation fileOperation;
    private ArrayList<String> wordAndSynonymsList;

    public void run(){
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

    public void load(){ //RECIBE TODO DE FILEOPERATION Y EMPIEZA A CREAR PALABRAS
        wordAndSynonymsList = fileOperation.loadTextFile("diccionarioDePalabras.txt");
        for (String words : wordAndSynonymsList) {
			System.out.println(words);
		}
		//un predio por partes
		String[] partes = wordAndSynonymsList.get(0).split("\t");
		for (int i = 0; i < partes.length; i++) {
			System.out.println(partes[i]);
            
		}
        
    }

}
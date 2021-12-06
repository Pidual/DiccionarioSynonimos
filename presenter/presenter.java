package presenter;

import models.Dictionary;
import views.DiccionaryView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Presenter implements ActionListener{
    
    public void run() {
        //Library theWikipedia = new Library();
        DiccionaryView view = new DiccionaryView(this);
    }
    

    @Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("findTheSynonym")) {
			//TODO implementar a Modoelo le toca a a erik
            System.out.println("EL PEPEPE");
		}
	}

}
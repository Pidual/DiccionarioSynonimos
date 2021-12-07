package presenter;

import models.Dictionary;
import views.DiccionaryView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Presenter implements ActionListener{
    
    private DiccionaryView view;

    public void run() {
        //Library theWikipedia = new Library();
        view = new DiccionaryView(this);
    }
    

    @Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
        switch (command) {
            case "findTheSynonym":
               System.out.println(view.getText("SearchPanel")); 

                break;
            
            default:
                break;
        }
	}

}
package models;

import java.util.ArrayList;

public class Library {
<<<<<<< Updated upstream

    ArrayList<Word> wordsList = new ArrayList();    
=======
    ArrayList<Word> diccionary = new ArrayList();
    
    
>>>>>>> Stashed changes

    public Library(){
        wordsList = new ArrayList<>();
    }

    public void addWord(Word word){
        wordsList.add(word);
    }

    public void addSynonimous(String word, String synonimous){
        
    }

}
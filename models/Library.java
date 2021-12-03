package models;

import java.util.ArrayList;

public class Library {

    ArrayList<Word> wordsList = new ArrayList();    

    public Library(){
        wordsList = new ArrayList<>();
    }

    public void addWord(Word word){
        wordsList.add(word);
    }

    public void addSynonimous(String word, String synonimous){
        
    }

}
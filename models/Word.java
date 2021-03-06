package models;

import java.util.ArrayList;

public class Word {
 
    private String word;
    private ArrayList<String> synonimousList;
    
    public Word(String word, ArrayList<String> synonimousList) {
        this.word = word;
        this.synonimousList = synonimousList;
    }

    public void addSynonym(String synonym){
        synonimousList.add(synonym);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word+" synonyms =" + synonimousList;
    }

    public int getSynonymCount() {
        return synonimousList.size();
    }

    public ArrayList<String> getSynonymsList(){
        return synonimousList;
    }
}
package models;

import java.util.ArrayList;

public class Word {

    private String word;
    private ArrayList<String> synonimousList;

    public Word(String word, ArrayList<String> synonimousList) {
        this.word = word;
        this.synonimousList = synonimousList;
    }

    public void addSynonym(String synonym) {
        synonimousList.add(synonym);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getSynonymCount() {
        return synonimousList.size();
    }

    public ArrayList<String> getSynonymsList() {
        return synonimousList;
    }

    public String getSynonymsListFormated() {
        String format = "";
        if (synonimousList.size() == 0) {
            format = "";
        } else {
            
            for (String string : synonimousList) {
                format += string + "   ";
            }
        }
        return format;
    }

    public String getWordFormated() {
        return word + "   ";
    }
}
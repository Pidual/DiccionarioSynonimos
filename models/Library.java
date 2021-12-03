package models;

import java.util.ArrayList;

public class Library {

    ArrayList<Word> wordsList = new ArrayList<>();      

    public Library(){
        wordsList = new ArrayList<>();
    }

    public void createWord(String addWord){
        Word word = new Word(addWord, null);
    }

    public void addWord(){
        wordsList.add();
    }

    public Word searchWord(String word){
        Word searchedWord = null;
        for(Word words : wordsList){
            if(words.getWord().equals(word)){
                searchedWord = words;
            }
        }
        return searchedWord;
    }

    public void addSynonimous(String word, String synonimous){
        addWord(searchWord(word), synonimous);
    }

}
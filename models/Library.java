package models;

import java.util.ArrayList;

public class Library {

    ArrayList<Word> wordsList = new ArrayList<>();      

    public Library(){
        wordsList = new ArrayList<>();
    }

    public Word createWord(String addWord){
        Word word = new Word(addWord, null);
        return word;
    }

    public void addSynonimous(String word, String synonimous){
        
    }

    public void addWord(String word){
        wordsList.add(createWord(word));
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

   

}
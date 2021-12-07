package models;

import java.util.ArrayList;

public class Dictionary {

    ArrayList<Word> wordsList = new ArrayList<>();      

    public Dictionary(){
        wordsList = new ArrayList<Word>();
    }

    public Word createWord(String addWord, ArrayList<String> words){
        Word word = new Word(addWord, words);
        return word;
    }

    public void addSynonimous(String word, String synonimous){
        
    }

    public void addWord(String word){
        wordsList.add(createWord(word,null));
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
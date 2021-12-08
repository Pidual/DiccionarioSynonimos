package models;

import java.util.ArrayList;

public class Dictionary {

    ArrayList<Word> wordsList;

    public Dictionary() {
        wordsList = new ArrayList<Word>();
    }

    public Word createWord(String addWord, ArrayList<String> words) {
        Word word = new Word(addWord, words);
        return word;
    }

    public void addSynonimous(Word word, String synonimous) {
        word.addSynonym(synonimous);
    }

    /**
     * Sobre carga del metodo addWord si algo se borra el de arriba
     * @param partes
     */
    public void addWord(String[] partes) {
        wordsList.add(createWord(partes[0], removeTheFirtsThenArrayList(partes)));       
    }

    public void addWord(String word){
        wordsList.add(createWord(word, new ArrayList<String>()));
    }

    /**
     * Metodo Auxuliar para quitar el primer elemento de un Array y de paso
     * convertirlo en una lista
     * 
     * @param partes
     * @return una lista sin el primer elemento del array
     */
    private ArrayList<String> removeTheFirtsThenArrayList(String[] partes) {
        ArrayList<String> synonyms = new ArrayList<String>();
        for (int i = 1; i < partes.length; i++) {
            synonyms.add(partes[i]);
        }
        return synonyms;
    }

    public Word searchWord(String word) {
        Word searchedWord = null;
        for (Word words : wordsList) {
            if (words.getWord().equalsIgnoreCase(word)) {
                searchedWord = words;
            }
        }
        return searchedWord;
    }

    public ArrayList<Word> getWordList(){
        return wordsList;
    }
}
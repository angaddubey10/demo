package com.example.demo;

import java.net.PortUnreachableException;
import java.util.HashMap;

public class DictionaryUsingHashMap {
    private HashMap<String, String> dictionary;

    DictionaryUsingHashMap(){
        dictionary = new HashMap<>();
    }

    public boolean addWord(String word, String meaning){
        dictionary.put(word,meaning);
        return true;
    }

    public String findMeaning(String word){
        if(!dictionary.containsKey(word)){
            return "Given word not found";
        }
        else{
            return dictionary.get(word);
        }
    }
}

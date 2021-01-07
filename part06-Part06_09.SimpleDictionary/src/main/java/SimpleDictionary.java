 import java.util.ArrayList;
import java.util.HashMap;

public class SimpleDictionary {
    private ArrayList<String> words;
    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
        this.words.add(word);
    }
    
    public boolean contains(String word) {
        return this.words.contains(word);
    }
}


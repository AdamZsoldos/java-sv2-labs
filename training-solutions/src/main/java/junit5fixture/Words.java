package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    List<String> wordList = new ArrayList<>();

    public List<String> getWordList() {
        return wordList;
    }

    public void addWord(String word) {
        wordList.add(word);
    }

    public void removeWordsThatStartWith(String prefix) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String word : wordList) {
            if (word.startsWith(prefix))
                wordsToRemove.add(word);
        }
        wordList.removeAll(wordsToRemove);
    }

    public void removeWordsWithLength(int length) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String word : wordList) {
            if (word.length() == length)
                wordsToRemove.add(word);
        }
        wordList.removeAll(wordsToRemove);
    }
}

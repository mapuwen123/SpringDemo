package cn.marvin.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor2 {
    @Autowired
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        System.out.println("2------");
        spellChecker.checkSpelling();
    }
}

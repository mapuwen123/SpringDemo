package cn.marvin.springdemo;

import javax.annotation.Resource;

public class TextEditor3 {
    private SpellChecker spellChecker;

    @Resource(name = "spellChecker")
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("3------Inside TextEditor constructor...");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        System.out.println("3------");
        spellChecker.checkSpelling();
    }
}

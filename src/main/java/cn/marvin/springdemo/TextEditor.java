package cn.marvin.springdemo;

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("1------Inside TextEditor constructor...");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        System.out.println("1------");
        spellChecker.checkSpelling();
    }
}

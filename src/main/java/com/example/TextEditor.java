package com.example;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {}

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Constructor Injection used");
        this.spellChecker = spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Setter Injection used");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
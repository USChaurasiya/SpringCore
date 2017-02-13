package com.uma;

public class TextEditor {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside Spell Checker...");
		this.spellChecker = spellChecker;
	}
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}

}

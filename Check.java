package com.setterinjection;

public class Check {

	private SpellChecker spellChecker;

	

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void show(){
		spellChecker.Spelling();
		System.out.println("Inside Constructor.");
		
	}
	
}

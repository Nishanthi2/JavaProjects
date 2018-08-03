package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	public void getName() {
		System.out.println("name : " + name);
	}
    @Required// to say that the parameter passed to this method must be initialised
    //but it is overcome,since the ioccontainer isnt instructed to go through every method
    //and process the annotations. so use annotation context in beans
	public void setName(String name) {
		this.name = name;
	}

	public TextEditor() {
		System.out.println("inside default constructor");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("inside texteditor ctor");
		this.spellChecker= spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	//@Autowired(//for autowire by setter. then we can remove the autowire type in bean)
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("inside setspellchecker");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	

}

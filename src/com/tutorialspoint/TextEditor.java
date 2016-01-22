package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/19 0019 18:02.
 * email wug@shinemo.com
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public TextEditor(SpellChecker spellChecker, String name) {
        System.out.println("Inside TextEditor constructor spellChecker and name." );
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public TextEditor(int year, String name) {
        System.out.println("year: " + year + " name :" + name);
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        TextEditor obj =  (TextEditor)context.getBean("textEditor");
        obj.spellCheck();
    }
}

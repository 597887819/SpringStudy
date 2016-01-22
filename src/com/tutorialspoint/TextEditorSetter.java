package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by wug on 2016/1/20 0020 12:57.
 * email wug@shinemo.com
 */
public class TextEditorSetter {
    private SpellChecker spellChecker;
    private String name;

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    public void setName(String name) {
        System.out.println("Inside setName name: "  + name + ".");
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public static void run() {
        AbstractApplicationContext context = IocContainer.initBeansXml();
        TextEditorSetter obj = (TextEditorSetter)context.getBean("textEditorSetter");
        obj.spellCheck();
    }
}

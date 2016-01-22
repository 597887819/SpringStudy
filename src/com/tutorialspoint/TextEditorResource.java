package com.tutorialspoint;

import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * Created by wug on 2016/1/21 0021 17:02.
 * email wug@shinemo.com
 */
public class TextEditorResource {

    /**
     * @Resource 注释使用一个 ‘name’ 属性，
     * 该属性以一个 bean 名称的形式被注入。
     * 你可以说，它遵循 by-name 自动连接语义
     * 所以下面2种做法意思一致
     */
    @Resource(name = "spell")
    private SpellChecker spellChecker;

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

    /*
    @Resource
    private SpellChecker spell;

    public void spellCheck(){
        spell.checkSpelling();
    }*/


    /**
     * 如果没有明确地指定一个 ‘name’，
     * 默认名称源于字段名或者 setter 方法。
     * 在字段的情况下，它使用的是字段名；
     * 在一个 setter 方法情况下，它使用的是 bean 属性名称。
     * @param spellChecker
     */
    /*@Resource
    public void setSpell(SpellChecker spellChecker) {
        this.spell = spellChecker;
    }*/

    public static void run() {
        ApplicationContext context = IocContainer.initBeansXml();
        TextEditorResource obj = (TextEditorResource)context.getBean("textEditorResource");
        obj.spellCheck();
    }
}

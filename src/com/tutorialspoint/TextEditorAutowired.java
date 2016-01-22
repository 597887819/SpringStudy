package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Created by wug on 2016/1/21 0021 11:56.
 * email wug@shinemo.com
 */
public class TextEditorAutowired {


    @Autowired//用在属性中 缺省set方法的 自动连接 bean
    private SpellChecker spellChecker;

/*
    @Autowired// 用在构造方法中
    public TextEditorAutowired(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
*/

/*
    @Autowired //用在set方法中 执行 byType 自动连接 bean
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
*/
    /*
    @Autowired(required = false)// 依赖是非必须的 bean中 无 spellChecker spring容器也通过
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    */

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public static void run() {
        ApplicationContext context = IocContainer.initBeansXml1();
        TextEditorAutowired obj = (TextEditorAutowired)context.getBean("textEditorAutowired");
        obj.spellCheck();
    }
}

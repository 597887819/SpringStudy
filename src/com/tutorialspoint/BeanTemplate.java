package com.tutorialspoint;

/**
 * Created by wug on 2016/1/19 0019 17:10.
 * email wug@shinemo.com
 */
public class BeanTemplate {
    private String message1;
    private String message2;

    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void getMessage1() {
        System.out.println("World Message1 : " + message1);
    }

    public void getMessage2() {
        System.out.println("World Message2 : " + message2);
    }
}

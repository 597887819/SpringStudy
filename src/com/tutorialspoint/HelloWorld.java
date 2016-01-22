package com.tutorialspoint;

/**
 * Created by wug on 2016/1/19 0019 9:53.
 * email wug@shinemo.com
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
package com.github.spring4;

/**
 * Created by Alexander on 19.02.2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World!";
    }
}

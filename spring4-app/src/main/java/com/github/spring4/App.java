package com.github.spring4;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        StandartOutputMessageRender render = new StandartOutputMessageRender();
        HelloWorldMessageProvider provider = new HelloWorldMessageProvider();

        render.setMessageProvider(provider);
        render.render();

    }
}

package com.github.spring4;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        System.out.println("Hello World!");

        StandartOutputMessageRender render = new StandartOutputMessageRender();
        HelloWorldMessageProvider provider = new HelloWorldMessageProvider();

        render.setMessageProvider(provider);
        render.render();

        MessageRender mr = MessageSupportFactory.getInstance().getRender();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();

        mr.setMessageProvider(mp);
        mr.render();

    }
}

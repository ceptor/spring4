package com.github.spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {

        System.out.println("Hello World!");

        StandartOutputMessageRender render = new StandartOutputMessageRender();
        HelloWorldMessageProvider provider = new HelloWorldMessageProvider();

        render.setMessageProvider(provider);
        render.render();

        MessageRender mr = MessageSupportFactory.getInstance().getRender();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();

        mr.setMessageProvider(mp);
        mr.render();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

        StandartOutputMessageRender render1 = ctx.getBean("render", StandartOutputMessageRender.class);
        render1.render();

    }
}

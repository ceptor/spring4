package com.github.spring4;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Alexander on 20.02.2016.
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageRender render;
    private MessageProvider provider;

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public static void setInstance(MessageSupportFactory instance) {
        MessageSupportFactory.instance = instance;
    }

    public MessageRender getRender() {
        return render;
    }

    public void setRender(MessageRender render) {
        this.render = render;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    public MessageSupportFactory() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/msf.properties"));
            String renderClass = properties.getProperty("render.class");
            String providerClass = properties.getProperty("provider.class");

            render = (MessageRender) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.github.spring4;

/**
 * Created by klimov-aa on 19.02.2016.
 */
public class StandartOutputMessageRender implements MessageRender {

    private MessageProvider messageProvider;

    public void render() {
        if(messageProvider == null) throw new RuntimeException("fail :-)");
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}

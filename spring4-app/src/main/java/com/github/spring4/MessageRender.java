package com.github.spring4;

/**
 * Created by Alexander on 19.02.2016.
 */
public interface MessageRender {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}

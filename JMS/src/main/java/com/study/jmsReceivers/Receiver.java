package com.study.jmsReceivers;

import com.study.models.Event;

public interface Receiver {
    void receive(Event event);
}

package com.nm.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ExampleJmsListener {

	@JmsListener(destination = "flowable-history-jobs")
	public void receiveMessage(final Message jsonMessage) throws JMSException {
		System.out.println("Received message " + jsonMessage);
		
	}

}
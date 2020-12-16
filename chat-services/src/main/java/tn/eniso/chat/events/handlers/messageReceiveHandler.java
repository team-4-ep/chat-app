package tn.eniso.chat.events.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;


import org.springframework.messaging.simp.SimpMessagingTemplate;

import tn.eniso.chat.event.model.MessageChangeModel;
import tn.eniso.chat.events.CustomChannels;


@EnableBinding(CustomChannels.class)
public class messageReceiveHandler {
	
	 @Autowired
	    SimpMessagingTemplate template;
	 
	private static final Logger logger = LoggerFactory.getLogger(messageReceiveHandler.class);

	@Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
	
	@StreamListener("inboundChatChanges")
    public void loggerSink(MessageChangeModel msgReceive) {

        System.out.println("sending via kafka listener..");
        template.convertAndSend("/topic/group", msgReceive);
	}
}

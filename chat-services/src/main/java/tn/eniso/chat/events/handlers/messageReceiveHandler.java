package tn.eniso.chat.events.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import tn.eniso.chat.event.model.MessageChangeModel;
import tn.eniso.chat.events.CustomChannels;


@EnableBinding(CustomChannels.class)
public class messageReceiveHandler {
	
	
	private static final Logger logger = LoggerFactory.getLogger(messageReceiveHandler.class);

	
	@StreamListener("inboundChatChanges")
    public void loggerSink(MessageChangeModel msgReceive) {
		logger.info("***************** Received a message"+" \""+msgReceive.getMessage()+" \""+" of type " + msgReceive.getType());
	}
}

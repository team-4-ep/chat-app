package tn.eniso.chat.events.source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import tn.eniso.chat.event.model.MessageChangeModel;

@Component
@EnableBinding(Source.class)
public class SimpleSourceBean {
	private Source source;

    private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);

    @Autowired
    public SimpleSourceBean(Source source){
        this.source = source;
    }

    public void publishOrgChange(String code,String sender,String message){
       logger.debug("Sending Kafka message {} for Organization Id: {}", sender, message);
        MessageChangeModel change =  new MessageChangeModel(
        		code,
        		message,
        		sender
        		);

        source.output().send(MessageBuilder.withPayload(change).build());
    }
}

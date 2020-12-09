package tn.eniso.chat.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import tn.eniso.chat.events.source.SimpleSourceBean;
import tn.eniso.chat.model.Message;
import tn.eniso.chat.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private MessageRepository msgRepository;

    @Autowired
    SimpleSourceBean simpleSourceBean;
	
    public void saveMsg(Message msg){
    	msg.setCode(UUID.randomUUID().toString());

    //	msgRepository.save(msg);
        simpleSourceBean.publishOrgChange(msg.getCode(),msg.getType(),msg.getMessage());
    }
}

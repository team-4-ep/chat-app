package tn.eniso.chat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.eniso.chat.model.Message;
import tn.eniso.chat.services.MessageService;

@RestController
@RequestMapping(value="/chat")
public class ChatServiceContoller {

    @Autowired
    private MessageService msgService;
    private static final Logger logger = LoggerFactory.getLogger(ChatServiceContoller.class);
    
    @RequestMapping(value="/send",method = RequestMethod.POST)
    public void saveOrganization(@RequestBody Message msg) {
       msgService.saveMsg( msg );
    }
}

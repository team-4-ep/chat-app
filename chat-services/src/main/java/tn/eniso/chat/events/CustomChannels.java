package tn.eniso.chat.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomChannels {

    @Input("inboundChatChanges")
    SubscribableChannel msgs();
    
    /*If you want to define output channels for publishing messages,
    you’d use the @OutputChannel above the method that will be called. In the case of
    an output channel, the defined method will return a MessageChannel class instead
    of the SubscribableChannel class used with the input channel:
    @OutputChannel(“outboundOrg”)
    MessageChannel outboundOrg();*/
}

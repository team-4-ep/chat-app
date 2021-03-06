import React from 'react'
import SockJsClient from 'react-stomp';
import ChatHeader from '../Components/Layout/ChatHeader'
import InputMsg from '../Components/Input/InputMsg'
import SiderMenu from '../Components/Layout/SiderMenu';
import List from '../Components/Messages/List';
import { useDispatch } from "react-redux";
import { addMessage } from "../actions/messageActions"

const SOCKET_URL = 'http://localhost:8085/ws-chat/';

function Chat() {
    const dispatch = useDispatch();
    const onConnected = () => {
        console.log("Connected!!")
      }
    
      const onMessageReceived = (msg) => {
        console.log('New Message Received!!', msg);
        dispatch(addMessage(msg));
      }

    return (
        <div className="chat-app">
            <SockJsClient
              url={SOCKET_URL}
              topics={['/topic/group']}
              onConnect={onConnected}
              onDisconnect={console.log("Disconnected!")}
              onMessage={msg => onMessageReceived(msg)}
              debug={false}
            />
            <ChatHeader/>
            <SiderMenu />
            <List/>
            <InputMsg/>
        </div>
    )
}
export default Chat;
import React, { useState } from 'react'
import "./App.css";
import Form from './Components/LoginForm';
import SyntaxCode from './Components/SyntaxCode';

import chatAPI from './services/chatapi';
const SOCKET_URL = 'http://localhost:8080/ws-chat/';

function App() {
  const [messages, setMessages] = useState("")
  const [user, setUser] = useState(null)
  let onConnected = () => {
    console.log("Connected!!")
  }
  let onMessageReceived = (msg) => {
    console.log('New Message Received!!', msg);
    setMessages(messages.concat(msg));
  }
  let onSendMessage = (msgText) => {
    chatAPI.sendMessage(user.username, msgText).then(res => {
      console.log('Sent', res);
    }).catch(err => {
      console.log('Error Occured while sending message to api');
    })
  }

  let handleLoginSubmit = (username) => {
    console.log(username, " Logged in..");

    setUser({
      username: username,
      color: randomColor()
    })

  }
  return (
    <div className="App">
      <h1>React Code Syntax</h1>
      {!!user ?
        ( 
        <>
          <SockJsClient
            url={SOCKET_URL}
            topics={['/topic/group']}
            onConnect={onConnected}
            onDisconnect={console.log("Disconnected!")}
            onMessage={msg => onMessageReceived(msg)}
            debug={false}
          />
          <div style={{width:'600px'}}>
            <SyntaxCode messages={messages} currentUser={user} />
          </div>
      <Form setTextCode={setTextCode} onSendMessage={onSendMessage} />
      </>
  ) :
  <LoginForm onSubmit={handleLoginSubmit} />
}
</div >
)
}
export default App;
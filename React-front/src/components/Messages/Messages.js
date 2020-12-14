import React from 'react'

const Messages = ({ messages, currentUser }) => {

    let renderMessage = (message) => {
        const { code, type, message } = message;
      //  const messageFromMe = currentUser.username === message.code;
      //  const className = messageFromMe ? "Messages-message currentUser" : "Messages-message";
        return (
            <li>
                
                <div className="Message-type">
                    <div className="username">
                        {code}
                    </div>
                    <div className="text">{type}</div>
                </div>
            </li>
        );
    };

    return (
        <ul className="messages-list">
            {messages.map(msg => renderMessage(msg))}
        </ul>
    )
}


export default Messages
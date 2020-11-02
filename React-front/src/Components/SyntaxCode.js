import React from 'react'
import detectLang from "lang-detector"
import { Prism as SyntaxHighlighter } from 'react-syntax-highlighter';
import { prism } from 'react-syntax-highlighter/dist/esm/styles/prism';

const language= detectLang(textCode).toLowerCase(); 

const SyntaxCode = ({textCode, currentUser }) => {

  let renderMessage = (message) => {
      const { sender, content } = message;
      const messageFromMe = currentUser.username === message.sender;
      const className = messageFromMe ? "Messages-message currentUser" : "Messages-message";
      return (
          <li>
          <span>{sender}: {language}</span>
          <SyntaxHighlighter language={language} style={prism} showLineNumbers >
            {content}
          </SyntaxHighlighter>
          </li>
      );
  };
    return (
      
      <ul>
      {messages.map(msg => renderMessage(msg))}
    </ul>
    );
}
export default SyntaxCode;
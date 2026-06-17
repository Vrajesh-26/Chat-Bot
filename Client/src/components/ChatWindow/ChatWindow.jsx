import { useState } from "react";
import ChatFooter from "../ChatFooter/ChatFooter";
import ChatHeader from "../ChatHeader/ChatHeader";
import MessageList from "../MessageList/MessageList"
import "./ChatWindow.css";

const ChatWindow = () => {
    
    const [chatHistory, setChatHistory] = useState([{
            role: "bot",
            text: "Hello! How can I help you?"
        }]);

    const messages = [
        {
            id: 1,
            sender: "bot",
            text: "Hello! How can I help you?"
        },
        {
            id: 2,
            sender: "user",
            text: "I need information about React. Can you explain about it.?"
        }
    ];

    return (
        <div className="chat-window">
            <ChatHeader />
            <div className="message-body">
                <MessageList messages= {chatHistory}/>
            </div>
            <ChatFooter setChatHistory={setChatHistory} />
        </div>
    )
}

export default ChatWindow;
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

    return (
        <div className="chat-window">
            <ChatHeader />
            <div className="message-body">
                <MessageList messages= {chatHistory}/>
            </div>
            <ChatFooter chatHistory={chatHistory} setChatHistory={setChatHistory} />
        </div>
    )
}

export default ChatWindow;
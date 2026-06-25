import { useEffect, useRef, useState } from "react";
import ChatFooter from "../ChatFooter/ChatFooter";
import ChatHeader from "../ChatHeader/ChatHeader";
import MessageList from "../MessageList/MessageList"
import "./ChatWindow.css";

const ChatWindow = () => {
    
    const chatBodyRef = useRef();

    const [chatHistory, setChatHistory] = useState([{
            role: "bot",
            text: "Hello! How can I help you?"
    }]);

    useEffect(() => {
        // Add auto-scrolling
        chatBodyRef.current.scrollTo({top: chatBodyRef.current.scrollHeight, behavior:"smooth"});
    }, [chatHistory]);
    return (
        <div className="chat-window">
            <ChatHeader />
            <div ref={chatBodyRef} className="message-body">
                <MessageList messages= {chatHistory}/>
            </div>
            <ChatFooter chatHistory={chatHistory} setChatHistory={setChatHistory} />
        </div>
    )
}

export default ChatWindow;
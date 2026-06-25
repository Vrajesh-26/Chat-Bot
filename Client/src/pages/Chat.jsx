import { useState } from "react";
import ChatToggler from "../components/ChatToggler/ChatToggler";
import ChatWindow from "../components/ChatWindow/ChatWindow";

const Chat = () => {
    const [showChatbot, setShowChatbot] = useState(false);
    return (
        <div id="chat" className={`container ${showChatbot ? "show-chatbot" : "" }`}>
            <ChatToggler setShowChatbot={setShowChatbot}/>
            <ChatWindow />                        
        </div>
    )
}

export default Chat;
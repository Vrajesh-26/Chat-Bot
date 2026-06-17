import ChatBotIcon from "../ChatBotIcon/ChatBotIcon";
import "./ChatHeader.css"
const ChatHeader = () => {
    return (
        <div className="chat-header">
            <div className="header-info">
                <div className="chatbot-logo">
                    <ChatBotIcon />
                    <h2 className="logo-text">Chatbot</h2>
                </div>
                <div className="header-control">
                    <button className="drop-down-arrow">↓</button>
                </div>
            </div>
        </div>
    )
}

export default ChatHeader;
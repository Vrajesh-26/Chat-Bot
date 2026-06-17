import MessageBubble from "../MessageBubble/MessageBubble";
import "./MessageList.css";

const MessageList = ({ messages }) => {    
    return (
        <div className="message-list">
            {messages.map((message, index) => (
                <MessageBubble key={index} message={message} />
            ))}
        </div>
    )
}

export default MessageList;
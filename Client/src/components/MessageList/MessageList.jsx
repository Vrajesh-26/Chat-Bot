import MessageBubble from "../MessageBubble/MessageBubble";
import "./MessageList.css";
const MessageList = ({ messages }) => {
    return (
        <div className="message-list">
            {messages.map((message) => (
                <MessageBubble key={message.id} message={message} />
            ))}
        </div>
    )
}

export default MessageList;
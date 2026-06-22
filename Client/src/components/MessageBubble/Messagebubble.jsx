import "./MessageBubble.css";
const MessageBubble = ({ message }) => {
    return (
        <div className={
            message.role === "user" ? 
            "message user-message" :
            "message bot-message"    
        } data-role={message.role}>
            <p className="message-text">
                {message.text}
            </p>
        </div>
    );
};

export default MessageBubble;
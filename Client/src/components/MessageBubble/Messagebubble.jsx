import "./MessageBubble.css";
const MessageBubble = ({ message }) => {
    return (
        <div className={
            message.sender === "role" ? 
            "message user-message" :
            "message bot-message"    
        }>
            <p className="message-text">
                {message.text}
            </p>
        </div>
    );
};

export default MessageBubble;
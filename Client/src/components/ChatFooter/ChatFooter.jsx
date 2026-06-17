import "./ChatFooter.css";

const ChatFooter = () => {
    return (
        <div className="chat-footer">
            <form action="#" className="chat-form">
                <input type="text" name="user-input" className="message-input" placeholder="Message..." required />
                <button className="upward-arrow">↑</button>
            </form>
        </div>
    )
}

export default ChatFooter;
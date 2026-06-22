import UserInput from "../UserInput/UserInput";
import "./ChatFooter.css";

const ChatFooter = ({ chatHistory, setChatHistory }) => {

    return (
        <div className="chat-footer">
            <UserInput chatHistory={chatHistory} setChatHistory={setChatHistory} />
        </div>
    )
}

export default ChatFooter;
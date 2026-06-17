import UserInput from "../UserInput/UserInput";
import "./ChatFooter.css";

const ChatFooter = ({ setChatHistory }) => {

    return (
        <div className="chat-footer">
            <UserInput setChatHistory={setChatHistory} />
        </div>
    )
}

export default ChatFooter;
import "./ChatToggler.css";

const ChatToggler = ({ setShowChatbot }) => {

    return(
        <button onClick={() => setShowChatbot((prev) => !prev)} id="chatbot-toggler">
            <span className="cmt-icon">mode_comment</span>
            <span className="close-cross">close</span>
        </button>
    )
}

export default ChatToggler;
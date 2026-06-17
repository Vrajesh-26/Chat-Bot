import { useRef } from "react";
import "./UserInput.css";

const UserInput = ({ setChatHistory }) => {

    const inputRef = useRef();

    const handleFormSubmit = (e) => {
        e.preventDefault();
        const userMessage = inputRef.current.value.trim();
        
        if(!userMessage) return;
        console.log(userMessage);
        
        inputRef.current.value="";

        // Update chat history with userMessage
        setChatHistory((history) => [...history, { sender:"user", text: userMessage }]);

        // Add "Thinking..." place holder for model's response
        setTimeout(() => setChatHistory((history) => [...history, {sender:"bot", text: "Thinking..."}]), 600)
    }

    return (
        <form action="#" className="chat-form" onSubmit={handleFormSubmit}>
                <input ref={inputRef} type="text" name="user-input" className="message-input" placeholder="Message..." required />
                <button className="upward-arrow">↑</button>
        </form>
    );
}

export default UserInput;
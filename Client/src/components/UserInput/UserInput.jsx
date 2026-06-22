import { useRef } from "react";
import "./UserInput.css";
import ollamaCall  from "../../services/aiService.js";

const UserInput = ({ chatHistory, setChatHistory }) => {

    const inputRef = useRef();

    const updateHistory = (text) => {
        setChatHistory((prev) => [...prev
                                        .filter(msg => msg.text !== "Thinking..."), 
                                    {role:"bot", text: text}]
        );
    }

    const handleFormSubmit = async (e) => {
        e.preventDefault();
        const userMessage = inputRef.current.value.trim();

        if (!userMessage) return;
        inputRef.current.value = "";

        const messageList = [...chatHistory, { role: "user", text: userMessage }];

        setChatHistory((history) => [
            ...history,
            { role: "user", text: userMessage },
            { role: "bot", text: "Thinking..." }
        ]);

        try {
            const ollamaMessage = [
                ...chatHistory.map((msg) => ({
                    role: msg.role === "bot" ? "assistant" : "user",
                    content: msg.text
                })), 
                { role: "user", content: userMessage}
            ]
            console.log(ollamaMessage);
            const botResponse = await ollamaCall(ollamaMessage);
            updateHistory(botResponse.message.content);
            console.log(botResponse.message.content);
            
        } catch (error) {
            console.error("Ollama call failed:", error);
            updateHistory("Sorry, I couldn't get a response. Please try again.");
        }
    }

    return (
        <form action="#" className="chat-form" onSubmit={handleFormSubmit}>
                <input ref={inputRef} type="text" name="user-input" className="message-input" placeholder="Message..." required />
                <button className="upward-arrow">↑</button>
        </form>
    );
}

export default UserInput;
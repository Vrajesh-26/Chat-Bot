import ollama from "ollama";

const ollamaCall = async (messages) => {
    try {
        const response = await ollama.chat({
            model: "qwen3:8b",
            messages: messages,
            stream: false
        });

        return response;
    } catch (error) {
        console.error("Ollama Error:", error);
        throw error;
    }
};

export default ollamaCall;
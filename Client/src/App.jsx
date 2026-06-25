import { BrowserRouter, useLocation, Route, Routes } from "react-router-dom";
import ChatWindow from "./components/ChatWindow/ChatWindow";
import Chat from "./pages/Chat";

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/chat" element={ <Chat /> }/>
      </Routes>
    </BrowserRouter>
    
  );
}

export default App;

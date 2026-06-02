import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import TodoPage from "./pages/TodoPage";
import TaskPage from "./pages/TaskPage";

export default function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/todos" element={<TodoPage />} />
                <Route path="/task/:title" element={<TaskPage />} />
            </Routes>
        </BrowserRouter>
    );
}
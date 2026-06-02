import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

export default function TodoPage() {
    const [tasks, setTasks] = useState([]);
    const [input, setInput] = useState("");

    useEffect(() => {
        const data = localStorage.getItem("tasks");
        if (data) setTasks(JSON.parse(data));
    }, []);

    useEffect(() => {
        localStorage.setItem("tasks", JSON.stringify(tasks));
    }, [tasks]);

    const addTask = () => {
        if (!input.trim()) return;

        setTasks([
            ...tasks,
            { id: Date.now(), title: input, done: false },
        ]);

        setInput("");
    };

    const toggleTask = (id) => {
        setTasks(
            tasks.map((t) =>
                t.id === id ? { ...t, done: !t.done } : t
            )
        );
    };

    const deleteTask = (id) => {
        setTasks(tasks.filter((t) => t.id !== id));
    };

    const doneCount = tasks.filter(t => t.done).length;

    return (
        <div style={{ padding: 20 }}>
            <h2>Todo List</h2>

            <p>Виконано {doneCount} з {tasks.length}</p>

            <input
                value={input}
                onChange={(e) => setInput(e.target.value)}
                onKeyDown={(e) => e.key === "Enter" && addTask()}
                placeholder="Нова задача"
            />

            <button onClick={addTask}>Додати</button>

            <ul>
                {tasks.map((task) => (
                    <li key={task.id}>
            <span
                onClick={() => toggleTask(task.id)}
                style={{
                    textDecoration: task.done
                        ? "line-through"
                        : "none",
                    cursor: "pointer",
                    marginRight: 10,
                }}
            >
              <Link to={`/task/${task.title}`}>
                {task.title}
              </Link>
            </span>

                        <button onClick={() => deleteTask(task.id)}>
                            ✕
                        </button>
                    </li>
                ))}
            </ul>
        </div>
    );
}
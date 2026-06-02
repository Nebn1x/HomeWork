import { useParams } from "react-router-dom";

export default function TaskPage() {
    const { title } = useParams();

    return (
        <div style={{ padding: 20 }}>
            <h1>Задача:</h1>
            <h2>{title}</h2>
        </div>
    );
}
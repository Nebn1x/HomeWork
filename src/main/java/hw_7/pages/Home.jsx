import { Link } from "react-router-dom";

export default function Home() {
    return (
        <div style={{ padding: 20 }}>
            <h1>Головна сторінка</h1>

            <Link to="/todos">
                Перейти до списку задач
            </Link>
        </div>
    );
}
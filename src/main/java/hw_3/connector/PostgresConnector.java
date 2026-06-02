package hw_3.connector;

public class PostgresConnector implements DatabaseConnector {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL");
    }
}
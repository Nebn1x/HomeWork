package hw_3.connector;

public class MySQLConnector implements DatabaseConnector {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL");
    }
}
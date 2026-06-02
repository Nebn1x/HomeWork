package hw_3.connector;

public class MongoConnector implements DatabaseConnector {

    @Override
    public void connect() {
        System.out.println("Connected to MongoDB");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MongoDB");
    }
}
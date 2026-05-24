package hw_3.connector;

public class DatabaseConnectorFactory {

    public static DatabaseConnector createConnector(String type) {

        return switch (type.toLowerCase()) {
            case "postgres" -> new PostgresConnector();
            case "mysql" -> new MySQLConnector();
            case "mongo" -> new MongoConnector();
            default -> throw new IllegalArgumentException("Unknown database type");
        };
    }
}
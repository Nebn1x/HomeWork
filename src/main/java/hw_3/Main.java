package hw_3;

import hw_3.connector.DatabaseConnector;
import hw_3.connector.DatabaseConnectorFactory;

public class Main {

    public static void main(String[] args) {

        DatabaseConnector postgres = DatabaseConnectorFactory.createConnector("postgres");

        postgres.connect();
        postgres.disconnect();

        System.out.println();

        DatabaseConnector mysql = DatabaseConnectorFactory.createConnector("mysql");

        mysql.connect();
        mysql.disconnect();

        System.out.println();

        DatabaseConnector mongo = DatabaseConnectorFactory.createConnector("mongo");

        mongo.connect();
        mongo.disconnect();
    }
}
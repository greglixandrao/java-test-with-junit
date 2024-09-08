package com.greglixandrao;

import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void startConnection() {
        LOGGER.info("Starting connection...");
    }

    public static void closeConnection() {
        LOGGER.info("Closing connection...");
    }

    public static void insertData() {
        LOGGER.info("Inserting data...");
    }

    public static void deleteData() {
        LOGGER.info("Deleting data...");
    }
}

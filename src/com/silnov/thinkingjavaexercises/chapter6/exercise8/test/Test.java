package com.silnov.thinkingjavaexercises.chapter6.exercise8.test;

class Connection {
    private static int connectionsCount = 0;

    private Connection() {
        System.out.println(++connectionsCount);
    }

    public static Connection getConnection() {
        return new Connection();
    }

    public static int getConnectionCount() {
        return connectionsCount;
    }
}

class ConnectionManager {
    private ConnectionManager() {
    }

    private static Connection[] connections = new Connection[10];
    private static int connectionsCount = 0;

    public static Connection getConnection() {
        if (connectionsCount < 10) {
            connections[connectionsCount] = Connection.getConnection();
            ++connectionsCount;
            return connections[connectionsCount - 1];
        } else {
            System.out.println("null");
            return null;
        }

    }
}

public class Test {
    public static void main(String[] args) {
        Connection con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();
        con = ConnectionManager.getConnection();

        System.out.println("Connections count = " + Connection.getConnectionCount());
    }
}

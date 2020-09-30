package org.softwire.training.bookish;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws SQLException {
        String hostname = "127.0.0.1";
        String database = "Library";
        String user = "root";
        String password = "bookish";
        String connectionString = "jdbc:mysql://" + hostname + "/" + database + "?user=" + user + "&password=" + password + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";

        jdbcMethod(connectionString);
        jdbiMethod(connectionString);
    }

    private static void jdbcMethod(String connectionString) throws SQLException {
        System.out.println("JDBC method...");

        // TODO: print out the details of all the books (using JDBC)
        // See this page for details: https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html

        Connection connection = DriverManager.getConnection(connectionString);
        String query = "SELECT BookName from Books ORDER BY BookName ASC";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String bookName = rs.getString("BookName");
                System.out.println(bookName);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void jdbiMethod(String connectionString) {
        System.out.println("\nJDBI method...");

        // TODO: print out the details of all the books (using JDBI)
        // See this page for details: http://jdbi.org
        // Use the "Book" class that we've created for you (in the models.database folder)

        Jdbi jdbi = Jdbi.create(connectionString);

        List<String> books = jdbi.withHandle(handle ->
                handle.createQuery("SELECT BookName from Books ORDER BY BookName ASC")
                        .mapTo(String.class)
                        .list());
        System.out.println(books);







//        try (Handle handle = jdbi.open()) {
//           List<String> Books = new ArrayList<>();
//           handle.execute("SELECT BookName from Books ORDER BY BookName ASC");
//           System.out.println(handle.execute("SELECT BookName from Books ORDER BY BookName ASC"));
//        }


    }
}

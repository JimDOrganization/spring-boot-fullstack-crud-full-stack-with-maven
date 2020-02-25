package com.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseFunctions {

    public void ConnectToDatabase()
    {
        String connectionUrl =
                "jdbc:sqlserver://yourserver.database.windows.net:1433;"
                        + "database=AdventureWorks;"
                        + "user=yourusername@yourserver;"
                        + "password=yourpassword;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=40;";
        String user = "sa";
        String pass = "test";
        Connection connection;
        try {
            connection = DriverManager.getConnection(connectionUrl, user, pass);
        }

        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

        try{
        // Create and execute a SELECT SQL statement.
        String selectSql = "SELECT TOP 10 Title, FirstName, LastName from SalesLT.Customer";
        ResultSet resultSet = null;

            Statement statement = connection.createStatement();


        resultSet = statement.executeQuery(selectSql);

        // Print results from select statement
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
        }
    }
        catch (SQLException e) {
        e.printStackTrace();
    }
    }
}

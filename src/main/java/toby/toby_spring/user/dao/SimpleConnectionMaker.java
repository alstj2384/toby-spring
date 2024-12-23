package toby.toby_spring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker implements ConnectionMaker{
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection c = DriverManager.getConnection(
                    "jdbc:mariadb://localhost/toby", "spring", "book");
            return c;
    }
}

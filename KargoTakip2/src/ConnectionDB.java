import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
private final String url = "jdbc:postgresql://localhost:5432/KargoTakip";
private final String user = "postgres";
private final String password = "admin";

public Connection connection() throws SQLException {

    return DriverManager.getConnection(url,user,password);
  }
}

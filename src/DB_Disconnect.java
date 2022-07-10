import java.sql.SQLException;

public class DB_Disconnect {
    static DB_Disconnect disconnect = new DB_Disconnect();
    public static void db_disconnect() throws SQLException {
        DB_Connect.getCon().close();
        DB_Connect.getStmt().close();
        DB_Connect.getRs().close();
    }
}

import java.sql.SQLException;

public class DB_Disconnect {
    static DB_Disconnect disconnect = new DB_Disconnect();
    public static void db_disconnect() throws SQLException {
        DB_srvINFO.getCon().close();
        DB_srvINFO.getStmt().close();
        DB_srvINFO.getRs().close();
    }
}

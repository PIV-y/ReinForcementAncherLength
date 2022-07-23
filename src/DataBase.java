import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public static void db_connect(String dbTbl, String Indx, String measure, String query2user){
        String query = "select * from " + dbTbl;
        try {
            DB_srvINFO.setCon(DriverManager.getConnection(DB_srvINFO.url, DB_srvINFO.user, DB_srvINFO.password));
            DB_srvINFO.setStmt(DB_srvINFO.getCon().createStatement());
            DB_srvINFO.setRs(DB_srvINFO.getStmt().executeQuery(query));
            System.out.println(query2user);
            while (DB_srvINFO.getRs().next()) {
                double id_Name = DB_srvINFO.getRs().getDouble(1);
                double parameter = DB_srvINFO.getRs().getDouble(2);
                System.out.println(Indx + id_Name + " = " + parameter + measure);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {DB_srvINFO.getCon().close();} catch (SQLException e) {e.printStackTrace();}
            try {DB_srvINFO.getStmt().close();} catch (SQLException e) {e.printStackTrace();}
            try {DB_srvINFO.getRs().close();} catch (SQLException e) {e.printStackTrace();}
        }
    }

    public static void db_fetch(String dbTbl, String id_Name) {
        String query = "select parameter from " + dbTbl + " where id_Name=" + id_Name;
        UserDataCollection userDataCollection = new UserDataCollection();

        try {
            DB_srvINFO.setCon(DriverManager.getConnection(DB_srvINFO.url, DB_srvINFO.user, DB_srvINFO.password));
            DB_srvINFO.setStmt(DB_srvINFO.getCon().createStatement());
            DB_srvINFO.setRs(DB_srvINFO.getStmt().executeQuery(query));

            while (DB_srvINFO.getRs().next()) {
                userDataCollection.Temp4Parameter = DB_srvINFO.getRs().getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {DB_srvINFO.getCon().close();} catch (SQLException e) {e.printStackTrace();}
            try {DB_srvINFO.getStmt().close();} catch (SQLException e) {e.printStackTrace();}
            try {DB_srvINFO.getRs().close();} catch (SQLException e) {e.printStackTrace();}
        }
    }
}

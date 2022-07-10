import java.sql.DriverManager;
import java.sql.SQLException;

public class DBqueryShowData {






        String query = "select id_NameConcrete, Rbt from concrete";
        try {
            DB_Connect.setCon(DriverManager.getConnection(DB_Connect.url, DB_Connect.user, DB_Connect.password));
            DB_Connect.setStmt(DB_Connect.getCon().createStatement());
            DB_Connect.setRs(DB_Connect.getStmt().executeQuery(query));
            while (DB_Connect.getRs().next()) {
                double id_NameConcrete = DB_Connect.getRs().getDouble(1);
                double Rbt = DB_Connect.getRs().getDouble(2);
                System.out.println("B" + id_NameConcrete + " = " + Rbt);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        DB_Disconnect.disconnect;

        return;
    }
}

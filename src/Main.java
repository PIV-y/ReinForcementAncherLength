import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    //JDBC URL, username and password of MySQL server
    public static final String url = "jdbc:mysql://localhost:3306/bd-test";
    public static final String user = "root";
    public static final String password = "root";

    //JDBC variable for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static Connection getCon() {
        return con;
    }
    public static void setCon(Connection con) {
        Main.con = con;
    }
    public static Statement getStmt() {
        return stmt;
    }
    public static void setStmt(Statement stmt) {
        Main.stmt = stmt;
    }
    public static ResultSet getRs() {
        return rs;
    }
    public static void setRs(ResultSet rs) {
        Main.rs = rs;
    }



    public static void main(String[] args) {
        System.out.println("Приступить к расчету длины анкеровки арматуры в бетон? y/n");
        Scanner console = new Scanner(System.in);
        String GoNoGo = console.nextLine() ; //Прием ответа о начале работы
        if (GoNoGo.equals("y"))
            Estimation.estimation();
        if (GoNoGo.equals("n"))
            System.out.println("Bye");
        else
            System.out.println("Buy");
    }
}
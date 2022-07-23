import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DataCollection {
    double diameterEst;
    double diameterFact;
    double RainforceType; //Арматурный профиль
    double ConcreteType; //Класс бетона
    double RainforceSectionAreaEst; //Расчетная площадь сечение арматуры
    double RainforcePerimeterSectionEst; //Длина окружности арматуры
    double LngthSectionAreaFact; //Фактическое сечение арматуры
    double WorkTypeKf; //коэффициент условии работы
    final double Pi = Math.PI;

    public void SetVal() {
/*
        Scanner console = new Scanner(System.in);
        System.out.println("Диаметр арматуры, см: ");
        diameterEst = console.nextInt(); //присвоение значения диаметра
*/
/*

        RainforceSectionAreaEst = 2 * Pi * (diameterEst / 2); //Расчетное сечение арматуры
        RainforcePerimeterSectionEst = Pi * (diameterEst / 2) * (diameterEst / 2); //Длина окружности расчетного сечения арматуры

        //"select id_NameConcrete, Rbt from concrete"
        System.out.println("Выберите номер используемой арматуры:");
        System.out.println("1 - фактическая, 2 - расчетная");
        Scanner console5 = new Scanner(System.in);
        int RnfrsmntFactEst = console5.nextInt();
        if (RnfrsmntFactEst == 1) {
            System.out.println("Фактический диаметр арматуры:");
            diameterFact = console5.nextInt();
            LngthSectionAreaFact = 2 * Pi * (diameterFact / 2);
        } else
            LngthSectionAreaFact = RainforceSectionAreaEst;

        System.out.println("Выбери класс бетонна:");
        try {
            String query = "select id_NameConcrete, Rbt from concrete";
            DB_srvINFO.setCon(DriverManager.getConnection(DB_srvINFO.url, DB_srvINFO.user, DB_srvINFO.password));
            DB_srvINFO.setStmt(DB_srvINFO.getCon().createStatement());
            DB_srvINFO.setRs(DB_srvINFO.getStmt().executeQuery(query));
            while (DB_srvINFO.getRs().next()) {
                double id_NameConcrete = DB_srvINFO.getRs().getDouble(1);
                double Rbt = DB_srvINFO.getRs().getDouble(2);
                System.out.println("B" + id_NameConcrete + " = " + Rbt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {DB_srvINFO.getCon().close();} catch (SQLException e) {e.printStackTrace();}
            try {DB_srvINFO.getStmt().close();} catch (SQLException e) {e.printStackTrace();}
            try {DB_srvINFO.getRs().close();} catch (SQLException e) {e.printStackTrace();}
        }


*/
/*
            Concrete.setValConcreteSpec();
        System.out.println("Список классов бетона:");
        for (String temp1 : Concrete.concretespec.keySet()) {
            Double temp2 = Concrete.concretespec.get(temp1);
            System.out.println(temp1 + " - " + temp2);
        }
        System.out.println("Выбери необходимый класс бетона из списка:");
        Scanner console2 = new Scanner(System.in);
        String TempCncrtTpe = console2.nextLine();
        ConcreteType = Concrete.concretespec.get(TempCncrtTpe); //присвоение значения бетона от заданного наименования
        System.out.println(ConcreteType); // ДЛЯ ПРОВЕРКИ. УДАЛИТЬ
*//*


        RainForcment.setValRainforcment();
        System.out.println("Список классов арматуры:");
        for (String temp1 : RainForcment.rainforcmentspec.keySet()) {
            Double temp2 = RainForcment.rainforcmentspec.get(temp1);
            System.out.println(temp1 + " - " + temp2);
        }
        System.out.println("Выбери необходимый класс арматуры из списка:");
        Scanner console3 = new Scanner(System.in);
        String TempRainfrcmntTpe = console3.nextLine();
        RainforceType = RainForcment.rainforcmentspec.get(TempRainfrcmntTpe);
        System.out.println(RainforceType); // ДЛЯ ПРОВЕРКИ. УДАЛИТЬ

        KfWorkType.kfworkSetType();
        System.out.println("тип работы стержня:");
        for (String temp1 : KfWorkType.kfWorkType.keySet()) {
            Double temp2 = KfWorkType.kfWorkType.get(temp1);
            System.out.println(temp1 + " - " + temp2);
        }
        System.out.println("Выбере необходимый класс арматуры из списка:");
        Scanner console4 = new Scanner(System.in);
        String TempWorkTypeKfTpe = console4.nextLine();
        WorkTypeKf = KfWorkType.kfWorkType.get(TempWorkTypeKfTpe); //присвоение значение коэф-та работы
        System.out.println(WorkTypeKf); // ДЛЯ ПРОВЕРКИ. УДАЛИТЬ

*/
    }
}
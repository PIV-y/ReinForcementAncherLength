import java.util.Scanner;

public class UserDataCollection {

    public static double ReinFrsDiameterEst;
    public static double ReinFrsDiameterFact;
    public static double Temp4Parameter;
    public static String IDreinforcement; //Наименование класса арматуры
    public static double ReinFrsClass; //Значение Rs арматуры по классу
    public static String IDconcrete; //Наименование класса бетона
    public static double ConcreteClass; //Значение Rbond бетона по классу
    public static double WorkTypeKf; //коэффициент условии работы
    public static String IDWorkTypeKf; //Наименование коэффициента работы

    public static void SetValReinFrsDiameterEst(){
        Scanner console = new Scanner(System.in);
        System.out.println("Диаметр расчетной арматуры, см: ");
        ReinFrsDiameterEst = console.nextDouble();
        System.out.println("d="+ReinFrsDiameterEst+"см");
        //присвоение значения диаметра расчетной арматуры
    }

    public static void SetValReinFrsDiameterFact(){
        Scanner console = new Scanner(System.in);
        System.out.println("Диаметр фактически применяемой арматуры, см: ");
        ReinFrsDiameterFact = console.nextDouble();
        System.out.println("d="+ReinFrsDiameterFact+"см");

        //присвоение значения диаметра фактически используемой арматуры
    }

    public static void SetValReinFrsClass(){
        Scanner console = new Scanner(System.in);
        String dbTbl = "reinforcement";
        String IndxParameter = "A";
        String measure = "MPa (Rs)";
        String query2user = "Выбери пункт с классом арматуры:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDreinforcement = console.next();
        DataBase.db_fetch(dbTbl, IDreinforcement);
        ReinFrsClass = Temp4Parameter;
        System.out.println("Rs = "+ReinFrsClass+" MPa");
    }

    public static void SetValConcreteClass(){
        Scanner console = new Scanner(System.in);
        String dbTbl = "concrete";
        String IndxParameter = "B";
        String measure = "MPa (Rbond)";
        String query2user = "Выбери пункт с классом бетонна:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDconcrete = console.next();
        DataBase.db_fetch(dbTbl, IDconcrete);
        ConcreteClass = Temp4Parameter;
        System.out.println("Rbond = "+ConcreteClass+" MPa");
    }

    public static void SetValWorkTypeKf(){
        Scanner console = new Scanner(System.in);
        String dbTbl = "kfworktype";
        String IndxParameter = "";
        String measure = "";
        String query2user = "Выберите пункт с типом работы арматуры в бетоне:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDWorkTypeKf = console.next();
        DataBase.db_fetch(dbTbl, IDWorkTypeKf);
        WorkTypeKf = Temp4Parameter;
        System.out.println("Kf = "+WorkTypeKf);
    }
}

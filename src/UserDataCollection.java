import java.util.Scanner;

public class UserDataCollection {

    double ReinFrsDiameterEst;
    double ReinFrsDiameterFact;
    public static double Temp4Parameter;
    String IDreinforcement; //Наименование класса арматуры
    double ReinFrsClass; //Значение Rs арматуры по классу
    String IDconcrete; //Наименование класса бетона
    double ConcreteClass; //Значение Rbond бетона по классу
    double WorkTypeKf; //коэффициент условии работы
    String IDWorkTypeKf; //Наименование коэффициента работы

    Scanner console = new Scanner(System.in);

    public void SetValReinFrsDiameterEst(){
        System.out.println("Диаметр расчетной арматуры, см: ");
        ReinFrsDiameterEst = console.nextInt();
        //присвоение значения диаметра расчетной арматуры
    }

    public void SetValReinFrsDiameterFact(){
        System.out.println("Диаметр фактически применяемой арматуры, см: ");
        ReinFrsDiameterFact = console.nextInt();
        //присвоение значения диаметра фактически используемой арматуры
    }

    public void SetValReinFrsClass(){
        String dbTbl = "reinforcement";
        String IndxParameter = "A";
        String measure = "MPa (Rs)";
        String query2user = "Выбери пункт с классом арматуры:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDreinforcement = console.next();
        DataBase.db_fetch(dbTbl, IDreinforcement);
        ReinFrsClass = Temp4Parameter;
        System.out.println(ReinFrsClass);
    }

    public void SetValConcreteClass(){
        String dbTbl = "concrete";
        String IndxParameter = "B";
        String measure = "MPa (Rbond)";
        String query2user = "Выбери пункт с классом бетонна:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDconcrete = console.next();
        DataBase.db_fetch(dbTbl, IDconcrete);
        ConcreteClass = Temp4Parameter;
        System.out.println(ConcreteClass);
    }

    public void SetValWorkTypeKf(){
        String dbTbl = "kfworktype";
        String IndxParameter = "";
        String measure = "";
        String query2user = "Выберите пункт с типом работы арматуры в бетоне:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDWorkTypeKf = console.next();
        DataBase.db_fetch(dbTbl, IDWorkTypeKf);
        WorkTypeKf = Temp4Parameter;
        System.out.println(WorkTypeKf);
    }
}

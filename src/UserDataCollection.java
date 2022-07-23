import java.util.Scanner;

public class UserDataCollection {
    double RainFrsDiameterEst;
    double RainFrsDiameterFact;
    double Temp4Parameter;
    String IDrainforcement; //Наименование класса арматуры
    double RainFrsClass; //Значение Rs арматуры по классу
    String IDconcrete; //Наименование класса бетона
    double ConcreteClass; //Значение Rbond бетона по классу
    double WorkTypeKf; //коэффициент условии работы

    Scanner console = new Scanner(System.in);

    public void SetValRainFrsDiameterEst(){
        System.out.println("Диаметр расчетной арматуры, см: ");
        RainFrsDiameterEst = console.nextInt();
        //присвоение значения диаметра расчетной арматуры
    }

    public void SetValRainFrsDiameterFact(){
        System.out.println("Диаметр фактически применяемой арматуры, см: ");
        RainFrsDiameterFact = console.nextInt();
        //присвоение значения диаметра фактически используемой арматуры
    }

    public void SetValRainFrsClass(){
        String dbTbl = "rainforcement";
        String IndxParameter = "A";
        String measure = "MPa (Rs)";
        String query2user = "Выбери класс арматуры:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDrainforcement = console.next();
        DataBase.db_fetch(dbTbl, IDrainforcement);
        RainFrsClass = Temp4Parameter;
        System.out.println(RainFrsClass);
    }

    public void SetValConcreteClass(){
        String dbTbl = "concrete";
        String IndxParameter = "B";
        String measure = "MPa (Rbond)";
        String query2user = "Выбери класс бетонна:";
        DataBase.db_connect(dbTbl, IndxParameter, measure, query2user);
        IDconcrete = console.next();
        DataBase.db_fetch(dbTbl, IDconcrete);
        System.out.println(ConcreteClass);
    }




    public void SetValWorkTypeKf(){

    }

}

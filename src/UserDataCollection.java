import java.util.Scanner;

public class UserDataCollection {
    double RainFrsDiameterEst;
    double RainFrsDiameterFact;
    double RainFrsClass; //Арматурный профиль
    double ConcreteClass; //Класс бетона
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
        DataBase.db_connect(dbTbl, IndxParameter, measure,query2user);
        String IDrainforcement = console.nextLine();
    //    DataBase.db_fetch(dbTbl, IDrainforcement);
    //    System.out.println(RainFrsClass);
    }


    public void SetValConcreteClass(){
/*
        String dbTbl = "concrete";
        String IndxParameter = "B";
        String measure = "MPa (Rbond)";
        UserDataCollection userDataCollection = new UserDataCollection();
        System.out.println("Выбери класс бетонна:");
        DataBase.db_connect(dbTbl, IndxParameter, measure);
*/
    }




    public void SetValWorkTypeKf(){

    }

}

import javax.xml.crypto.Data;

public class Estimation {
    public static double BaseAnchorLength;
    public static double MinAnchorLength;

    public static void main(String[] args) {
        UserDataCollection.SetValReinFrsDiameterEst(); //установка диаметра расчетной арматуры
        UserDataCollection.SetValReinFrsDiameterFact(); //установка диаметра фактической арматуры
        UserDataCollection.SetValReinFrsClass(); //установка класса арматуры
        UserDataCollection.SetValConcreteClass(); //установка класса бетона
        UserDataCollection.SetValWorkTypeKf(); //установка коэффициента условий работы
        EstDataCollection.SetValSectionPerimeter(); //подсчет длины окружности арматуры
        Calculation(); //выполнение расчета длины базовой анкеровки и минимальной
    }

    public static void Calculation(){
        BaseAnchorLength = (UserDataCollection.ReinFrsClass*EstDataCollection.ReinFrsSectionAreaEst) / (
                (2.5*UserDataCollection.ConcreteClass)*EstDataCollection.ReinFrsPerimeterSectionEst);
        MinAnchorLength = UserDataCollection.WorkTypeKf * BaseAnchorLength * (
                EstDataCollection.ReinFrsSectionAreaEst/EstDataCollection.ReinFrsSectionAreaFact);
        System.out.println("Минимальная длинна анкеровки: " + MinAnchorLength + "см");
    }
}

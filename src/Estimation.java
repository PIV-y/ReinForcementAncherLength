import javax.xml.crypto.Data;

public class Estimation {
    public static double BaseAnchorLength;
    public static double MinAnchorLength;

    public static void main(String[] args) {
        UserDataCollection.SetValReinFrsDiameterEst();
        UserDataCollection.SetValReinFrsDiameterFact();
        UserDataCollection.SetValReinFrsClass();
        UserDataCollection.SetValConcreteClass();
        UserDataCollection.SetValWorkTypeKf();
        EstDataCollection.SetValSectionPerimeter();
        Calculation();
    }

    public static void Calculation(){
        BaseAnchorLength = (UserDataCollection.ReinFrsClass*EstDataCollection.ReinFrsSectionAreaEst) / (
                (2.5*UserDataCollection.ConcreteClass)*EstDataCollection.ReinFrsPerimeterSectionEst);
        MinAnchorLength = UserDataCollection.WorkTypeKf * BaseAnchorLength * (
                EstDataCollection.ReinFrsSectionAreaEst/EstDataCollection.ReinFrsSectionAreaFact);
        System.out.println("Минимальная длинна анкеровки: " + MinAnchorLength + "см");
    }
}

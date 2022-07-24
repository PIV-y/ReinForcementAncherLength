import javax.xml.crypto.Data;

public class Estimation {
    public static void main(String[] args) {

        UserDataCollection.SetValReinFrsDiameterEst();
        UserDataCollection.SetValReinFrsDiameterFact();
        UserDataCollection.SetValReinFrsClass();
        UserDataCollection.SetValConcreteClass();
        UserDataCollection.SetValWorkTypeKf();
        EstDataCollection.SetValSectionPerimeter();

/*
        double BaseAnchorLength;
        double MinAnchorLength;
        DataCollection Data = new DataCollection();
        Data.SetVal();

        BaseAnchorLength = (Data.ReinforceType*Data.ReinforceSectionAreaEst) / (
                (2.5*Data.ConcreteType) * Data.ReinforcePerimeterSectionEst);
        MinAnchorLength = Data.WorkTypeKf * BaseAnchorLength * (Data.ReinforceSectionAreaEst/Data.LngthSectionAreaFact);
        System.out.println("Длинна анкеровки: " + MinAnchorLength + "мм");
*/
    }
}

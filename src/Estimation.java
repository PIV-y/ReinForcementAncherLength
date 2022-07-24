import javax.xml.crypto.Data;

public class Estimation {
    public static void main(String[] args) {
        UserDataCollection userDataCollection = new UserDataCollection();

        userDataCollection.SetValReinFrsDiameterEst();
        userDataCollection.SetValReinFrsDiameterFact();
        userDataCollection.SetValReinFrsClass();
        userDataCollection.SetValConcreteClass();
        userDataCollection.SetValWorkTypeKf();
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

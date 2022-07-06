import javax.xml.crypto.Data;

public class Estimation {
    public static void estimation(){
        double BaseAnchorLength;
        double MinAnchorLength;
        DataCollection Data = new DataCollection();
        Data.SetVal();

        BaseAnchorLength = (Data.RainforceType*Data.RainforceSectionAreaEst) / (
                (2.5*Data.ConcreteType) * Data.RainforcePerimeterSectionEst);
        MinAnchorLength = Data.WorkTypeKf * BaseAnchorLength * (Data.RainforceSectionAreaEst/Data.LngthSectionAreaFact);
        System.out.println("Длинна анкеровки: " + MinAnchorLength + "мм");
    }
}

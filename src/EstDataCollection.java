public class EstDataCollection {
    public static double ReinFrsSectionAreaEst; //Расчетная площадь сечения арматуры
    public static double ReinFrsSectionAreaFact; //Фактическое площадь сечения арматуры
    public static double ReinFrsPerimeterSectionEst; //Длина окружности арматуры (Us)

    public static double ReinFrsSectionRadiusAreaEst = UserDataCollection.ReinFrsDiameterEst/2;
    public static double ReinFrsSectionRadiusAreaFact = UserDataCollection.ReinFrsDiameterFact/2;

    public static void SetValSectionPerimeter (){
        ReinFrsSectionAreaEst = Math.PI*(ReinFrsSectionRadiusAreaEst*ReinFrsSectionRadiusAreaEst); //A=pi*r^2
        ReinFrsSectionAreaFact = Math.PI*(ReinFrsSectionRadiusAreaFact*ReinFrsSectionRadiusAreaFact); //A=pi*r^2
        ReinFrsPerimeterSectionEst = 2 * Math.PI * ReinFrsSectionRadiusAreaEst; //P=2*pi*R

        System.out.println("Площадь сечения расчетной арматуры S(est)="+ (int)ReinFrsSectionAreaEst+"см2");
        System.out.println("Площадь сечения фактической арматуры S(est)="+ (int)ReinFrsSectionAreaFact+"см2");
        System.out.println("Периметр сечения расчетной арматуры Us(est)="+ (int)ReinFrsPerimeterSectionEst+"см");
    }
}

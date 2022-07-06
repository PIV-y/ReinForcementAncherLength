import java.util.HashMap;

public class Concrete {
    public static HashMap<String, Double> concretespec = new HashMap<>();

    public static void setValConcreteSpec() {
        concretespec.put("B30", 12.00); //прочность на растяжение дана в кг/см2
        concretespec.put("B25", 11.00); //прочность на растяжение дана в кг/см2
        concretespec.put("B20", 10.00); //прочность на растяжение дана в кг/см2
        concretespec.put("B15", 8.80); //прочность на растяжение дана в кг/см2
        concretespec.put("B10", 7.50); //прочность на растяжение дана в кг/см2
    }
}
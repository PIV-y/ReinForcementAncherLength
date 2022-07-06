import java.util.HashMap;

public class RainForcment {
    public static HashMap<String, Double> rainforcmentspec = new HashMap<>();

    public static void setValRainforcment() {
        rainforcmentspec.put("A240", 2140.67); //прочность на растяжение дана в кг/см2
        rainforcmentspec.put("A400", 3567.78); //прочность на растяжение дана в кг/см2
        rainforcmentspec.put("A500", 4434.25); //прочность на растяжение дана в кг/см2
    }
}

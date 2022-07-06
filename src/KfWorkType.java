import java.util.HashMap;

public class KfWorkType {
    public static HashMap<String,Double> kfWorkType = new HashMap<>();

    public static void kfworkSetType() {
        kfWorkType.put("сжатые", 0.75);
        kfWorkType.put("растянутые", 1.00);
        kfWorkType.put("напрягаемая", 1.00);
    }
}

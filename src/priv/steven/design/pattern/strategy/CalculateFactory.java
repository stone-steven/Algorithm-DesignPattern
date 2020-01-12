package priv.steven.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author steven
 * @date 2020/1/12
 */
public class CalculateFactory {

    private static Map<String,Calculate> CALCULATE_MAP = new HashMap<>();

    static {
        CALCULATE_MAP.put(CalculateKey.ADD.getKey(),new AddCalculate());
        CALCULATE_MAP.put(CalculateKey.SUB.getKey(),new SubtractCalculate());
    }

    public static Calculate getCalculateStrategy(String key){
        return CALCULATE_MAP.get(key);
    }

}

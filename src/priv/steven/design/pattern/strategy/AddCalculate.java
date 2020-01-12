package priv.steven.design.pattern.strategy;

/**
 * @author steven
 * @date 2020/1/12
 */
public class AddCalculate implements Calculate {


    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

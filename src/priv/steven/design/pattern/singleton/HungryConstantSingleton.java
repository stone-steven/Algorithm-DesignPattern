package priv.steven.design.pattern.singleton;

/**
 * @author steven
 * date 2020-01-04
 */
public class HungryConstantSingleton {

    private static final HungryConstantSingleton SINGLETON = new HungryConstantSingleton();

    private HungryConstantSingleton() {}

    public static HungryConstantSingleton getInstance(){
        return SINGLETON;
    }
}

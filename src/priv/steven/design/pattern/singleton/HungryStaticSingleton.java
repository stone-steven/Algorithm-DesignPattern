package priv.steven.design.pattern.singleton;

/**
 * @author steven
 * date 2020-01-04
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton SINGLETON;

    static {
        SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance(){
        return SINGLETON;
    }
}

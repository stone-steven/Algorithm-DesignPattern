package priv.steven.design.pattern.singleton;

/**
 * @author steven
 * date 2020-01-04
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance(){

        if (singleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (singleton == null){
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}

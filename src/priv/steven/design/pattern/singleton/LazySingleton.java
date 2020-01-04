package priv.steven.design.pattern.singleton;

/**
 * @author steven
 * date 2020-01-04
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    public synchronized static LazySingleton getInstance(){

        if (null == singleton){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

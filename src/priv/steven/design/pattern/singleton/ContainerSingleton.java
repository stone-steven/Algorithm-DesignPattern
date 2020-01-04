package priv.steven.design.pattern.singleton;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author steven
 * date 2020-01-04
 */
public class ContainerSingleton {

    private static final Map<String,Object> container = new ConcurrentHashMap<>();

    private ContainerSingleton() {}

    public static Object getInstance(String className){
        synchronized (container){
            if (!container.containsKey(className)){
                Object instance = null;

                try {
                    instance = Class.forName(className).getDeclaredConstructor().newInstance();
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                container.put(className,instance);
                return instance;
            }else {
                return container.get(className);
            }
        }
    }
}

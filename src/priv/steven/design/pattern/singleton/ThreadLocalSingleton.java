package priv.steven.design.pattern.singleton;

/**
 * @author steven
 * date 2020-01-04
 */

/**
 * 每个线程是单例的
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> instance = new ThreadLocal<>(){

        @Override
        public ThreadLocalSingleton get() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}

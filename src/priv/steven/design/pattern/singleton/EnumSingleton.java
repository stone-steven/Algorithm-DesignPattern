package priv.steven.design.pattern.singleton;

/**
 * @author steven
 * date 2020-01-04
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object singleton;

    public void setSingleton(Object singleton){
        this.singleton = singleton;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}

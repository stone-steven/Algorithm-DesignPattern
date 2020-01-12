package priv.steven.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author steven
 * @date 2020/1/12
 */
public class HouseProxy implements InvocationHandler {

    private Object object;

    public Object getProxyObject(Object o){

        this.object = o;
        Class<?> clazz = o.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(object,args);
        after();
        return o;
    }

    private void before(){
        System.out.println("get requirements");
    }

    private void after(){
        System.out.println("found it");
    }
}

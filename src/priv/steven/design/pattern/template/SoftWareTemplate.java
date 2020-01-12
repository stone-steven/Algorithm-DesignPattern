package priv.steven.design.pattern.template;

/**
 * @author steven
 * @date 2020/1/12
 */
public abstract class SoftWareTemplate {


    private void open(){
        System.out.println("open software");
    }

    private void close(){
        System.out.println("close software");
    }

    abstract void use();

    protected void useSoftware(){

        open();
        use();
        close();
    }

}

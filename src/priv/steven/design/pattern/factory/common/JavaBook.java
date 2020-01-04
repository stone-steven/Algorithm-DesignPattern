package priv.steven.design.pattern.factory.common;

import priv.steven.design.pattern.factory.common.Book;

/**
 * @author steven
 * date 2020-01-04
 */
public class JavaBook implements Book {
    @Override
    public void read() {
        System.out.println("java book");
    }
}

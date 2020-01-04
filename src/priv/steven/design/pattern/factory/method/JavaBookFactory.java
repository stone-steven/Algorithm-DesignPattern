package priv.steven.design.pattern.factory.method;

import priv.steven.design.pattern.factory.common.Book;
import priv.steven.design.pattern.factory.common.JavaBook;

/**
 * @author steven
 * date 2020-01-04
 */
public class JavaBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return new JavaBook();
    }
}

package priv.steven.design.pattern.factory.simple;

import priv.steven.design.pattern.factory.common.Book;
import priv.steven.design.pattern.factory.common.JavaBook;
import priv.steven.design.pattern.factory.common.PythonBook;

/**
 * @author steven
 * date 2020-01-04
 */
public class SimpleBookFactory {

    public Book create(String bookName){

        if ("java".equals(bookName)){
            return new JavaBook();
        }else if ("python".equals(bookName)){
            return new PythonBook();
        }else {
            return null;
        }
    }
}

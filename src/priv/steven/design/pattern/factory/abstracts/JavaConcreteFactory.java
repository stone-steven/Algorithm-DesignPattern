package priv.steven.design.pattern.factory.abstracts;

import priv.steven.design.pattern.factory.common.Book;
import priv.steven.design.pattern.factory.common.JavaBook;
import priv.steven.design.pattern.factory.common.JavaNote;
import priv.steven.design.pattern.factory.common.Note;

/**
 * @author steven
 * date 2020-01-04
 */
public class JavaConcreteFactory implements AbstractFactory{


    @Override
    public Book createBook() {
        return new JavaBook();
    }

    @Override
    public Note createNote() {
        return new JavaNote();
    }
}

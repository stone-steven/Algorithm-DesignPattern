package priv.steven.design.pattern.factory.abstracts;

import priv.steven.design.pattern.factory.common.Book;
import priv.steven.design.pattern.factory.common.Note;
import priv.steven.design.pattern.factory.common.PythonBook;
import priv.steven.design.pattern.factory.common.PythonNote;

/**
 * @author steven
 * date 2020-01-04
 */
public class PythonConcreteFactory implements AbstractFactory{
    @Override
    public Book createBook() {
        return new PythonBook();
    }

    @Override
    public Note createNote() {
        return new PythonNote();
    }
}

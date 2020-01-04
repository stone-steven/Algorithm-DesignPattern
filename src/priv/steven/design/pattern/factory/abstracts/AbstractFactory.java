package priv.steven.design.pattern.factory.abstracts;

import priv.steven.design.pattern.factory.common.Book;
import priv.steven.design.pattern.factory.common.Note;

/**
 * @author steven
 * date 2020-01-04
 */
public interface AbstractFactory {

    Book createBook();

    Note createNote();
}

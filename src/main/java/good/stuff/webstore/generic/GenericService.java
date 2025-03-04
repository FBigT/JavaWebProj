package good.stuff.webstore.generic;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, I> {
    T create(T entity);

    List<T> getAll();

    Optional<T> getById(I id);

    T update(I id, T entity);

    void delete(I id);
}

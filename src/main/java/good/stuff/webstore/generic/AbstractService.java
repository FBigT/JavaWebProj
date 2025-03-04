package good.stuff.webstore.generic;

import good.stuff.webstore.utils.EntityUtils;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T, I, R extends CrudRepository<T, I>> implements GenericService<T, I> {

    protected final R repository;

    protected AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public List<T> getAll() {
        return (List<T>) repository.findAll();
    }

    @Override
    public Optional<T> getById(I id) {
        return repository.findById(id);
    }

    @Override
    public T update(I id, T updatedEntity) {
        return repository.findById(id)
                .map(existingEntity -> {
                    EntityUtils.copyNonNullProperties(updatedEntity, existingEntity);
                    return repository.save(existingEntity);
                })
                .orElseThrow(() -> new RuntimeException("Entity not found"));
    }

    @Override
    public void delete(I id) {
        repository.deleteById(id);
    }
}

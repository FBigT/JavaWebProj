package good.stuff.webstore.generic;

import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class AbstractController<T, I, S extends GenericService<T, I>> implements GenericController<T, I> {

    protected final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<T> create(T entity) {
        T createdEntity = service.create(entity);
        return ResponseEntity.ok(createdEntity);
    }

    @Override
    public ResponseEntity<List<T>> getAll() {
        List<T> entities = service.getAll();
        return ResponseEntity.ok(entities);
    }

    @Override
    public ResponseEntity<T> getById(I id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<T> update(I id, T updatedEntity) {
        T updatedEntityResult = service.update(id, updatedEntity);
        return ResponseEntity.ok(updatedEntityResult);
    }

    @Override
    public ResponseEntity<Void> delete(I id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
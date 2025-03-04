package good.stuff.webstore.generic;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface GenericController<T, I> {

    @PostMapping
    ResponseEntity<T> create(@RequestBody T entity);

    @GetMapping
    ResponseEntity<List<T>> getAll();

    @GetMapping("/{id}")
    ResponseEntity<T> getById(@PathVariable I id);

    @PutMapping("/{id}")
    ResponseEntity<T> update(@PathVariable I id, @RequestBody T updatedEntity);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable I id);
}

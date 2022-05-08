package canhnguyen.md4tinytest3.repository;

import canhnguyen.md4tinytest3.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends CrudRepository<Category, Long> {
}

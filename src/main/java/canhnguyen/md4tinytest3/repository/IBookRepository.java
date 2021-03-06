package canhnguyen.md4tinytest3.repository;

import canhnguyen.md4tinytest3.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends CrudRepository<Book, Long> {

}

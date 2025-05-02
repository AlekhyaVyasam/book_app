package javaguides.bookapp.demo.repository;

import javaguides.bookapp.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
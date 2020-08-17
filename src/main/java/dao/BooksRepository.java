package dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Books;


public interface BooksRepository extends CrudRepository<Books,Integer>{

	

}

package REST.Assignments.REST.Q9;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends CrudRepository<Customer, Long>{
	
}
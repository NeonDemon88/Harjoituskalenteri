package projekti.harkkakalenteri.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RehearsalRepo extends CrudRepository<Rehearsal, Long> {
	
	    List<Rehearsal> findById(Long id);

}

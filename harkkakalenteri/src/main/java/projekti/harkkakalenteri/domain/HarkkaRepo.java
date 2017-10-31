package projekti.harkkakalenteri.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HarkkaRepo extends CrudRepository<Harkka, Long> {
	
	    List<Harkka> findById(Long id);

}

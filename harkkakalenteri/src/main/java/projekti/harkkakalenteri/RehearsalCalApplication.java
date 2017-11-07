package projekti.harkkakalenteri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import projekti.harkkakalenteri.domain.Rehearsal;
import projekti.harkkakalenteri.domain.RehearsalRepo;
import projekti.harkkakalenteri.domain.User;
import projekti.harkkakalenteri.domain.UserRepository;

@SpringBootApplication
public class RehearsalCalApplication {

	private static final Logger log = LoggerFactory.getLogger(RehearsalCalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RehearsalCalApplication.class, args);
	}

	@Bean
	public CommandLineRunner cmdRunner(RehearsalRepo rep, UserRepository urep) { 
		return (args) -> {
			log.info("put testmaterial to the repository");
			rep.save(new Rehearsal("Säihkisharkat", "23.11.2017", "18:00", "Valhalla", "Love Like You, Cruel Angel's Thesis, Totoro, Reiska, Termari."));
			rep.save(new Rehearsal("Doctor Who- harkat", "11.12.2017", "16:00", "Toimela", "Kaikki"));
			rep.save(new Rehearsal("Star Wars- harkat", "18.12.2017", "18:00", "Valhalla", "Still Alive, So Long, Cruel Angel, I Am the One , Perfect Day , The Children, Hoist the Colours."));

			log.info("get all rehearsals");
			for (Rehearsal rehearsalList : rep.findAll()) {
				log.info(rehearsalList.toString());
			}
			
			User user = new User("user", "$2a$08$wQLf2jfDNAHw.LKNsXTJHOPla2Q1SawYVpG0MjK2EMGXDj9bBxka2", "user@gmail.com", "USER"); //kayttaja
//			User user2 = new User("admin", "$2a$10$3mQSL/XJIzmc0P24/gatcODqMD9fgQ5m2h/CRTvu9OSYkm24kKxZK", "admin@gmail.com", "ADMIN"); // yllapitaja
			urep.save(user);
//			urep.save(user2);
			

		};
	}
}

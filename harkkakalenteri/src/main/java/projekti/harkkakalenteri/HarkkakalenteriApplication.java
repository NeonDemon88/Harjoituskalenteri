package projekti.harkkakalenteri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import projekti.harkkakalenteri.domain.Harkka;
import projekti.harkkakalenteri.domain.HarkkaRepo;

@SpringBootApplication
public class HarkkakalenteriApplication {

	private static final Logger log = LoggerFactory.getLogger(HarkkakalenteriApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HarkkakalenteriApplication.class, args);
	}

	@Bean
	public CommandLineRunner cmdRunner(HarkkaRepo rep) { //UserRepository urep
		return (args) -> {
			log.info("testimateriaali: ");
			rep.save(new Harkka("Säihkisharkat", "23.11.2017", "18:00", "Valhalla", "Love Like You, Cruel Angel's Thesis, Totoro, Reiska, Termari."));
			rep.save(new Harkka("Doctor Who- harkat", "11.12.2017", "16:00", "Toimela", "Kaikki"));
			rep.save(new Harkka("Star Wars- harkat", "18.12.2017", "18:00", "Valhalla", "Still Alive, So Long, Cruel Angel, I Am the One , Perfect Day , The Children, Hoist the Colours."));

			log.info("hae kaikki harkat");
			for (Harkka harkkalista : rep.findAll()) {
				log.info(harkkalista.toString());
			}
			
//			User user1 = new User("user", "$2a$08$wQLf2jfDNAHw.LKNsXTJHOPla2Q1SawYVpG0MjK2EMGXDj9bBxka2", "user@gmail.com", "USER"); //kayttaja
//			User user2 = new User("admin", "$2a$10$3mQSL/XJIzmc0P24/gatcODqMD9fgQ5m2h/CRTvu9OSYkm24kKxZK", "admin@gmail.com", "ADMIN"); // yllapitaja
//			urep.save(user1);
//			urep.save(user2);
			

		};
	}
}

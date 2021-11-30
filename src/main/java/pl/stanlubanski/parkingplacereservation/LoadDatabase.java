package pl.stanlubanski.parkingplacereservation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ReservationRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Reservation("Leo Messi", 10, 2,
                    "no")));
            log.info("Preloading " + repository.save(new Reservation("Robert Lewandowski", 12, 1,
                    "no")));
        };
    }
}

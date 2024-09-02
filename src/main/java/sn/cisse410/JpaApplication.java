package sn.cisse410;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sn.cisse410.models.Author;
import sn.cisse410.repositories.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
		return args -> {
			var author = Author.builder()
					.firstName("Khady")
					.lastName("SAMB")
					.age(22)
					.email("khady.samb@dev.sn")
					.build();
			authorRepository.save(author);
		};
	}

}

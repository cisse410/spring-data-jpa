package sn.cisse410.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.cisse410.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}

package edu.learning.mil.dao;

import edu.learning.mil.domain.PersonRank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRankRepository extends JpaRepository<PersonRank, Long> {
}

package edu.learning.mil.dao;

import edu.learning.mil.domain.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}

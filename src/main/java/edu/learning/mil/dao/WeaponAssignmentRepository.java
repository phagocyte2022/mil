package edu.learning.mil.dao;

import edu.learning.mil.domain.WeaponAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponAssignmentRepository extends JpaRepository<WeaponAssignment, Long> {
}

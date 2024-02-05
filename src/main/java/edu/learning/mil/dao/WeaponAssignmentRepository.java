package edu.learning.mil.dao;

import edu.learning.mil.domain.WeaponAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeaponAssignmentRepository extends JpaRepository<WeaponAssignment, Long> {
    List<WeaponAssignment> findByPersonId(Long personId);

}

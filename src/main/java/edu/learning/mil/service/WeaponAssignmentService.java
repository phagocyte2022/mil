package edu.learning.mil.service;

import edu.learning.mil.dao.WeaponAssignmentRepository;
import edu.learning.mil.domain.WeaponAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeaponAssignmentService {

    @Autowired

    private WeaponAssignmentRepository weaponAssignmentRepository;

    public List<WeaponAssignment> getAllWeaponsAssigned() {
        return weaponAssignmentRepository.findAll();
    }

    public WeaponAssignment assignWeapon(WeaponAssignment newWeaponAssignment) {
        return weaponAssignmentRepository.save(newWeaponAssignment);
    }
}

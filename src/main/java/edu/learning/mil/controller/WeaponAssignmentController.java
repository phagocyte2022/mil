package edu.learning.mil.controller;

import edu.learning.mil.domain.WeaponAssignment;
import edu.learning.mil.service.WeaponAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mil")
public class WeaponAssignmentController {

    @Autowired
    private WeaponAssignmentService weaponAssignmentService;

    @GetMapping("/weaponassignment/list")
    public List<WeaponAssignment> getAllWeaponsAssigned(){
        return weaponAssignmentService.getAllWeaponsAssigned();

    }

    @PostMapping("/weaponassignment/create")
    public WeaponAssignment assignWeapon(@RequestBody WeaponAssignment weaponAssignment) {
        return weaponAssignmentService.assignWeapon(weaponAssignment);
    }
}

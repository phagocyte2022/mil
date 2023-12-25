package edu.learning.mil.controller;

import edu.learning.mil.domain.Weapon;
import edu.learning.mil.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mil")
public class WeaponController {

    @Autowired
    private WeaponService weaponService;

    @GetMapping("/weapon/{id}")
    public Weapon getWeaponById(@PathVariable(name = "id") Long id) throws Exception {
        return weaponService.getWeaponById(id);
    }

    @GetMapping("/weapon/list")
    public List<Weapon> getAllWeapons(){
        return weaponService.getAllWeapons();
    }

    @PostMapping("/weapon/create")
    public Weapon createWeapon(@RequestBody Weapon newWeapon){
        return weaponService.createWeapon(newWeapon);
    }

}

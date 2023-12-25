package edu.learning.mil.service;

import edu.learning.mil.dao.WeaponRepository;
import edu.learning.mil.domain.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponService {
    @Autowired
    private WeaponRepository weaponRepository;

    public Weapon getWeaponById(Long id) throws Exception {
        return weaponRepository.findById(id)
                .orElseThrow(() -> new Exception("Weapon not found with id: " + id));

    }

    public Weapon createWeapon(Weapon newWeapon) {
        return weaponRepository.save(newWeapon);
    }


    public List<Weapon> getAllWeapons() {
        return weaponRepository.findAll();
    }
}

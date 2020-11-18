package wh40k.furen.services;

import java.util.List;

import wh40k.furen.models.Weapon;

public interface WeaponService {

	List<Weapon> getAllWeapons();

	List<Weapon> getWeaponsByUnitId(Long unitId);

	boolean addNewWeapon(Weapon weapon);

	void remove(Long weaponId);

}

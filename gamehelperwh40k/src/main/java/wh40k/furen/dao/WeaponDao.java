package wh40k.furen.dao;

import java.util.List;

import wh40k.furen.models.Weapon;

public interface WeaponDao {
	
	List<Weapon> getAllWeapons();

	List<Weapon> getWeaponsByUnitId(Long unitId);

	boolean addNewWeapon(Weapon weapon);

	boolean remove(Long weaponId);

}

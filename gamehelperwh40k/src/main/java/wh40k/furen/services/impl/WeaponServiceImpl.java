package wh40k.furen.services.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import wh40k.furen.dao.WeaponDao;
import wh40k.furen.exceptions.ApplicationException;
import wh40k.furen.models.Weapon;
import wh40k.furen.services.WeaponService;
import wh40k.furen.utils.ConnectionUtils;

public class WeaponServiceImpl implements WeaponService {

	private final DataSource dataSource;
	private final WeaponDao weaponDao;

	public WeaponServiceImpl(DataSource dataSource, WeaponDao weaponDao) {
		this.dataSource = dataSource;
		this.weaponDao = weaponDao;
	}

	@Override
	public List<Weapon> getAllWeapons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Weapon> getWeaponsByUnitId(Long unitId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNewWeapon(Weapon weapon) {
		// поля собираютя в модель в контреллере
		try {
			Connection connection = dataSource.getConnection();
			ConnectionUtils.setConnection(connection);
			weaponDao.addNewWeapon(weapon);
		} catch (SQLException e) {
			throw new ApplicationException("New weapon dont added", e);
		}
		return true;

	}

	@Override
	public void remove(Long weaponId) {
		// TODO Auto-generated method stub

	}

}

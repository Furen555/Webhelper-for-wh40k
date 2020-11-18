package wh40k.furen.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import wh40k.furen.dao.WeaponDao;
import wh40k.furen.exceptions.ApplicationException;
import wh40k.furen.models.Weapon;
import wh40k.furen.utils.ConnectionUtils;

public class WeaponDaoImpl implements WeaponDao {
	private final QueryRunner queryRunner = new QueryRunner();

	@Override
	public List<Weapon> getAllWeapons() {

		return null;
	}

	@Override
	public List<Weapon> getWeaponsByUnitId(Long unitId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNewWeapon(Weapon weapon) {// пилю этот метод(доделать часть с sql и провреить резалт сет
												// хендлер-если делать через метод update то RS не нужен, протестить это
												// и так использовать)
		Connection connection = ConnectionUtils.getConnection();
		try {
			queryRunner.update(connection, "INSERT INTO weapon VALUES (nextval('seq_id_weapon'),?,?,?,?,?,?,?,?)",
					weapon.getName(), weapon.getRange(), weapon.getType(), weapon.getS(), weapon.getAp(), weapon.getD(),
					weapon.getAbilitys(), weapon.getFraction());
		} catch (SQLException e) {
			throw new ApplicationException("Som problems with add new weapon", e);
		}

		return true;
	}

	@Override
	public boolean remove(Long weaponId) {
		// TODO Auto-generated method stub
		return false;
	}

}

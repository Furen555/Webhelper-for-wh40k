package wh40k.furen.context;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.lang3.math.Fraction;

import wh40k.furen.Constants;
import wh40k.furen.dao.AccountDao;
import wh40k.furen.dao.ResultDao;
import wh40k.furen.dao.WeaponDao;
import wh40k.furen.dao.impl.AccountDaoImpl;
import wh40k.furen.dao.impl.ResultDaoImpl;
import wh40k.furen.dao.impl.WeaponDaoImpl;
import wh40k.furen.services.CommonService;
import wh40k.furen.services.UserService;
import wh40k.furen.services.WeaponService;
import wh40k.furen.services.impl.CommonServiceImpl;
import wh40k.furen.services.impl.UserServiceImpl;
import wh40k.furen.services.impl.WeaponServiceImpl;

public final class ApplicationContext {
	public static final String APP_CONTEXT = "APP_CONTEXT";

	private final BasicDataSource dataSource;

	private final CommonService commonService;
	private final UserService userService;
	private final WeaponService weaponService;

	private final AccountDao accountDao;
	private final ResultDao resultDao;
	private final WeaponDao weaponDao;

	public DataSource getDataSource() {
		return dataSource;
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public UserService getUserService() {
		return userService;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public ResultDao getResultDao() {
		return resultDao;
	}

	public WeaponService getWeaponService() {
		return weaponService;
	}

	public WeaponDao getWeaponDao() {
		return weaponDao;
	}

	public static ApplicationContext getApplicationContext(ServletContext sc) {
		ApplicationContext context = (ApplicationContext) sc.getAttribute(APP_CONTEXT);
		if (context == null) {
			context = new ApplicationContext();
			sc.setAttribute(APP_CONTEXT, context);

		}
		return context;
	}

	public void ShutDown() {
		try {
			dataSource.close();
		} catch (Exception e) {

		}
	}

	private ApplicationContext() {
		dataSource = buildDataSource();
		accountDao = new AccountDaoImpl();
		resultDao = new ResultDaoImpl();
		weaponDao= new WeaponDaoImpl();
		
		commonService = new CommonServiceImpl(dataSource, accountDao);
		userService = new UserServiceImpl(dataSource, accountDao, resultDao);
		weaponService= new WeaponServiceImpl(dataSource, weaponDao);

	}

	private BasicDataSource buildDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/webhelper40k");
		ds.setUsername("admin");
		ds.setPassword("admin");
		ds.setInitialSize(5);
		ds.setMaxTotal(20);

		return ds;
	}

}

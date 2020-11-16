package wh40k.furen.utils;

import java.sql.Connection;

public final class ConnectionUtils {

	private static final ThreadLocal<Connection> connections = new ThreadLocal<Connection>();

	private ConnectionUtils() {
	}

	public static Connection getConnection() {
		return connections.get();
	}

	public static void setConnection(Connection connection) {
		connections.set(connection);

	}

	public static void cleanConnection() {
		connections.remove();
	}
}

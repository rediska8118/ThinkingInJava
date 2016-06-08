package ex08;

public class ConnectionManager {

	static int numberOfConnections = 0;

	static Connection getConnection() {
		if (numberOfConnections < 10) {
			numberOfConnections++;
			return Connection.createConnection();
		}

		return null;
	}
}

package ex08;

public class Connection {

	private Connection() {
		System.out.println("Connection constructor");
	}

	static Connection createConnection() {
		return new Connection();
	}
}

package week3.day2;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Database Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Database Disconnected");
	}

	@Override
	public void execute() {
		System.out.println("Database is executing");
	}
public static void main(String[] args) {
	DatabaseConnection db = new JavaConnection();
	db.connect();
	db.disconnect();
	db.execute();
}
}

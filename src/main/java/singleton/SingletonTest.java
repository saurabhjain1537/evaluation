package singleton;

public class SingletonTest {

	private static SingletonTest _instance;
	
	private SingletonTest() {
	}

	public static synchronized SingletonTest getInstance() {
		if (_instance == null) {
			_instance = new SingletonTest();
		}
		return _instance;
	}
}
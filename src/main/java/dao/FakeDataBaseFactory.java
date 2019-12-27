package dao;

public class FakeDataBaseFactory {
	
	private static FakeDataBase fakeDataBase;
	
	private static void initFakeDataBase() {
		fakeDataBase = new FakeDataBaseImpl();
	}
	
 	static public FakeDataBase getFakeDataBase() {
		if(fakeDataBase == null) {
			initFakeDataBase();
		}
		return fakeDataBase;
	}

}

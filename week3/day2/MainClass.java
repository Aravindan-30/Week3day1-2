package week3.day2;

public class MainClass {

	public static void main(String[] args) {
		//creating object
		TestData TD = new TestData();
		TD.enterCredentials();
		TD.navigateToHomePage();
		LoginTestData LTD = new LoginTestData();
		LTD.enterUsername();
		LTD.enterPassword();
		//calling methods
		LTD.enterCredentials();
		LTD.navigateToHomePage();

	}

}

import org.testng.annotations.Test;

import com.demo.pages.BasePage;
import com.demo.pages.LoginPage;

public class LoginTest extends BasePage{

	LoginPage loginPage;
	
	@Test
	public void loginFunctionality() {
		loginPage = new LoginPage(driver);
		
		loginPage.clickonLoginLink();
		loginPage.enterEmail();
		loginPage.enterPass();

	}
}

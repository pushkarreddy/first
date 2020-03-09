package org.amazon.testscripts;
import org.testng.annotations.Test;

import com.org.amazon.page.LoginPage;
import com.org.amazonbase.BaseClass;

public class TestScripts extends BaseClass {
	@Test()
	public void logintest() throws Exception {
	LoginPage lp = new LoginPage();
	lp.login();
	}
}

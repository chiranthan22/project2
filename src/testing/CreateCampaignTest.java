package testing;

import org.testng.annotations.Test;

public class CreateCampaignTest {
	
	@Test
	public void createCampaignTest()
	{
		String URL = System.getProperty("url");
		String Username = System.getProperty("username");
		String Password = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(Username);
		System.out.println(Password);
		
	}

}

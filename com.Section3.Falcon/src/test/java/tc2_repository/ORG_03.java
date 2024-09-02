package tc2_repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_03 extends BaseClass{
	
	@Test
	public void org_03case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String ORGNAME = EUTIL.readDataFromExcel("Organisation", 7, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organisation", 7, 2);
		String BILLINGADDRESS = EUTIL.readDataFromExcel("Organisation", 7, 3);
		String BILLINGCITY = EUTIL.readDataFromExcel("Organisation", 7, 1);
		String BILLINGSTATE = EUTIL.readDataFromExcel("Organisation", 7, 2);
	
		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME, WEBSITE, WEBSITE, BILLINGADDRESS, BILLINGCITY, BILLINGSTATE);
		System.out.println("tc3 executed!!");
		Thread.sleep(4000);
	}

}

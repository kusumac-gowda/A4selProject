package tc2_repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_04 extends BaseClass {
	@Test
	public void org_04case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String ORGNAME = EUTIL.readDataFromExcel("Organisation", 10, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organisation", 10, 2);
		String EMPLOYEES = EUTIL.readDataFromExcel("Organisation", 10, 3);
		String PHONE = EUTIL.readDataFromExcel("Organisation", 10, 4);
		String OTHERPHONE = EUTIL.readDataFromExcel("Organisation", 10, 5);
		String EMAIL = EUTIL.readDataFromExcel("Organisation", 10, 6);
		String BILLINGADDRESS = EUTIL.readDataFromExcel("Organisation", 10, 7);
		String BILLINGCITY = EUTIL.readDataFromExcel("Organisation", 10, 8);
		String BILLINGSTATE = EUTIL.readDataFromExcel("Organisation", 10, 9);
	
		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES, PHONE, OTHERPHONE, EMAIL, BILLINGADDRESS, BILLINGCITY, BILLINGSTATE);
		System.out.println("tc4 executed!!");
		Thread.sleep(4000);
	}

}

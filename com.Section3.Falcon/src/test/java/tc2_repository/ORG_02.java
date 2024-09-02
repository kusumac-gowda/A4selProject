package tc2_repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_02 extends BaseClass{
	
	@Test
	public void org_02case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String ORGNAME = EUTIL.readDataFromExcel("Organisation", 4, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organisation", 4, 2);
		String EMPLOYEES = EUTIL.readDataFromExcel("Organisation", 4, 3);
		String PHONE = EUTIL.readDataFromExcel("Organisation", 4, 1);
		String OTHERPHONE = EUTIL.readDataFromExcel("Organisation", 4, 2);
		String EMAIL = EUTIL.readDataFromExcel("Organisation", 4, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(EMPLOYEES, WEBSITE, PHONE, OTHERPHONE, EMAIL);
		System.out.println("tc2 executed!!");
		Thread.sleep(4000);
	}


}

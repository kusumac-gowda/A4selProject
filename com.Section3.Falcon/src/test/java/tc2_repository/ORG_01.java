package tc2_repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_01 extends BaseClass{
	
	@Test
	public void org_01case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String ORGNAME = EUTIL.readDataFromExcel("Organisation", 1, 1);
		String WEBSITE = EUTIL.readDataFromExcel("Organisation", 1, 2);
		String EMPLOYEES = EUTIL.readDataFromExcel("Organisation", 1, 3);
		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES);
		System.out.println("tc1 executed!!");
		Thread.sleep(4000);
	}

}

package tc_repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_03 extends BaseClass {
	
	@Test(groups= {"sanity"})
	public void le_03Case() throws Exception{

	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL=new ExcelUtility();
	String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 7, 1);
	String LASTNAME=EUTIL.readDataFromExcel("Leads", 7, 2);
	String COMPANY=EUTIL.readDataFromExcel("Leads", 7, 3);
	String TITLE=EUTIL.readDataFromExcel("Leads", 7, 4);
	String PHONE=EUTIL.readDataFromExcel("Leads", 7, 5);
	String MOBILE=EUTIL.readDataFromExcel("Leads", 7, 6);
	String EMAIL=EUTIL.readDataFromExcel("Leads", 7, 7);
	String NOOFEMPLOYEES=EUTIL.readDataFromExcel("Leads", 7, 8);
	HomePage hp = new HomePage(driver);
	hp.clickOnLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	lp.clickOnNewLeadBtn();
	CreateNewLeadPage cn = new CreateNewLeadPage(driver);
	cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMPLOYEES);
	Thread.sleep(3000);
	}
}

package tc_repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_04 extends BaseClass{
	
	@Test(groups= {"smoke"})
	public void le_04Case() throws Exception{

		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 10, 1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads", 10, 2);
		String COMPANY=EUTIL.readDataFromExcel("Leads", 10, 3);
		String STREET=EUTIL.readDataFromExcel("Leads", 10, 4);
		String POBOX=EUTIL.readDataFromExcel("Leads", 10, 5);
		String POSTALCODE=EUTIL.readDataFromExcel("Leads", 10, 6);
		String CITY=EUTIL.readDataFromExcel("Leads", 10, 7);
		String COUNTRY=EUTIL.readDataFromExcel("Leads", 10, 8);
		String STATE=EUTIL.readDataFromExcel("Leads", 10, 9);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
	}
}

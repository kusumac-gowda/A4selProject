package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(priority=1,invocationCount=3)
	public void createUser()
	{
		System.out.println("user created!!");
	}
	@Test(priority=2)
	//@Test(invocationCount=0)
	//@Test(enabled=false)
	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
	@Test(priority=1,dependsOnMethods= {"modifyUser"})
	//@Ignore
	public void deleteUser()
	{
		System.out.println("user deleted!!");
	}
}

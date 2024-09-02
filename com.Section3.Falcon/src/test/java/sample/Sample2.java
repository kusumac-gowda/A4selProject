package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test
	public void hardAssertStrictComparison()
	{
		String expectedData="raja";
		String actualData="Raja";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("strict comparison passed!");
	
	}
	
	@Test
	public void hardAssertContainsLevelComparison()
	{
		String expectedData="raja";
		String actualData="maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains level comparison passed!");
	
	}
}

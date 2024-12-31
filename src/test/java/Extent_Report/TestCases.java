package Extent_Report;

import org.junit.Test;
import org.testng.Assert;
import org.testng.SkipException;

public class TestCases {
	
	@Test
	void TestCase1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	void TestCase2()
	{
		Assert.assertTrue(true);
	}

	@Test
	void TestCase3()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	void TestCase4()
	{
		throw new SkipException("");
	}
	
	@Test
	void TestCase5()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	void TestCase6()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	void TestCase7()
	{
		throw new SkipException("");
	}
}

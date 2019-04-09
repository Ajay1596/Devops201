package devops.numbers;

import org.junit.*;

import devops.numbers.NumberToWords;

public class InvalidValueTest {
 
	NumberToWords obj = new NumberToWords();

	
	@Test
	public void test() {
			
		Assert.assertEquals("One", obj.wordConverter(1));
		
	}
	@Test
	public void test1() {
	
		Assert.assertEquals("One Thousand Nine Hundred Ninety Nine", obj.wordConverter(1999));
		
	}
	
	@Test
	public void test2() {
	
		Assert.assertEquals("negative", obj.wordConverter(-1));
		
	}
	@Test
	public void test3() {
	
		Assert.assertEquals("Invalid number", obj.wordConverter(2000000000));
		
	}
	@Test
	public void test4() {
	
		Assert.assertEquals("zero", obj.wordConverter(0));
		
	}
	@Test
	public void test5() {
	
		Assert.assertEquals("Ten", obj.wordConverter(10));
		
	}
}

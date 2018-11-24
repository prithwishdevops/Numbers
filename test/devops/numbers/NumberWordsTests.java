package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}
	
	@Test
	public void test1 (){
	int input = 1;
	String output = numberWords.toWords(input);
	Assert.assertEquals("One" , output);	
	}
	
	@Test
	public void test20 (){
	int input = 20;
	String output = numberWords.toWords(input);
	Assert.assertEquals("Twenty" , output);	
	}	
	
	@Test
	public void test99 (){
	int input = 99;
	String output = numberWords.toWords(input);
	Assert.assertEquals("Ninety Nine" , output);	
	}	
	
	@Test
	public void test256 (){
	int input = 256;
	String output = numberWords.toWords(input);
	Assert.assertEquals("Two Hundred Fifty Six" , output);	
	}	

//	@Test
//	public void numberOutOfRangeReturnsError() {
//		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
//	}

}

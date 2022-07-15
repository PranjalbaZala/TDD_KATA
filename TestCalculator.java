import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculator {
	
	private Calculator calculator;
	
 	@BeforeTest
 	public void init()
 	{
 		calculator=new Calculator();
 	}
	public void emptyStringReturnsZero() throws Exception {
		
		assertEquals(calculator.calculate(""),0); //we have to make sure that the code is failing
	}
	
	public void singleValueEntered() throws Exception
	{
		assertEquals(calculator.calculate("1"),0);
	}
	
	public void twoNumbersReturnsSum() throws Exception
	{
		assertEquals(calculator.calculate("1,2"),3);
	}
	
	public void twoNumbersNewLineDelimiter() throws Exception
	{
		assertEquals(calculator.calculate("1\n2"),3);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeInputReturnsException() throws Exception 
	{
		calculator.calculate("-1");
	}
	
}
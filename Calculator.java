
public class Calculator 
{
	private final String delimeter=",|\n";
	
	public int calculate(String input) throws Exception 
	{
		
		// TODO Auto-generated method stub
		String[] nums=input.split(delimeter); //this expression here takes regular expression
		
		if(isEmpty(input))
		{
			return 0;
		}
		if(input.length()==1)
		{
			return 0;
		}
		else
		{
			return getSum(nums);
		}
	}
	
	private int getSum(String[] nums) throws Exception
	{
		for(String current:nums) {
			if(Integer.parseInt(current)<0) {
				throw new Exception("Negative Numbers");
			}
		}
		int sum=0;
		for(String current:nums) {
			sum+=Integer.parseInt(current);
		}
		return sum;
	}
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int convertToInt(String input)
	{
		return Integer.parseInt(input);
	}
	

}

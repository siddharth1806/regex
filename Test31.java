import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class ToolongException extends RuntimeException
{
	ToolongException(String s)
		{
			super(s);	
		}
	

}
class Test31
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String n= sc.nextLine();
		Pattern p = Pattern.compile(" ");
		Matcher m = p.matcher(n);
		String s[] = p.split(n);	
		
		if(s.length>10)
		{
			throw new ToolongException("Too LONG"); 
		
		}
		else
		{
			for(String i : s)
			{
				System.out.println(i);
		
			}
		}
			
	}
}
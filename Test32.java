import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class CustomException extends RuntimeException
{
	CustomException(String s)
		{
			super(s);	
		}
	

}
class Test32
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String n= sc.nextLine();
		Pattern p = Pattern.compile("nee");
		Matcher m = p.matcher(n);
		String s[] = p.split(n);	
		
		if(m.find())
		{
			for(String i : s)
			{
				System.out.println(i);
			}
		}
		else
		{	
			throw new CustomException("my Exception");
		}
			
	}
}
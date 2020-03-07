import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Test30
{
	public static void main(String args[])
	{
		
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher("The is quick is out is");
		String s[] = p.split("The is quick is out is");	
		for(String i : s)
		{
			System.out.println(i);
		
		}
		
	}

}
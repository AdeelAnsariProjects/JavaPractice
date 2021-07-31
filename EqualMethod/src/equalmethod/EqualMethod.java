package equalmethod;

public class EqualMethod 
{
	public static void main(String[] args)
	{
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = new String("Hello");
		
		if(s1.equals(s2))
		{
			System.out.println("s1 equals to s2");
		}
		else
		{
			System.out.println("s1 not equals to s2");
		}
		if(s1.equals(s3))
		{
			System.out.println("s1 equals to s3");
		}
		else
		{
			System.out.println("s1 not equals to s3");
		}

	}
}

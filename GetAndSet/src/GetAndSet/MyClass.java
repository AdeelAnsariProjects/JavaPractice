package GetAndSet;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		User k = new User();
		System.out.println("enter first name of user");
		k.setFirstName(s.nextLine());
		System.out.println("enter last name of user");
		k.setLastName(s.nextLine());
		System.out.println("enter age of user");
		k.setAge(s.nextLine());
		System.out.println("Informatin of existing user");
		System.out.println("First Name"+"\t"+"Last Name"+"\t"+"age");
		System.out.println(k.getFirstName()+"\t"+k.getLastName()+"\t"+k.getAge());
	}
}

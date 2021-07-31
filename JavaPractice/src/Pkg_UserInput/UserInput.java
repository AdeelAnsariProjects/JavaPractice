package Pkg_UserInput;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args)
	{
		//Variable declaration
		String name;
		Scanner obj = new Scanner(System.in);
		
		//Take user input
		System.out.println("Enter Your Name");
		name = obj.next();
		
		System.out.println("Your Name is "+name);
	}

}
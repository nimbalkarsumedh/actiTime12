package Online_Batch_Assignment;

import java.util.Scanner;

public class Leap_Year
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
		System.out.println("Additional sentences");
		System.out.println("Program for Github");
		System.out.println("Sumedh Gajanan Nimbalkar");
	    System.out.println("1.Cloning 2.Pushing 3.Pulling");
	}
}

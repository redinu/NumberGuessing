

import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

	public static void main(String[] args) {
		
		
		
		
		Random r = new Random();
		int x = 1 + r.nextInt(5);
		
		
		String choice = "Y";
		
		while(choice.equalsIgnoreCase("y")) 
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your number");
			int y = scan.nextInt();
						
				if(y<x){
				System.out.println("You are incorrect");
				
				}
				else if(y>x)
				{
				System.out.println("You are incorrect");
					
				}else{
					System.out.println("You got it right!");
					System.exit(0);
				}
				System.out.println("Do you want to keep guessing? Y/N");
				choice = scan.next();
				
				
		}
		
		
			
		

	}

}

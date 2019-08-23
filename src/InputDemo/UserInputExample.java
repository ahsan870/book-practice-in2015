package InputDemo;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean okay = true;
		System.out.println("Enter your first Number ");
		do {
			System.out.println("Enter your first Number ");
			String line = input.nextLine();
			System.out.println(line);
			
			if("Quit".equals(line)) {
				okay = false;
			}
			
			
			
			
		}while (okay);
		

	}

}

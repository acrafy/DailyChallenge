package menus;

import java.util.Scanner;

public class Difficult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int difficult=0;
		
		do {
	        System.out.println("--	Choose a difficult for Challenges	--");
	        System.out.println("------------------------------------------");
	        System.out.println("- 1  - Java Challenges -- Easy 		-");
	        System.out.println("- 2  - Java Challenges -- Intermidate	-");
	        System.out.println("- 3  - Java Challenges -- Hard 		-");
	        System.out.println("- 4  - Exit            			-");
	        System.out.println("------------------------------------------");
	        
	        System.out.println("Insert selection: ");
	        difficult = sc.nextInt();
	        
	        switch (difficult) {
				case 1:
					System.out.println(List.files(mode(difficult)));					
					break;
				case 2:
					System.out.println(List.files(mode(difficult)));	
					break;
				case 3:
					System.out.println(List.files(mode(difficult)));	
					break;
				case 4:
					System.out.println("-------------------------------------");
					break;
				default:
					System.out.println("Invalid selection, read carefully the menu.");
					break;
			}
	        
		} while (difficult !=4);        
	}
	
	public static String mode(int e) {
		if (e==1) {
			return "Easy";
		}else if(e==2) {
			return "Intermidate";
		}else {
			return "Hard";
		}
	}
	
}

//Tangy Create a logic to display your name if condition is true
package namesgradespack;
import java.util.Scanner;

	public class Name2 {

		public static void main(String[] args) {

			// direct the user
			System.out.println("Enter a number between 1 - 8. If you guess the right number you will see my name");
			
			// add the scanner object 
			Scanner keyboard= new Scanner(System.in);
			int input=keyboard.nextInt();
			
			//add the condition to see if it is true 
			if (input==8){
				
				System.out.println( "Tangy is my name. " + input + " was the correct number! Congrats!");
			}
			
			else{
				System.out.println( input + " is not the number. Please try again");	
			}
		}
		
		
		public void namesfalse(){
		
		
		System.out.println("If you guess the WRONG number you WILL see the name of the instructor");
		
		// add the scanner object 
		Scanner keyboard= new Scanner(System.in);
		int input=keyboard.nextInt();	
		
		if (input!=3){
			
			System.out.println("Arfath is cool ! ");
		}	
		
		}
	}

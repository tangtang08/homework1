//this class fills requirement number 3. Create a student grading application 
package namesgradespack;
import java.util.Scanner;

public class Grades extends Name2 {

	public static void main(String[] args) {
 //Give the user instructions
		System.out.println("Find out your grade");
	
		Scanner keyboard=new Scanner(System.in);
		
	int thegrade = keyboard.nextInt();
	
	//give the if conditions
	
	if (thegrade>=90 || thegrade==100){
		System.out.println("The letter grade is an A ");	
	}
	
	else if (thegrade>=80 || thegrade==89){
		System.out.println("The letter grade is a B");
	}	
	
	else if ( thegrade>=70 || thegrade==79){
		System.out.println("The letter grade is C");
	}
	
	else{
		System.out.println("Please enter a valid number");
		
	}
	
	}

}

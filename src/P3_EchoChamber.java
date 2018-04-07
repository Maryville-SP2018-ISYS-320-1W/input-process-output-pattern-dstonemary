import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-07-2018
*/

public class P3_EchoChamber {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("What is your phrase? "); 
		String phrase = console.nextLine();
		System.out.print("How many times should I repeat it? "); 
		int number = console.nextInt(); 
		for(int i = 1;i<=number;i++){
			System.out.println(phrase);
		}
		
	}

}

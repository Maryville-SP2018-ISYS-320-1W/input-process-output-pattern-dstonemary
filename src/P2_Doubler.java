import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-07-2018
*/

public class P2_Doubler {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("What is your number? "); 
		int number = console.nextInt(); 
		number = number * 2;
		System.out.println("That number doubled is "+number+".");
	}

}

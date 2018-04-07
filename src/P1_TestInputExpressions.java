import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-07-2018
*/

/*
 Your expected results after the input is provided:
 
 1.	34.50
 2.	6.0
 3. Exception
 4.	Exception
 
 5.	500.0
 6.	Exception
 7.	Exception
 8.	645.0
 
 34.5
 6.0
 InputMismatchException
 InputMismatchException
 InputMismatchException [Wrong prediction as scanner take input as text without any computation and then convert to any data type]
 InputMismatchException
 InputMismatchException
 645.0  
 */

public class P1_TestInputExpressions {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("How much money do you have? "); 
		double money = console.nextDouble(); 
		System.out.println("money : "+money);

	}

}

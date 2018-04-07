import java.util.Scanner;
/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-07-2018
*/

public class StringWeaver {

	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("Enter the first string: "); 
		String string1 = console.nextLine();
		System.out.print("Enter the second string: ");
		String string2 = console.nextLine();
		int maxCount = Math.max(string1.length(), string2.length());		
		String woven = "";
		for(int i = 1; i<= maxCount ; i++){
			if(string1.length() >= i){
				woven = woven + string1.charAt(i-1);
			}
			if(string2.length() >= i){
				woven = woven + string2.charAt(i-1);
			}			
		}
		System.out.println("When woven '"+woven+"' is your new word.");
	}

}

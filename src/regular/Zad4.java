package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			Pattern p=Pattern.compile("[A-Z]",Pattern.UNICODE_CASE);
			Matcher m=p.matcher(scan.nextLine());
		}
	}
}

package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Pattern p=Pattern.compile("(^(https://))?((www)(\\.))?(([a-z]\\d)*)(\\.)([a-z]{2,})$" , Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(scan.nextLine());
			System.out.println(m.find());
			scan.close();
	}

}

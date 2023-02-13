package regular;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String text=scan.nextLine();
		String num=scan.nextLine();
			text=text.replaceAll("x", num);
				text=text.replaceAll("\\+\\-", "\\-");
				text=text.replaceAll("\\-\\-", "\\+");
			System.out.println(text);
		scan.close();
	}

}

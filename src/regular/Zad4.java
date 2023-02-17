package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean cap=false;
		boolean lower=false;
		boolean digit=false;
		
			Pattern p=Pattern.compile("[A-Z]",Pattern.UNICODE_CASE);
			String text=scan.nextLine();
			Matcher m=p.matcher(text);
			if(m.find()){
				if(m.find()){
					cap=true;
				}	
			}
			p=Pattern.compile("[a-z]",Pattern.UNICODE_CASE);
			m=p.matcher(text);
			if(m.find()){
				if(m.find()){
					if(m.find()){
						if(m.find()){
							lower=true;
						}
					}
				}
			}
			p=Pattern.compile("\\d",Pattern.UNICODE_CASE);
			m=p.matcher(text);
			if(m.find()){
				digit=true;
			}
			if(cap&&digit&&lower){
				System.out.println("valid");
			}
			else{
				System.out.println("not valid");
			}
		scan.close();
	}
}

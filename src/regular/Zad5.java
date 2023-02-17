package regular;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        String[] phones= new String[n];
        for(int i=0;i<n;i++){
            Pattern p=Pattern.compile("0\\d{9}",Pattern.CASE_INSENSITIVE);
            Matcher m=p.matcher(scan.nextLine());
            if(m.find()){
                phones[i]=m.group();
            }
        }
        System.out.println(Arrays.toString(phones));
        scan.close();
    }
}

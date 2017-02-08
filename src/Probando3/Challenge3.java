package Probando3;
import java.util.Scanner;

public class Challenge3 {
	public String replace (String input){
		String res =" ";
		int length = input.length();
		if (length<=3)
			res=input.toUpperCase();
		else{
			String s=input.substring(input.length()-3);
			String p = input.substring(0,input.length()-3);
			s.toUpperCase();
			res=p+s;
		}
		return res;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.next();
		
		Challenge3 Object =new Challenge3();
		System.out.println(Object.replace(s));
	}
}

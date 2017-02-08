package Probando1;

import java.util.Scanner;

class Challenge2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL :");
		String s = sc.nextLine();
		Challenge2 obj = new Challenge2();
		s = obj.decodeURL(s);
		System.out.print("Decoded URL is :" + s);
	}

	private String decodeURL(String s) {
		//s=s.replace("%20", " ");
		//s=s.replace("%3A", "?");
		//s=s.replace("%3D", ".");
		//mismo resultado
		//return s.replace("%20", " ").replace("%3A", "?").replace("%3D", ".");
	StringBuilder sb = new StringBuilder(s);
	sb.replace(s.indexOf("%20"), s.indexOf("%20")+3, " ");
	return sb.toString();
	}
}

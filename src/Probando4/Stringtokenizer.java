package Probando4;

import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		StringTokenizer str;
		str = new StringTokenizer("Hola%20a%30adios","%1230");
		System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())
		System.out.print(str.nextToken() + " ");

	}

}

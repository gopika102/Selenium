package Sample;

import java.util.Scanner;

public class StringPgm2 {
public static void main(String[] args) {
	StringPgm2 obj = new StringPgm2();
	int b = obj.getString();
	System.out.println("length of String value entered is"+b);
	
}
public int getString()
{
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a string value");
	String a = reader.next();
	int b = a.length();
	return b;
}
}

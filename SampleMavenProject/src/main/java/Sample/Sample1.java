package Sample;



public class Sample1 {
public static void main(String[] args) {

checknum(20);
}
public static boolean checknum(int a)
{
	if (a>9 && a<=100)
	{
		
		System.out.println("its a 2 digit number");
		return true;
	}
	
	else
	return false; 
}
}

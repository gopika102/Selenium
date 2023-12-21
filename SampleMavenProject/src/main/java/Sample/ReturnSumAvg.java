package Sample;

public class ReturnSumAvg {
public static void main(String[] args) {
	
	
	int s = sum(10,20,30);
	avg(s);
}
public static int sum(int a, int b, int c)
{  
	int s = a+b+c;
	return s;
}
public static void avg(int a)
{   
	
	int av= a/3;
	System.out.println(av);
}
}

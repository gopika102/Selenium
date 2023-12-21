package Sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		String val1 = list.get(0);
		String val2 = list.get(1);
//	System.out.println(val1);
//	System.out.println(val2);
	
Iterator<String> itr = list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}
}

package Sample;

import java.util.*;

import java.util.*;

public class HashsetSample {

	public static void main(String[] args) {

		HashSet<String> obj =new HashSet<String>();

		obj.add("e");

		obj.add("f");

		obj.add("g");

		obj.add("g");

		obj.add("h");

		obj.add(null);
		obj.add(null);
		obj.add("e");
		obj.remove("e");

		Iterator<String> itr = obj.iterator();
		while(itr.hasNext())

		{

			System.out.println(itr.next());

		}

		

		

	}



}


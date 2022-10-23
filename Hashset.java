

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet <Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		if(set.contains(1)) {
			System.out.println(" it contains 1");
		}
		
		set.remove(1);
		System.out.println(set.size());
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

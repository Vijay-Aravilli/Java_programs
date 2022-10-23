package hii;

import java.util.*;
public class Hashmap_1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		
		//insertion
		hm.put("India", 140);
		hm.put("China", 150);
		hm.put("Bangladesh", 40);
		
		//accessing using for loop
		for(Map.Entry<String,Integer> m: hm.entrySet()) {
			System.out.println(m);
		}
		System.out.println(hm.get(140));//get function returns value for a certain key
		if(hm.containsKey("India")) {
			System.out.println("present");
			
			
		}
		//accessing elements using diff for loop has det
		HashSet <String> hs=new HashSet<>();
		for(String ks: hm.keySet()) {
			System.out.println(hm.get(ks));
			
		}
		
		
		

	}

}

package hii;
import java.util.*;

public class Hashing_Basics {

	public static void main(String[] args) {
		HashMap <String, Integer> x=new HashMap<>();
		x.put("India", 120);
		x.put("China",150);
		x.put("Indonesia", 30);
		if(x.containsKey("India")) {
			System.out.println(" exists");
		}
		System.out.println(x.get("India"));
		
		for(Map.Entry<String, Integer> e:x.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//map.Entry<>
	}

}


import java.util.*;

public class Dict_order {

	public static void main(String[] args) {
		String B="qwertyuiopasdfghjklzxcvbnm";
		String []A=new String[] {"fine", "none", "no"};
		System.out.println(A[0].length());
		System.out.println(A[0].charAt(0));
		
		
		HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(B.charAt(i),i);
        }
        System.out.println(map.get(A[0].charAt(0)));
        for(int i=0;i<A.length;i++){
            for(int j=0;j<(A[i].length()-2);i++){
                if(map.get(A[i].charAt(j))<map.get(A[i].charAt(j+1))){
                    System.out.println(0);
                    return;
                }
            }
        }
        

	}

}

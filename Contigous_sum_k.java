package hii;
import java.util.*;

public class Contigous_sum_k {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int B=5;
		ArrayList <Integer> A= new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
        map.put(0,0);
        int currSum=0;
         ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0;i<A.size();i++){
            currSum+=A.get(i);
            if(map.containsKey(currSum-B)){
                int x=map.get(currSum-B);
                
                for(int m=0;m<(i-x);m++){
                   // x++;
                    System.out.println(x);
                    arr.add(A.get(x));
                    System.out.println(x+"value"+A.get(x));
                    
                }
                return;
            }
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }
            else{
                map.put(currSum,i);
            }
           

	}
        for(int z:arr) {
        	System.out.println(z);
        }
	}

}

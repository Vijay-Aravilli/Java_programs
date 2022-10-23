package hii;
import java.util.*;

public class Slidibng_hashmap {

	public static void main(String[] args) {
		int B=3;
		int []A=new int[] {1,2,1,3,4,5,6};
		int N= A.length;
        int []X=new int[N-B+1];
        HashMap<Integer, Integer>map=new HashMap<>();
       //first set ofB values in hashmap                                                                                                )
        for(int i=0;i<B;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],(map.get(A[i])+1));
            }
            else{
                map.put(A[i],1);
            }
        }
        int count=0;
        for(int q:map.keySet()){
            if(map.get(q)==1){
                count++;

            }
        }
        A[0]=count;
        for(int i=0;i<X.length;i++) {
        	System.out.println(X[i]);
        	
        }
       

	}

}



public class Atleast_one_el_greater {

	public static void main(String[] args) {
		int []x=new int[] {-3,-2,6,4,8,5,8};
		// find the mx and calculate the count TC: N, SC:1
		
		
		int m=Integer.MIN_VALUE;
		int z=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>=m) {
				m=x[i];
				z++;
			}
		}
		int count=x.length;
		for(int i=0;i<x.length;i++) {
			if(x[i]==m) {
				count--;
			}
		}
		System.out.println(count);
		System.out.println(z);
		//TWO POINTER APPROACH
		//HASH MAP
		

	}

}

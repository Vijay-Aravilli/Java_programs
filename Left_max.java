package hii;

public class Left_max {

	public static void main(String[] args) {
	     int[]A=new int[] {-3,2,10,5,11,17};
	     int[]lf=new int[A.length];
	     lf[0]=A[0];
	     for(int i=1;i<A.length;i++) {
	    	 if(A[i]<lf[i-1])
	    	 lf[i]=lf[i-1];
	    	 else
	    		 lf[i]=A[i];
	     }
	     for(int i=0;i<A.length;i++) {
	    	 System.out.println(lf[i]);
	     }
	     

	}

}



public class Array_num_greaterthan_itself
{

	public static void main(String[] args) {
		int []X=new int[] {2,1,45,6,1,45,9,-3,5,2};
		int count=X.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<10;i++) {
			if(X[i]>max) {
				max=X[i];
			}	
		}
		for(int i=0;i<10;i++) {
			if(X[i]==max) {
				count-=1;
				
			}
		}
		System.out.println(count);

	}

}

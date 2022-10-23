

public class Array_sum_two_num_equals_k {

	public static void main(String[] args) {
		int [] X=new int[] {1,2,3,4,5,6,7,8};
		int k=7;
		for(int i=0;i<X.length;i++) {
			for(int j=i+1;j<X.length;j++) {
				if(X[i]+X[j]==k) {
					System.out.println("found one");
					return;
				}
			}
		}
		System.out.println("didn't found");
		

	}
	
	//Have another approaches --> two pointers and hash maps;
	
	

}

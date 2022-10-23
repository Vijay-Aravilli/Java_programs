package hii;

public class Print_Subarrays {

	public static void main(String[] args) {
		int []ar =new int [] {1,2,3,4};
		for (int i=0;i<ar.length;i++) {
			for (int j=i;j<ar.length;j++) {
				for(int k=i;k<=j;k++) {
				System.out.print(ar[k]+" ");
				}
				System.out.println();
			}
			
		}
	}

}

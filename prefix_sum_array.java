package hii;

public class prefix_sum_array {

	public static void main(String[] args) {
		int []a =new int[] {1,2,3,4,5,6,6,7,7};
		int []pe=new int[a.length];
		pe[0]=a[0];
		for(int i=1;i<a.length;i++) {
			pe[i]=pe[i-1]+a[i];
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(pe[i]);
			
		}

	}

}

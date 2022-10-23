

public class Prefix_sum {

	public static void main(String[] args) {
		int[]x=new int[] {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		int len=x.length;
		int[]ps=new int[x.length];
		ps[0]=x[0];
		for(int i=1;i<x.length;i++) {
			ps[i]=ps[i-1]+x[i];
		}
		////////////////
		int w=2;
		int sum=0;
		for(int i=0;i<w;i++) {
			
			sum=ps[w-i-1]+ps[len-1]-ps[len-i-1];
			if(sum>max) {
				max=sum;
			}
			
		}
		sum=ps[len-1]-ps[len-w-1];
		if(sum>max) {
			max=sum;
		}
		System.out.println(max);
		
	}

}

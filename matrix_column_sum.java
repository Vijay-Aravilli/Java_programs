

public class matrix_column_sum {

	public static void main(String[] args) {
		int [][]x=new int[][] {{1,2,3},{3,4,5}};
		int row_len=x.length;
		int col_len=x[0].length;
		int max_sum=Integer.MIN_VALUE;
		
		for(int i=0;i<col_len;i++) {
			int sum =0;
			for(int j=0;j<row_len;j++) {
				sum+=x[j][i];
				
			}
			if(sum>max_sum) {
				max_sum=sum;
			}
		}
		System.out.println(max_sum);
		

	}

}

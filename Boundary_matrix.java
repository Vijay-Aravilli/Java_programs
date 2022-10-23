

public class Boundary_matrix {

	public static void main(String[] args) {
		int[][]ar= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		//1 2 3
		//4 5 6
		//7 8 9
		
		//spiral matrix also completed
		
		int m =ar.length;
		int i=0;
		int j=0;
		while(m>1) {
		for(int z=0;z<m-1;z++) {
			System.out.println(ar[i][j]);
			j++;
			
		}
		for(int z=0;z<m-1;z++) {
			System.out.println(ar[i][j]);
			i++;
			
		}
		for(int z=0;z<m-1;z++) {
			System.out.println(ar[i][j]);
			j--;
			
		}
		for(int z=0;z<m-1;z++) {
			System.out.println(ar[i][j]);
			i--;
			
		}
		System.out.println(i+','+j);
		i++;j++;m=m-2;
		}
		System.out.println(ar[i][j]);

	}

}

package hii;

public class traverse_diagonals {

	public static void main(String[] args) {
		int [][]x=new int[][] {{1,2,3,4},{5,6,7,8,},{9,8,7,6}};
		int m = x.length;//3
		int n =x[0].length;//4
		for (int j=0;j<n;j++) {
			int z=0;
			int y=j;
			while(z<m && y>=0) {
				//break;
				System.out.println(x[z][y]);
				z++;y--;
			}
			System.out.println();
		}
		
		for(int i=1;i<m;i++) {
			int y=i;
			int z=n-1;
			while(y<m &&z >=0) {
				System.out.println(x[y][z]);
				y++;
				z--;
			}
			System.out.println();
		}
		
		

	}

}

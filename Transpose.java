

public class Transpose {

	public static void main(String[] args) {
		int[][]ar=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int m=ar.length;
		for(int i=0;i<m;i++ ) {
			for(int j=i;j<m;j++) {
				int k=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=k;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.println(ar[i][j]);
			}
		}

	}

}

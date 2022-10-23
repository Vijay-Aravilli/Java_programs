
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int B= sc.nextInt();
		for(int i=2
				;i<=(B/i);i++) {
			if(B%i==0) {
				System.out.println("not a prime");
				return;
			}
			else {
				System.out.println("prime");
			}
			
				
		}

	}

}

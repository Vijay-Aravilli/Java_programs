package hii;

public class Split_substring_0_1 {

	public static void main(String[] args) {
		String S="01010011";	
		int Sub_count=1;
		int zero_count=0;
		int one_count=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)-'0'==0) {
				zero_count++;
			}
			else {
				one_count++;
			}
			if(zero_count==one_count) {
				Sub_count++;
				zero_count=0;
				one_count=0;
				
			}
		}
		System.out.println(Sub_count-1);

	}

}

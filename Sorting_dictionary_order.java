

public class Sorting_dictionary_order {

	public static void main(String[] args) {
		String s="ancjdjhdsacjl";
		int []x=new int[25];
		for(int i=0;i<s.length();i++) {
			int m =(int)(s.charAt(i)-'a');
			System.out.println(m);
			x[m]=x[m]+1;
		}
		StringBuilder z=new StringBuilder();
		for(int i=0;i<25;i++) {
			for(int j=0;j<x[i];j++) {
				z.append((char)(i+'a'));
			}
		}
		System.out.println(z);

	}

}

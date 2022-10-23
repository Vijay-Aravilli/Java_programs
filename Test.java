

public class Test {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("qwerTUOOP");
		for (int i=0;i<s.length();i++) {
//			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
//				s.setCharAt(i,(char)(s.charAt(i)-32));
//			}
			s.setCharAt(i,(char)(s.charAt(i)^(1<<5)));
			
		}
		System.out.println(s);
		
		
				

	}

}

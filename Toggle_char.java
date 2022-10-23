
public class Toggle_char {

	public static void main(String[] args) {
		StringBuilder s =new StringBuilder("aSdDFghg");
		
		for(int i=0;i<s.length();i++) {
//			if((s.charAt(i)-'a')>=0) {
//				
//				s.setCharAt(i, (char) (s.charAt(i)-32));
//				
//			}
//			else {
//				s.setCharAt(i, (char) (s.charAt(i)+32));
//				
//			}
			
			s.setCharAt(i,(char) ((char) s.charAt(i)^32));		}
		System.out.println(s);
		
	}

}

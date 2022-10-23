

class Pen{
	
	String type;
	String color;
	public void write() {
		System.out.println("I am writing");
	}
	
	public void printcolor() {
	System.out.println(this.color);
	}
}
 


public class Oops {

	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.write();
		p1.color="blue";
		p1.printcolor();
		Pen p2 =new Pen();
		p2.color="red";
		p2.printcolor();
		

	}

}

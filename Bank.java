package hii;
class Accountdetails{
	public String name;
	public String Pass;
	
	public void print() {
		System.out.println(this.name);
	}
	
	
}

public class Bank {

	public static void main(String[] args) {
		
		Accountdetails ac= new Accountdetails();
		ac.name ="Vijay";
		ac.print();
				
		

	}

}

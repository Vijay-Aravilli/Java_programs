package hii;

class Student{
	
	String name;
    String age;
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age;
		
		
	}
	Student(){
		
	}
	public void write() {
		System.out.println(this.name+ " "+this.age);
	}
}

public class Copyconstructor {

	public static void main(String[] args) {
		
		Student s1=new Student ();
		s1.name="Vijay";
		s1.age="24";
		Student s2=new Student(s1);
		s2.write();

	}

}

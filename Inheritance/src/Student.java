import java.util.Scanner;

public class Student extends Person{

	int studId;
	String schoolName;
	public Student(String name,String nationality,int age,int studId, String schoolName) {
		super(name,age,nationality);
		this.studId = studId;
		this.schoolName = schoolName;
	}
	public Student() {
		super();
		System.out.println("Enter id,schoolname");
		Scanner scanner=new Scanner(System.in);
		
		studId=scanner.nextInt();
		schoolName=scanner.next();
		
	}
	
	void display()
	{
		System.out.println("Name"+name);
		System.out.println("age"+age);
		System.out.println("Nationality"+nationality);
		System.out.println("Id"+studId);
		System.out.println("SchoolName"+schoolName);
	}
}

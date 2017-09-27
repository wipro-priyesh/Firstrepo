import java.util.Scanner;

public class Person {

	String name;
	int age;
	String nationality;
	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	public Person() {
		System.out.println("Enter name,age,nationality");
		Scanner scanner=new Scanner(System.in);
		
		name=scanner.nextLine();
		age=scanner.nextInt();
		nationality=scanner.nextLine();
	}
	
	
}


public class Apple extends Fruit{
	
	public Apple(String name, String taste, int size) {
		super(name, taste, size);
		
	}
	
	public void eat(){
		System.out.println(super.name + "okay");
		System.out.println("overriding");
	}

	

}

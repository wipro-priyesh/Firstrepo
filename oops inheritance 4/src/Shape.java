
public class Shape {
	
	public Shape(){}
	
	public void draw(){
		System.out.println("Drawing shape");
	}
	
	public void erase(){
		System.out.println("Erasing shape");
	}

	public static void main(String[] args) {
		Shape c=new Circle (); 
		c.draw();
		c.erase();
		Shape t=new Triangle (); 
		t.draw();
		t.erase();
		Shape s=new Square ();
		s.draw();
		s.erase();
	}
}

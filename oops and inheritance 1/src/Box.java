
public class Box {
	int width;
	int height;
	int depth;
	int vol;
	
	
	public int volume(int w, int h, int d){
		this.depth=w;
		this.height=h;
		this.depth=d;
		
		vol = w*h*d;
		
		System.out.println(vol);
		return vol;
	}

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.volume(10, 5, 5);
	}
}

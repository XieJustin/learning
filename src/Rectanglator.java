public class Rectanglator {
	public static void main(String args[]){
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		
		Rectangle r = new Rectangle(length, width);
		System.out.println("Area:"+r.getArea());
		System.out.println("Perimeter:"+r.getPerimeter());
				
	}

}
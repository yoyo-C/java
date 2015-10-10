package classandobject.shapes;

public class MyPic {
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
		 Picture pic = new Picture(1024,800);
		 int i = 0;
		 for (i = 0; i < 100; i++){
			 Circle c = new Circle(200,200,i*2);
			 pic.add(c);
		 }
		 pic.draw();	  
	 }
}

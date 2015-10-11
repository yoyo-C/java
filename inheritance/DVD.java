package inheritance;

public class DVD extends Item{
	private String director;
	
	
	public DVD(String title,String director, int playingTime,String comment,boolean gotit){
		super(title,playingTime,false,comment);
		this.director = director;
	}

//	public static void main(String[] args) {
//		DVD dvd = new DVD("ÀÇÍ¼ÌÚ","Rank",2000,"...", false);
//		dvd.print();
//	}
	
	public void print(){
		System.out.println("director:" + director);
		super.print();
	}
}

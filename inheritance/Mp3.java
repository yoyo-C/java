package inheritance;

public class Mp3 extends Item {

	private String singer;
	private String record;
	
	public Mp3(String title, int playingtime, boolean gotit, String comment, String singer, String record){
		super(title, playingtime, gotit, comment);
		this.singer = singer;
		this.record = record;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void print() {
		super.print();
		System.out.print("singer:"+singer + "\n record:" + record);	
	}

}

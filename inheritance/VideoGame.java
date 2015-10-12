package inheritance;

public class VideoGame extends Item {
	private int number0fPlayers;
	
	
	
	public VideoGame() {
		super();
		// TODO Auto-generated constructor stub
	}



	public VideoGame(String title, int playingtime, boolean gotit,
			String comment, int number) {
		super(title, playingtime, gotit, comment);
		// TODO Auto-generated constructor stub
		number0fPlayers = number;
	}



	@Override
	public void print() {
		System.out.print("VideoGame");
		super.print();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

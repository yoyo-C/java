package inheritance;

public class CD extends Item {
	private String artist;
	private int numofTracks;


	public CD(String title, String artist, int numofTracks, int playingTime,
			String comment, boolean gotit) {
		super(title, playingTime, false, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

//	public static void main(String[] args) {
//		CD cd = new CD("‘¬¡¡∫”","Jane",100,1990,"perfect!",false);
//		cd.print();
//	}

	public void print() {
		super.print();
		System.out.println("artist:"+artist + "\n numofTracks:" + numofTracks);	
	}

}

package inheritance;

public class Item {

	private String title;
	private int playingtime;
	private boolean gotit = false;
	private String comment;
	

	public Item(){
		
	}


	public Item(String title, int playingtime, boolean gotit, String comment) {
		super();
		this.title = title;
		this.playingtime = playingtime;
		this.gotit = gotit;
		this.comment = comment;
	}



	public void setTitle(String title){
		this.title = title;
	}

	public void print() {
		System.out.println("title:" + title + "\n playingtime:"+playingtime + "mins\n gotit:" + gotit +"\n comment:"+comment);		
	}

}

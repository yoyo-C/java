package castle;

public class Handler {
	protected Game game;
	public void doCmd(String word){
		
	}
	public Handler(Game game){
		this.game = game;
	}
	public boolean isBye(){
		return false;
	}
}

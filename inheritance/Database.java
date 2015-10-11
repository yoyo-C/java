package inheritance;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> listItem = new ArrayList<Item>();
	

	public void add(Item item){
		listItem.add(item);
	}
	
	public void list(){
		for (Item item: listItem){
			item.print();
		}
	}
	
	
	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD("¸Û‡å","Ğìï£",1, 120,"¶¹°ê£º6.2£¡",false));
		db.add(new CD("°µÉ±","º«¹ú",1, 130,"¶¹°ê£º8.3£¡",true));
		db.add(new DVD("ÀÅçğ°ñ","ÖĞ¹ú",2000, "¶¹°ê£º9.3£¡",true));
		db.add(new DVD("ÉÙÄêÅÉ","Àî°²",120, "¶¹°ê£º8.7",false));
		db.add(new Mp3("you raise me up", 3, false, "classic song", "westlife", "face to face"));
		db.add(new Mp3("Trouble is a friend",4, true,"soft","lenka","lenka"));
		db.list();
	}



}

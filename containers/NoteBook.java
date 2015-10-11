package containers;

import java.util.ArrayList;
import java.util.HashSet;


class Value {
	private int i;
	public void set(int i){
		this.i = i;
	}
	public int get(){
		return i;
	}
}



public class NoteBook {
	
	
	private ArrayList<String> notes = new ArrayList<String>();
	
	
	public void add(String s){
		notes.add(s);
	}
	
	public int getSize(){
		return notes.size();
	}
	
	public String getNote(int index){
		return notes.get(index);
	}
	
	public void add(String s, int location){
		notes.add(location,s);
	}
	
	public void removeNote(int index){
		notes.remove(index);
	}
	
	public String[] list(){
		String[] a = new String[notes.size()];
//		for (int i = 0; i < notes.size(); i++){
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		for (String s: a){
			System.out.println(s);
		}
		
		
		Value[] a1 = new Value[10];
		for ( int i = 0; i < a1.length;i++){
			a1[i] = new Value();
			a1[i].set(i);
		}
		
		
		for (Value v: a1){
			System.out.println(v.get());
			v.set(0);
		}
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		nb.removeNote(1);
		String[] b = nb.list();
		for (String s: b){
			System.out.println(s);
		}
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("first");
	}
}

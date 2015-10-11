package containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Citys{
	
	private ArrayList<String> cityList = new ArrayList<String>();
	
	public void add(String city){
		cityList.add(city);
	}
	
	public String getCity(int index){
		if (cityList.size() > index) {
			return cityList.get(index);
		}
		else {
			return "NOT FOUND!";
		}
	}
	
	public int getIndex(String city){
		return cityList.indexOf(city);
	}
	
	public String toString(){
		return cityList.toString();
	}
	
	public int getSize(){
		return cityList.size();
	}
}

class MileageTable{
	private HashMap<String,HashMap<String,Integer>> mileageTable = new HashMap<String,HashMap<String,Integer>>();
	
	public void add(String cityA, String cityB, int miles){
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		temp.put(cityB, miles);
		mileageTable.put(cityA,temp);
	}
	public int queryMiles(String cityA, String cityB){
		return mileageTable.get(cityA).get(cityB);
	}
}
	
public  class ExpofMileageTable {	
	
	public static void main(String[] args) {
		Citys citys = new Citys();
		Scanner in = new Scanner(System.in);
		String tmp = in.next();
		while(!tmp.equals("###")){
			citys.add(tmp);
			tmp = in.next();
		}
		
		MileageTable mileagetable = new MileageTable();
		for (int n = 0; n < citys.getSize(); n++){
			for (int m = 0; m < citys.getSize(); m++){
				int miles = in.nextInt();
				mileagetable.add(citys.getCity(n), citys.getCity(m), miles);
//				System.out.println(citys.getCity(n)+citys.getCity(m)+miles);
			}
		}
		
		String cityA = in.next();
		String cityB = in.next();	
		System.out.println(mileagetable.queryMiles(cityA,cityB));
		in.close();
	}

}

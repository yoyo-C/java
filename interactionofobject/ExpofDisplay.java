package interactionofobject;

public class ExpofDisplay {
	private int value = 0;
	private int limit = 0;
//	private static int step = 1;//variable of class
	/**
	 * @param args
	 */
	
	
	public ExpofDisplay(int limit){
		this.limit = limit;
	}
	
	public void increase(){
		value++;
		if (value == limit){
			value = 0;
		}
	}
	
	public void increase(Display d){
		value++;
		if(value == limit){
			value = 0;
			d.increase();
		}
	}
	
	public int getValue(){
		return value;
	}
	public static void main(String[] args) {
		Display d1 = new Display(24);
//		Display d2 = new Display(100);
		for (;;){
			d1.increase();
			System.out.println(d1.getValue());
		}
	}

}

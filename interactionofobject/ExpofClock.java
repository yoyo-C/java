package interactionofobject;

import java.util.Scanner;

class Display {
	private int limit = 0;
	public int value = 0;
	
	public Display(int limit){
		this.limit = limit;
	}
	
	public void increase(){
		value++;
		if (value == limit){
			value = 0;
		}
	}
	public int getValue(){
		return value;
	}
	
}

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock(int hour, int minute, int second){
		this.hour.value = hour;
		this.minute.value = minute;
		this.second.value = second;
	}

	public void tick(){
		second.increase();
		if (second.value == 0){
			minute.increase();
			if (minute.value == 0){
				hour.increase();
			}
		}
	}
	
	public String toString(){
		String result = String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
		return result;
		
	}
}

public class ExpofClock{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(),in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}

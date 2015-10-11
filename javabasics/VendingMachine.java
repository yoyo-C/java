package javabasics;
public class VendingMachine {

	/**
	 * @param args
	 */
	int price = 80;
	int balance = 100;
	int total;
	int sum;

	
	void showPromt(){
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount){
		balance += amount;
	}
	
	void showBalance(){
		System.out.println(balance);
	}
	
	void getFood(){
		if (balance >= price){
			System.out.println("Here you are.");
			balance -= price;
			total += price;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		vm.showPromt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
	}

}

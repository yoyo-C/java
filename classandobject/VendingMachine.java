package classandobject;

public class VendingMachine {

	/**
	 * @param args
	 */
	int price = 80;
	int balance = f();
	int total;
	int sum;

	VendingMachine(){//constructor function
		total = 0;
	}
	
	VendingMachine(int price){ //override
		this.price = price;
	}
	int f(){
		return 100;
	}
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
		VendingMachine vm2 = new VendingMachine();
		vm2.showPromt();
		vm2.showBalance();
		vm2.insertMoney(20);
		vm2.getFood();
		vm2.showBalance();
	}

}

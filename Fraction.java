package Fraction;

public class Fraction {

	int a, b;
	
	
	
	Fraction(int a, int b){
		this.a = a;
		this.b = b;
		
	}
	
	double toDouble(){
		return (double)a / b;
	}
	
	Fraction plus(Fraction r){
//		r.a = r.a * this.b + r.b * this.a;
//		r.b = r.b * this.b;
		return new Fraction(this.a * r.b + this.b*r.a, this.b*r.b);
	}
	
	Fraction multiply(Fraction r){
//		r.a = this.a * r.a;
//		r.b = this.b * r.b;
		return new Fraction(this.a * r.a, this.b * r.b);
	}
	
	void print(){
		String result = new String();
		if ( a % b == 0){
			result = Integer.toString(a/b);
		}
		else{
			int temp_a = a;
			int temp_b = b;
			int temp;
			while(temp_b != 0){
				temp = temp_a % temp_b;
				temp_a = temp_b;
				temp_b = temp;			
			}
			a /= temp_a;
			b /= temp_a;
			result = Integer.toString(a)+"/"+Integer.toString(b);				
		}
		System.out.println(result);
		
	}
}

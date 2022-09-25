package java_interview;

abstract class CarPrice {

	protected int rate;

	abstract void getRate();

	public void calculateRate(int unit) {

		System.out.println(unit*rate);
	}

}

class BMW extends CarPrice {

	@Override
	void getRate() {

		rate = 45;
		
		
	}

}

class Audi extends CarPrice {

	@Override
	void getRate() {

		rate = 35;
		
	}

}

class Volvo extends CarPrice {

	@Override
	void getRate() {

		rate = 60;
		
	}

}
class CarFactory{
	
	public CarPrice getCarPrice(String carModel) {
		
		if(carModel==null) {
			
			return null;
		}
		
		if(carModel.equalsIgnoreCase("BMW")) {
			return new BMW();
		}
		else if(carModel.equalsIgnoreCase("Audi")) {
			return new Audi();
		}
		else if(carModel.equalsIgnoreCase("Volvo")) {
			return new Volvo();
		}
		return null;
		
		
	}
	
}
public class FactoryDesigneDemo {

	public static void main(String[] args) {

		CarFactory car1 = new CarFactory();
		CarPrice price = car1.getCarPrice("BMW");
		price.getRate();
		price.calculateRate(2);
		
		
		
	}

}

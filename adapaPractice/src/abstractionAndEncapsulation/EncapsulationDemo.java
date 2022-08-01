package abstractionAndEncapsulation;

import java.util.Scanner;

class SavingAmount {
	private int savings;

	public void setInitialSaving(int amount) {

		savings = amount;

	}

	public void incrementSaving() {

		savings = savings + 1000;
	}

	public void decrementSaving() {

		savings = savings - 100;
	}

	public int getCurrentSaving() {

		return savings;
	}
	public void checkSaving() {
		
		if(savings >= 1000) {
			
			System.out.println("Congratulations! You have saved a good amount");
		}
		else if(savings >0 && savings <1000) {
			
			System.out.println("Insufficient saving!");
		}
		else if(savings<0) {
			
			System.out.println("You are in debt");
		}
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {

		SavingAmount obj = new SavingAmount();
		Scanner in = new Scanner(System.in);
		obj.setInitialSaving(in.nextInt());
		obj.decrementSaving();
		obj.incrementSaving();
		obj.checkSaving();
		System.out.println("Your current savings are Rs" + obj.getCurrentSaving());

	}

}

package inheritance;

import java.util.Scanner;

class Number {
    double x;
    double y;

    // Contructor class
    Number(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getRealPart() {
        return x;
    }

    public double getImaginaryPart() {
        return y;
    }

    public void setRealPart(double x) {
        this.x = x;
    }

    public void setImaginaryPart(double y) {
        this.y = y;
    }

    public void display() {
        System.out.println(x + "" + y);
    }
}

class Complex extends Number {
    public Complex(double x, double y) {
        super(x, y);
    }

    public void checkComplex() {
        if (y == 0) {
            System.out.println("The given number is real");
        } else {
            System.out.println("The given number is complex");
        }
    }

    public void display() {
        System.out.println(x + "" + "+" + "" + "i" + y);
    }
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double x, double y) {
        super(x, y);
    }

    public void checkPurelyImaginaryNumber() {
        if (x == 0 && y != 0) {
            display();
            System.out.println("The number is purely imaginary");
        } else {
            super.display();
            System.out.println("The number is not purely imaginary");
        }
    }

    public void setRealPartZero(double x) {
        this.x = 0;
    }

    public void display() {
        System.out.println("i" + y);
    }
}

public class NumberClass {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();
		
	}

}

package ex06.pack3;

import ex06.pack1.IVehicle;
import ex06.pack2.Car;

public class X5 extends Car {

	IVehicle start() {
		return this.new Bmw();
	}
	
	public static void main(String[] args) {
		X5 x5 = new X5();		
		x5.start().startEngine();
	}
}

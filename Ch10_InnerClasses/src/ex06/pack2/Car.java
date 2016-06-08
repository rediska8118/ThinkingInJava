package ex06.pack2;

import ex06.pack1.IVehicle;

public class Car {

	protected class Bmw implements IVehicle {

		public Bmw() {
		}

		@Override
		public void startEngine() {
			System.out.println("Bmw.startEngine()");
		}

	}
}

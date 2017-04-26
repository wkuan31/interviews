package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

Use a setter to create the Engine in Construtor in this case. 

In Spring IOC, the Engine property can be injected by a bean called GasEngine.

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine;
		
		public Car() {
			setEngine(new Exercise2.GasEngine());
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
		
		public void setEngine(GasEngine engine) {
			this.engine = engine;
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
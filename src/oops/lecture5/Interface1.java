package oops.lecture5;

interface Brake{
	void brake();
}

interface Engine{
	void start();
	void stop();
	void accelerate();
}

interface Media{
	void start();
	void stop();
}

class Car implements Brake,Engine,Media{

	@Override
	public void start() {
		System.out.println("from start()");
	}

	@Override
	public void stop() {
		System.out.println("from stop()");
	}

	@Override
	public void accelerate() {
		System.out.println("from accelerate()");
	}

	@Override
	public void brake() {
		System.out.println("from brake()");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.start();
		obj.stop();
		obj.accelerate();
		obj.brake();
	}
}

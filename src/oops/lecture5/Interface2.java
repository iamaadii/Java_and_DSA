package oops.lecture5;


class CDPlayer implements Media{

	@Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }	
}

class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerate");
    }
}

class ElecticEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate");
    }
}

class NiceCar {
    private Engine eng;
    private Media pla = new CDPlayer();

    public NiceCar() {
        eng = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.eng = engine;
    }

    public void start() {
        eng.start();
    }

    public void stop() {
        eng.stop();
    }

    public void startMusic() {
        pla.start();
    }

    public void stopMusic() {
        pla.stop();
    }
}

public class Interface2 {

	public static void main(String[] args) {
		NiceCar obj = new NiceCar();
		obj.start();
		obj.stop();
		obj.startMusic();
		obj.stopMusic();
		
		NiceCar obj1 = new NiceCar(new ElecticEngine());
		obj1.start();
		obj1.stop();
		obj1.startMusic();
		obj1.stopMusic();
	}

}

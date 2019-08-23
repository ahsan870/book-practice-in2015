package miniZoo;

public class MIniZooFinal {

	public static void main(String[] args) {
	
		Animal[] animals = new Animal[3];
		animals[0] = new Tiger(4);
		animals[1] = new Tiger(4);
		animals[2] = new Tiger(4);
		
		MiniZoo miniZoo = new MiniZoo(animals);
		        miniZoo.putThemOnSleep();

	}

}

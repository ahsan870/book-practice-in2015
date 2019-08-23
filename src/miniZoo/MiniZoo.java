package miniZoo;

public class MiniZoo {
	
	private Animal [] animals;
	public MiniZoo(Animal []animals) {
		this.animals = animals;
	}
	
	public void putThemOnSleep() {
		for (Animal animal:animals) {
			animal.sleep();
		}
	}

}

//cookie cutter - blueprint
public class VirtualPet2 {

	int hunger = 0;
	int boredome = 0;
	int energy = 0;

	public int getHunger() {
		return this.hunger;
	}

	public int getThirst() {
		return 0;
	}

	public int getBoredome() {
		return this.boredome;
	}

	public void eat() {
		this.hunger--;

	}

	public void play() {
		this.boredome--;
		this.energy = -2;
	}

	public int getEnergy() {
		return this.energy;
	}

}

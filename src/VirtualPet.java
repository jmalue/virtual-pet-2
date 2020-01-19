//cookie cutter template (blueprint)
public class VirtualPet {

	private int thirst = 0;
	private int hunger = 0;
	private int boredom=0;
	private int appearance = 0;
	private int health = 0;
	private int energy = 0;
	private String petsName = "";
	private String petDescription = "";


	public VirtualPet  (int thirst, int hunger, int bordom, int apperance, int health, int enegry, String petsName) {
		this.thirst = thirst;
		this.hunger = hunger;
 

	}



	public VirtualPet(String petsName, String petDescription) {
		// TODO Auto-generated constructor stub

	}

	public VirtualPet(int thirst, int hunger, int boredom) {//math random constructor
		this.thirst = thirst++;
		this.hunger = hunger++;
		this.boredom = boredom++;
	}



	public int getHunger() {
		// TODO Auto-generated method stub
		return 0;
	}



	public int getBoredom() {
		// TODO Auto-generated method stub
		return 0;
	}



	public int getEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}



	public void play() {
		// TODO Auto-generated method stub
		
	}



	public void eat() {
		// TODO Auto-generated method stub
		
	}



	public int getThirst() {
		// TODO Auto-generated method stub
		return 0;
	}



	public int getBoredome() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
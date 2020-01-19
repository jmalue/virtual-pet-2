import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPet2Test {
	// arrange; variable declaration. new keyword is used t create the object
	VirtualPet underTest = new VirtualPet();

	@Test
	public void hungerShouldBe0AtTheStart() {
		// act
		int result = underTest.getHunger();
		// assert
		assertEquals(0, result);
	}

	@Test
	public void thirstShouldBe0AtTheStart() {
		// act
		int result = underTest.getThirst();
		// assert
		assertEquals(0, result);
	}

	@Test
	public void boredomeShouldBe0AtTheStart() {
		// act
		int result = underTest.getBoredome();
		// assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldDecreaseBy1AfterEat() {
		// act
		int beforeEat = underTest.getHunger();
		underTest.eat();
		int result = underTest.getHunger();
		// assert
		assertEquals(beforeEat - 1, result);
	}

	@Test
	public void boredomeShouldDecreaseBy1AfterPlay() {
		// act
		int beforePlay = underTest.getBoredome();
		underTest.play();
		int result = underTest.getBoredome();
		// assert
		assertEquals(beforePlay - 1, result);
	}
	@Test
	public void energyDecreasesBy2AfterPlay() {
		//act
		int afterPlay = underTest.getEnergy();
		underTest.play();
		int result = underTest.getEnergy();
		//assert
		assertEquals(afterPlay - 2, result);
	}
	
}

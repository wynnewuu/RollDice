import java.util.Random;

public class Dice {

	Random random;
	int number;
	
	Dice(){
		random = new Random();
		roll();
	}
	
	void roll() {
		number=random.nextInt(6)+1;
		System.out.println(number);
				
	}
}

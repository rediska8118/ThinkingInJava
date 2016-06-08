package ex18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Ocean {

	public static void eat(BigFish b, LittleFish l) {
		System.out.println(b + " eats " + l);
	}

	public static void main(String[] args) {
		Random rand = new Random(47);

		Queue<LittleFish> food = new LinkedList<LittleFish>();
		Generators.fill(food, LittleFish.generator, 10);

		List<BigFish> hunters = new ArrayList<BigFish>();
		Generators.fill(hunters, BigFish.generator(), 3);

		for (LittleFish l : food)
			eat(hunters.get(rand.nextInt(hunters.size())), l);

	}
}

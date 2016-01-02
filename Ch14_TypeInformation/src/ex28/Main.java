package ex28;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

		for (int i = 0; i < 10; i++)
			priorityQueue.offer(random.nextDouble() * 100);
		System.out.println(priorityQueue);

		for (int i = 0; i < 5; i++)
			System.out.println(priorityQueue.poll() + " ");

		System.out.println(priorityQueue);

	}
}

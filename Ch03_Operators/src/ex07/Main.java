package ex07;

import java.util.Random;

/**
 * Created by aw3 on 10.01.16.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        switch (random.nextInt(2)){
            case 0:System.out.println("Heads"); break;
            case 1:System.out.println("Tails"); break;
            default: break;
        }
    }
}

package ex02;

/**
 * Created by aw3 on 10.01.16.
 */
public class Main {

    public static void main(String[] args) {

        Tank tank1 = new Tank();
        Tank tank2 = new Tank();

        System.out.println("Before assignment");
        System.out.println("tank1: " + tank2.storageTank+ ". tank2: "+tank1.storageTank);

        System.out.println("After assignment");
        tank1.storageTank = 10.01f;
        tank2.storageTank = 20.01f;

        System.out.println("tank1: " + tank2.storageTank+ ". tank2: "+tank1.storageTank);

        tank2 = tank1;
        System.out.println("After reference assignment");
        System.out.println("tank1: " + tank2.storageTank+ ". tank2: "+tank1.storageTank);


    }
}

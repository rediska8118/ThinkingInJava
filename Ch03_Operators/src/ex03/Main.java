package ex03;

import ex02.Tank;

/**
 * Created by aw3 on 10.01.16.
 */
public class Main {
    static void setStorage(Tank tank){
        tank.storageTank = 44.01f;
    }
    public static void main(String[] args) {

        Tank tank1 = new Tank();
        Tank tank2 = new Tank();

        System.out.println("Before assignment");
        System.out.println("tank1: " + tank2.storageTank+ ". tank2: "+tank1.storageTank);

        System.out.println("After assignment");
        setStorage(tank1);
        setStorage(tank2);

    }
}

package ex06;

/**
 * Created by aw3 on 10.01.16.
 */
public class Dog {
    String name;
    String says;

    public static void print(Dog dog){
        System.out.println(dog.name+" says "+ dog.says);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog1.says = "Ruff!";

        dog2.name = "Scruffy";
        dog2.says = "Wurf!";

        print(dog1);
        print(dog2);

        Dog dog3 = new Dog();
        dog3 = dog1;

        System.out.println("Compare references");

        System.out.println("dog1 & dog2 "+"== produces: "+(dog1==dog2)+"; equals produces: "+dog1.equals(dog2));
        System.out.println("dog1 & dog3 "+"== produces: "+(dog1==dog3)+"; equals produces: "+dog1.equals(dog3));
        System.out.println("dog2 & dog3 "+"== produces: "+(dog2==dog3)+"; equals produces: "+dog2.equals(dog3));

    }
}

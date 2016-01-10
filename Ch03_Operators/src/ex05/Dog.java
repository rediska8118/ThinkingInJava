package ex05;

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

    }
}

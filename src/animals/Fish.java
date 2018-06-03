package animals;

/**
 * Created by Lalu on 03.06.2018.
 */
public class Fish extends Animal {

    public Fish(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am the " + type + " so I do not talk. I am " + age + " year(s) old.");
    }
}

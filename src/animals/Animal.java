package animals;

/**
 * Created by Lalu on 03.06.2018.
 */
public abstract class Animal {

    protected String name;
    protected int age;
    protected String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void whoAmI();
}

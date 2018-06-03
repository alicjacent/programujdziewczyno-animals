import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Cookie", 3, "cat");
        Animal dog = new Dog("Barry", 5, "dog");
        Animal fish = new Fish("Goldy", 1, "fish");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(fish);

        for(Animal animal : animals) {
            animal.whoAmI();
        }
    }
}

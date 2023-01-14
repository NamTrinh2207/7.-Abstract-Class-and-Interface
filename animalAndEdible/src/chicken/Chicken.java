package chicken;

import animal.Animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "could be friend";
    }

    @Override
    public String makeSound() {
        return "chicken: cluck-cluck";
    }
}

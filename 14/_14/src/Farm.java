
import Beasts.Donkey;
import Java.Beasts.Beast;
import Pets.Cat;
import Pets.Dog;
import Pets.Pet;

import java.util.List;

public class Farm<T> {
    private static List<Donkey> animals;

    public Farm() {
        animals = new List<Animal>();
    }

    public boolean adopt(Donkey animal) {
        return animals.add(animal);
    }

    public Farm<Animal> release(Farm<Animal> animalFarm) {
        if (animals.contains(animalFarm)) {
            animals.remove(animalFarm);
            return animalFarm;
        }
        return null;
    }

    public static <A> Farm<A> create() {
        return new Farm<A>();
    }

    public static <A> boolean adopt(Farm<A> farm, Animal animal) {
        return farm.adopt(animal);
    }

    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                printCollection(Pet.class);
                break;
            case 2:
                printCollection(Beast.class);
                break;
        }
    }

    public void printCollection(Class<?> choiseClass){
        for (Donkey animal :
                animals) {
            if (choiseClass.isInstance(animal)) {
                System.out.println(animal.toString());
            }
        }
    }

    public static void printAnimals() {
        for (Donkey animal :
                animals) {
            System.out.println(animal.toString());
        }
    }

    public void adopt(Cat мася) {
    }

    public void adopt(Dog байкал) {
    }

    public void adopt(Java.Beasts.Camel горбун) {
    }
}
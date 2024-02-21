package experiment.experiment_wildcards;

import java.util.ArrayList;
import java.util.List;

public class ExperimentWildcards {

  public static void main(String[] args) {
    List<Cat> cats = new ArrayList<>();
    cats.add(new Cat());
    cats.add(new Cat());
    cats.add(new Cat());

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    dogs.add(new Dog());

    List<Pet> pets = new ArrayList<>();
    pets.add(new Pet());
    pets.add(new Pet());
    pets.add(new Pet());

    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal());
    animals.addAll(cats);
    animals.addAll(pets);
    animals.addAll(dogs);

    iterateAnimals(animals);
    System.out.println("---------------------------------------------------");
    iterateCats(animals);

  }

  public static void iterateCats(List<? super Cat> animals) {
  animals.forEach(System.out::println);
    for (Object animal : animals) {
      System.out.println(animal.toString());
    }
  }
  public static void iterateAnimals(List<? extends Animal> animals) {
    for (Animal animal : animals) {
      animal.feed();
    }
  }

}
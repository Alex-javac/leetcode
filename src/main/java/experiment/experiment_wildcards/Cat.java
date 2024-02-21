package experiment.experiment_wildcards;

public class Cat extends Pet {

  @Override
  public void call() {
    meow();
  }

  public void meow() {

    System.out.println("Cat.meow()");
  }

  @Override
  public String toString() {
    return "Cat{}";
  }
}

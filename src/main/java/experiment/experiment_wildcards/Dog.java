package experiment.experiment_wildcards;

public class Dog extends Pet{

  @Override
  public void call() {
    woof();
  }

  public void woof() {

      System.out.println("Dog.woof()");
    }

  @Override
  public String toString() {
    return "Dog{}";
  }
}

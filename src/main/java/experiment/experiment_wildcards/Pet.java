package experiment.experiment_wildcards;

public class Pet extends Animal {

  @Override
  public void feed() {
    call();
  }

  public void call() {

    System.out.println("Pet.call()");
  }

  @Override
  public String toString() {
    return "Pet{}";
  }
}

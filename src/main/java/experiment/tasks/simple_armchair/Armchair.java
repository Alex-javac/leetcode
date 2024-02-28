package experiment.tasks.simple_armchair;


import experiment.tasks.ArmchairFactory;
import experiment.tasks.Back;
import experiment.tasks.Foot;

public class Armchair implements ArmchairFactory {
  @Override
  public Back getBack() {
    return new BackImpl();
  }

  @Override
  public Foot getFoot() {
    return new FootImpl();
  }
}

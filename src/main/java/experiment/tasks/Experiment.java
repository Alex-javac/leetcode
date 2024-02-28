package experiment.tasks;

import experiment.tasks.simple_armchair.Armchair;

public class Experiment {

  public static void main(String[] args) {
    ArmchairFactory armchairFactory = new Armchair();
    Remote back = armchairFactory.getBack();
    Remote foot = armchairFactory.getFoot();
    back.decrement();
    back.increment();
    back.makeDefault();
    foot.increment();
    foot.decrement();
  }
}

package experiment.tasks.simple_armchair;

import experiment.tasks.Back;

public class BackImpl implements Back {

  @Override
  public void increment() {
    System.out.println("Спинка +1 градус");
  }

  @Override
  public void decrement() {
    System.out.println("Спинка -1 градус");
  }

  @Override
  public void makeDefault() {
    System.out.println("Сброс значений Спинки на дефолтные");
  }
}

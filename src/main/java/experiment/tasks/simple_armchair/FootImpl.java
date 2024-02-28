package experiment.tasks.simple_armchair;

import experiment.tasks.Foot;

public class FootImpl implements Foot {

  @Override
  public void increment() {
    System.out.println("Подставка для ног +1 градус");

  }

  @Override
  public void decrement() {
    System.out.println("Подставка для ног -1 градус");
  }

  @Override
  public void makeDefault() {
    System.out.println("Сброс значений Подставки на дефолтные");
  }
}

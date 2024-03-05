package experiment;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExperimentCountDownLatch {
private static int counter1= 0;
private static int counter2= 0;
  public static void main(String[] args) throws InterruptedException {
    int tasksCount =10000;
    CountDownLatch countDownLatch = new CountDownLatch(tasksCount);
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    for (int i = 0; i < tasksCount-1; i++) {
      executorService.submit(()->{
        counter1++;
        counter2++;
        countDownLatch.countDown();
      });
    }

    countDownLatch.await();

    System.out.println(counter1);
    System.out.println(counter2);
    System.exit(0);
  }

}

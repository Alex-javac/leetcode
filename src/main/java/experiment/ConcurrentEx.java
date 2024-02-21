package experiment;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ConcurrentEx {

  public static void main(String[] args)
      throws ExecutionException, InterruptedException, TimeoutException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String> future = executorService.submit(() -> {
        TimeUnit.SECONDS.sleep(10);
      return "I'm ready!";
    });

    System.out.println(future.get(5, TimeUnit.SECONDS));
  }

}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Experiment {

  public static void main(String[] args) {
    Lock lock = new ReentrantLock(true);
    TestThread pingThread = new TestThread(lock, "ping----->");
    TestThread pongThread = new TestThread(lock, "<-----pong");
    pingThread.start();
    pongThread.start();
  }
}

import java.util.concurrent.locks.Lock;

public class TestThread extends Thread {

  private final Lock lock;
  private final String str;

  public TestThread(Lock lock, String str) {
    this.lock = lock;
    this.str = str;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      print();
    }
  }

  private void print() {
    lock.lock();
    try {
      System.out.println(str);
    } finally {
      lock.unlock();
    }
  }
}

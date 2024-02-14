package experiment;


public class PingPongThread extends Thread {

  private final String str;
  private final Object monitor;

  public PingPongThread(String str, Object monitor) {
    this.str = str;
    this.monitor = monitor;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      print();
    }
  }

  private  void print() {
    synchronized (monitor) {
      try {
        monitor.notify();
        System.out.println(str);
        monitor.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}


package experiment;

public class Experiment {

  public static void main(String[] args) {
    Object monitor = new Object();
    PingPongThread pingThread = new PingPongThread("ping----->", monitor);
    PingPongThread pongThread = new PingPongThread("<-----pong", monitor);
    pingThread.start();
    pongThread.start();
  }
}

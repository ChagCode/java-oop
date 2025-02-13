package interfaces;

public class Programmer implements Worker, Driver{
  @Override
  public void drive() {
    System.out.println("Программист едет");
  }

  @Override
  public void work() {
    System.out.println("Прогрммист пишет код");
  }
}

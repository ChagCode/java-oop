package interfaces;

public class Client {

  public void toOrder(Waiter waiter, String dish) {
    waiter.bringOrder(dish);
  }
}

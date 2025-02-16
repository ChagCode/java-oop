package exceptions;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int a = 7;
    int b = 1;
    try {
      int c = a / b;
      int c1 = Integer.parseInt("BJKDbjkvqF");
    } catch (ArithmeticException e1) {
      System.out.println("На ноль делить нельзя");
    } catch (Exception e) {
      System.out.println("Поимано исключение: " + e.getClass());
    }
    System.out.println("hello");

    System.out.println("------------------------------------------------------------");

//    ArrayIndexOutOfBoundsException
    String[] strArray = {"Anna", "Igor", "Andrey"};
    for (int i = 0; i <= strArray.length; i++) {
      try {

        System.out.println(strArray[i]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Конец");
      }
    }
    System.out.println("------------------------------------------------------------");

    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      int numb1 = random.nextInt(1, 7);
      int numb2 = random.nextInt(1, 7);

      System.out.printf("Ваши числа: %s и %s%n", numb1, numb2);
    }

  }
}

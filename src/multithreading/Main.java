package multithreading;

import java.util.Random;

public class Main {
  //  static boolean isFive = false;
  static boolean timeStop = false;

  public static void main(String[] args) {
    // создание дополнительного потока
//    Thread thread = new Thread(new Runnable() {
//      @Override
//      public void run() {
//        for (int i = 0; i < 10_000_000; i++) {
//          if (i == 5) {
//            isFive = true;
//          }
//          System.out.println(i);
//          try {
//            Thread.sleep(1000);
//          } catch (InterruptedException _) {
//          }
//        }
//      }
//    });
//    thread.start();
//    Thread thread2 = new Thread(new Runnable() {
//      @Override
//      public void run() {
//        for (int i = 0; i < 10_000_000; i++) {
//          // остановим 2-ой доп.поток, когда равно 5
//          if (isFive) {
//            break;
//          }
//          System.out.println(i);
//          try {
//            Thread.sleep(1000);
//          } catch (InterruptedException _) {
//          }
//        }
//      }
//    });
//    thread2.start();
    // основной (главный) поток
//    for (int i = 0; i < 10_000_000; i++) {
//      System.out.println(2);
//    }

    int numbRandom = new Random().nextInt(1_000_000);

    Thread searchThread = new Thread(new Runnable() {
      @Override
      public void run() {
        while (!timeStop) {
          int searchNumb = new Random().nextInt(1_000_000);
//          System.out.printf("%s ?? %s%n", numbRandom, searchNumb);
          if (searchNumb == numbRandom) {
            timeStop = true;
            System.out.printf("Я угадал число -> %s%n", numbRandom);
          }
        }
      }
    });
    searchThread.start();

    Thread timerthread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i < 100_000_000; i++) {
          if (timeStop) {
            System.out.printf("Прошло секунд: %s", i);
            break;
          }
          try {
            Thread.sleep(1000);
          } catch (InterruptedException _) {
          }
        }
      }
    });
    timerthread.start();

  }
}

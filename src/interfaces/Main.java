package interfaces;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // upcast - приведение к родительскому типу (в переменную родительского тип кладем переменную дочернего)
    Cat cat = new Cat();
    Dog dog = new Dog();
    Bird bird = new Bird();
    Fish fish = new Fish();
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(cat);
    animals.add(dog);
    animals.add(bird);
    animals.add(fish);
    for (Animal animal : animals) {
      animal.eat();
    }
    System.out.println("-------------------------------------");

//    downcast - приведение к дочернему типу
    Animal animal1 = new Dog(); // upcast делается автоматически
//    Animal animal = new Cat(); метод eat() сработает, а метод run() нет!!!
    animal1.eat();
//    animal.run(); не работает
    Dog dog1 = (Dog) animal1; // downcast вручную
    dog1.run(); // все ОК!

    System.out.println("-------------------------------------");

    ArrayList<AbleToRun> animals2 = new ArrayList<>();
    animals2.add(dog);
    animals2.add(cat);
    animals2.add(bird);
//    animals2.add(bird); птица не реализует методы AbleToRun
    for (AbleToRun anim : animals2) {
      anim.run();
    }
    bird.fly(); // на выбор???
    AbleToFly ableToFly = new Bird();
    ableToFly.fly();

    System.out.println("-------------------------------------");

    Cook cook = new Cook();
    Director dir = new Director();
    Programmer prog = new Programmer();
    ArrayList<Worker> workers = new ArrayList<>();
    ArrayList<Driver> drivers = new ArrayList<>();

    workers.add(cook);
    workers.add(dir);
    workers.add(prog);

    for (Worker worker : workers) {
      worker.work();
    }

    drivers.add(cook);
    drivers.add(prog);

    for (Driver driver : drivers) {
      driver.drive();
    }




  }
}

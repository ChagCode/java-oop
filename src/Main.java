public class Main {
  // object - экземпляр класса
  public static void main(String[] args) {
    System.out.println("------------------------ Задача 1 ----------------------------");
    Box box1 = new Box(); // переменная box1 ссылается на объект Box()
//    box1.length = 10;
//    box1.height = 10;
//    box1.width = 10;
    box1.setDimens(10, 10, 10);
    double volume1 = box1.getVolume();
    System.out.println(volume1);
    box1.showVolume();
    Box box2 = new Box();
//    box2.length = 20;
//    box2.height = 20;
//    box2.width = 20;
    box2.setDimens(20, 20, 20);
    double volume2 = box2.getVolume();
    System.out.println(volume2);
    box2.showVolume();

    System.out.println("------------------------ Задача 2 ----------------------------");
    Person person1 = new Person();
    person1.name = "Ivan";
    person1.age = 49;
    person1.weight = 98.8;
    Person person2 = new Person();
    person2.name = "Andrey";
    person2.age = 21;
    person2.weight = 83.2;
    Person person3 = new Person();
    person3.name = "Mariy";
    person3.age = 25;
    person3.weight = 50;
    double sumWeight = person1.weight + person2.weight + person3.weight;
    double sumAge = person1.age + person2.age + person3.age;
    double avgWeight = sumWeight / 3;
    double avgAge = sumAge / 3;
    System.out.println("Средний вес -> " + avgWeight);
    System.out.println("Средний возраст -> " + avgAge);

    System.out.println("------------------------ Задача 3 ----------------------------");

    Dog dog = new Dog();
    dog.name = "Betman";
    dog.age = 5;
    dog.color = "black";
    dog.speed = 7;
    System.out.println(dog.getInfo());
    dog.run();
    System.out.println();

    System.out.println("------------------------ Задача 4 ----------------------------");
    Rectangle rectangle = new Rectangle();
    rectangle.setDimends(4, 5);
    System.out.println("Площать прямоугольника = " + rectangle.square());

    System.out.println("------------------------ Задача 5 ----------------------------");
    Worker nick = new Worker("Nick", "driver", 10_000);
    nick.getInfo();
  }
}

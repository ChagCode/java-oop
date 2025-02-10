import test.MyArrayList;

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
//    examples.Person person1 = new examples.Person();
//    person1.name = "Ivan";
//    person1.age = 49;
//
//    examples.Person person2 = new examples.Person();
//    person2.name = "Andrey";
//    person2.age = 21;
//
//    examples.Person person3 = new examples.Person();
//    person3.name = "Mariy";
//    person3.age = 25;
//    double sumAge = person1.age + person2.age + person3.age;
//    double avgAge = sumAge / 3;
//    System.out.println("Средний возраст -> " + avgAge);

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

    System.out.println("------------------------ Задача 6 ----------------------------");
//    MyMath math = new MyMath();
//    System.out.println(math.multiple(20));
//    System.out.println(math.multiple(20, 5));
//    System.out.println(math.multiple(0.1, 102));
    // если static, то без использования объекта и вызываем функцию напрямую
    System.out.println(MyMath.multiple(20));
    System.out.println(MyMath.multiple(20, 5));
    System.out.println(MyMath.multiple(0.1, 102));

    System.out.println("------------------------ Задача 7 ----------------------------");
    Monster monster = new Monster(5);
    monster.voice();
    monster.voice(3, "Aaaaaa");

    System.out.println("------------------------ Задача 8 ----------------------------");
    Box another = new Box(50);
    Box current = new Box(10);
    // создадим копию объекта
    Box another2 = new Box(another);
    another2.setDimens(2, 2, 2);
    int compare = current.compare(another);
    System.out.println(compare);
    System.out.println(another2.getVolume());
    // создадим копию объекта возвращаемую return
    Box copyCurrent = current.copy();
    System.out.println(copyCurrent.getVolume());
    // создадим копию в 2 раза больше
    Box doubleCurrent = current.dblCopy();
    System.out.println(doubleCurrent.getVolume());



  }
}

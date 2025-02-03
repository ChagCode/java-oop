public class Dog {
  String name;
  int age;
  String color;
  double speed;

  String getInfo() {
    return "Name: " + name + ", " + "age: " + age + ", " + "color: " + color;
  }

  void run() {
    for (int i = 0; i < speed; i++) {
      if (i < speed - 1) {
        System.out.print("Run! ");
      } else {
        System.out.print("Ruuuuuuuuun!!!");
      }
    }
  }
}
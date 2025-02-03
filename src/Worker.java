public class Worker {
  String name;
  String post;
  double salary;

  Worker (String name, String post, double salary) {
    this.name = name;
    this.post = post;
    this.salary = salary;
  }

  void getInfo() {
    System.out.println(name +  " - " + post + " - " + salary);
  }
}

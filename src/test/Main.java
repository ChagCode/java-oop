package test;
import examples.Person;

public class Main {

  public static void main(String[] args) {
    System.out.println("------------------------ Задача 1 ----------------------------");

    MyArrayList employees = getEmployees();
    employees.add("James");
    employees.remove("Emma");
    for (int i = 0; i < employees.getSize(); i++) {
      System.out.println(employees.get(i));

    }
    System.out.println("------------------------ Задача 2 ----------------------------");

    String str = "This is John. He is 27 yers old.";
    String name = str.substring(8, 12);
    String ageStr = str.substring(20, 22);
    int age = Integer.parseInt(ageStr);
    Person john = new Person(name, age);
    john.getFullName();
  }

  private static MyArrayList getEmployees() {
    MyArrayList employees = new MyArrayList();
    employees.add("John");
    employees.add("Olivia");
    employees.add("Emma");
    employees.add("Max");
    employees.add("Nick");
    return employees;
  }
}

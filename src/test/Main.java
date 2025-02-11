package test;
import examples.Person;
import inheritance.Cat;
import inheritance.Lion;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    System.out.println("------------------------ Задача 1 ----------------------------");

    ArrayList<String> employees = getEmployees();
    employees.add("James");
    employees.remove("Emma");
    for (int i = 0; i < employees.size(); i++) {
      System.out.println(employees.get(i));

    }
    System.out.println("------------------------ Задача 2 ----------------------------");

    String str = "This is John. He is 27 yers old.";
    String name = str.substring(8, 12);
    String ageStr = str.substring(20, 22);
    int age = Integer.parseInt(ageStr);
    Person john = new Person(name, age);
    john.getFullName();

    System.out.println("------------------------ Задача 3 ----------------------------");

    ArrayList<Integer> intList = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      intList.add(i);
    }
    System.out.println(intList.get(99));

    System.out.println("------------------------ Задача 4 ----------------------------");
    ArrayList<String> arrayName = getEmployees();
    ArrayList<Integer> arrayNumb = new ArrayList<>();
    ArrayList<String> arrayResult = new ArrayList<>();

    for (int i = 1; i < 6; i++) {
      arrayNumb.add(i);}

    for (int i = 0; i < arrayName.size(); i++) {
      arrayResult.add(arrayNumb.get(i) + " - " + arrayName.get(i));
    }

    System.out.println(arrayName);
    System.out.println(arrayNumb);
    for (String emp : arrayResult) {
      System.out.println(emp);
    }
    System.out.println("------------------------ Задача 5 ----------------------------");
    Cat cat1 = new Cat();
    Lion lion1 = new Lion();
    System.out.println(cat1.isCanEatPerson());
    System.out.println(lion1.isCanEatPerson());
    cat1.eat();
    lion1.eat();


  }

  private static ArrayList<String> getEmployees() {
    ArrayList<String> employees = new ArrayList<>();
    employees.add("John");
    employees.add("Olivia");
    employees.add("Emma");
    employees.add("Max");
    employees.add("Nick");
    return employees;
  }
}

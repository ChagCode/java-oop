package interfaces;

public class Director implements Worker{
  @Override
  public void work() {
    System.out.println("Директор контролирует");
  }

  public void giveMany(Salary salary) {
    salary.giveSalary();;
  }

}

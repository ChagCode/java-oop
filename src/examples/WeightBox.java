package examples;

public class WeightBox extends Box {
  // добавить поле вес
  // в родит классе метод showInfo выводит д/ш/в, а в дочернем еще и вес
  private double weight;

  public WeightBox() {
    this.weight = 10;
  }

  public WeightBox(double size, double weight) {
    super(size);
    this.weight = weight;
  }

  public WeightBox(double length, double width, double height, double weight) {
    super(length, width, height);
    this.weight = weight;
  }

  public WeightBox(Box another, double weight) {
    super(another);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println("weight " + weight);
  }


}

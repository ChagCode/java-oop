public class Box {
  // class - шаблон, на который ссылается объет
  private double length;
  private double width;
  private double height;

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Box(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public Box() {
    this(10);
  }

  public Box(double size) {
    this(size, size, size);
  }

  public Box(Box another) {
    this(another.length, another.width, another.height);
  }

  public Box copy() {
    return new Box(this.length, this.width, this.height);
  }

  public Box dblCopy() {
    return new Box(this.length * 1.26, this.width * 1.26, this.height * 1.26);
  }


  public double getVolume() {
    return length * width * height;
  }

  public void showVolume() {
    System.out.println("length " + length + " width " + width + " height " + height);
  }

  public void setDimens(double length, double width, double height) {
    // обращаемся к переменной экземпляра через this
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public int compare(Box another) {
    double currentVolume = getVolume();
    double anotherVolume = another.getVolume();

    if (currentVolume > anotherVolume) {
      return 1;
    } else if (currentVolume < anotherVolume) {
      return -1;
    } else {
      return 0;
    }
  }
}

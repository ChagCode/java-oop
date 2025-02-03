public class Box {
  // class - шаблон, на который ссылается объет
  double length;
  double width;
  double height;
  double getVolume() {
    return length * width * height;
  }
  void showVolume() {
    System.out.println("length " + length + " width " + width + " height " + height);
  }
}

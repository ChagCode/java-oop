package inheritance;

public class CatFamily {
  protected int legs;
  protected int eyes;
  protected boolean canEatPerson;

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public int getEyes() {
    return eyes;
  }

  public void setEyes(int eyes) {
    this.eyes = eyes;
  }

  public boolean isCanEatPerson() {
    return canEatPerson;
  }

  public void setCanEatPerson(boolean canEatPerson) {
    this.canEatPerson = canEatPerson;
  }

  public CatFamily(int legs, int eyes, boolean canEatPerson) {
    this.legs = legs;
    this.eyes = eyes;
    this.canEatPerson = canEatPerson;
  }

  public void eat() {
    System.out.print("Кушаю что-то... - ");
  }
}

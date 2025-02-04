public class Monster {
  int numberHands;
  int numberEyes;
  int numberLegs;

  Monster() {
    this(2);
  }

  Monster(int number) {
    this(number, number, number);
  }

  Monster(int numberHands, int numberEyes, int numberLegs) {
    this.numberHands = numberHands;
    this.numberLegs = numberLegs;
    this.numberEyes = numberEyes;
  }

  void voice() {
    voice(1);
  }
  void voice(int count) {
    voice(count, "Grrrrrrrrrr!!!");
    }

  void voice(int count, String word) {
    for (int i = 0; i < count; i++) {
      System.out.println(word);
    }
  }
}

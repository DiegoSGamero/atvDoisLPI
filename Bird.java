public class Bird implements Animal {
  private String featherColor;
  private double wingspan;
  private String beakType;

  public Bird(String featherColor, double wingspan, String beakType) {
      this.featherColor = featherColor;
      this.wingspan = wingspan;
      this.beakType = beakType;
  }

  @Override
  public String makeSound() {
      return "Chirp!";
  }

  @Override
  public void move() {
      System.out.println("Flying...");
  }

  @Override
  public void feed() {
      System.out.println("Eating worms...");
  }
}

class Main {
  public static void main(String[] args) {
      Bird bird = new Bird("Blue", 1.5, "Pointed");
      System.out.println("Sound: " + bird.makeSound());
      bird.move();
      bird.feed();
  }
}

public class Feline implements Animal {
  private String species;
  private String furColor;
  private double maxSpeed;

  public Feline(String species, String furColor, double maxSpeed) {
      this.species = species;
      this.furColor = furColor;
      this.maxSpeed = maxSpeed;
  }

  @Override
  public String makeSound() {
      return "Roar!";
  }

  @Override
  public void move() {
      System.out.println("Running...");
  }

  @Override
  public void feed() {
      System.out.println("Eating meat...");
  }
}
